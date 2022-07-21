package it.fedet.autofeedlite;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;

public class Events implements Listener {
    @EventHandler
    public void onEat(PlayerItemConsumeEvent event) {
        Player player = event.getPlayer();
        ItemStack item = event.getItem();

        if (!item.getType().isEdible()) return;

        autoConsume(player, item);
        event.setCancelled(true);
    }

    private void autoConsume(Player player, ItemStack item) {
        if (player.getFoodLevel() >= 20) return;
        ItemStack itemInHand = player.getItemInHand();
        if (itemInHand.getAmount() <= 0) return;

        player.setFoodLevel(player.getFoodLevel() + Foods.valueOf(item.getType().toString()).getSaturation());

        if ((itemInHand.getAmount() - 1 > 0)) itemInHand.setAmount(itemInHand.getAmount() - 1);
        else player.setItemInHand(null);

        player.updateInventory();
        autoConsume(player, item);
    }
}
