package it.fedet.autofeedlite;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Foods {
    BREAD(5),
    CARROT_ITEM(3),
    BAKED_POTATO(5),
    POTATO_ITEM(1),
    POISONOUS_POTA(2),
    GOLDEN_CARROT(6),
    PUMPKIN_PIE(8),
    COOKIE(2),
    MELON(2),
    MUSHROOM_SOUP(6),
    RAW_CHICKEN(3),
    COOKED_CHICKEN(5),
    RAW_BEEF(3),
    COOKED_BEEF(8),
    RAW_FISH(2),
    COOKED_FISH(6),
    PORK(3),
    GRILLED_PORK(8),
    APPLE(4),
    GOLDEN_APPLE(4),
    ROTTEN_FLESH(4),
    SPIDER_EYE(2),
    RABBIT(3),
    COOKED_RABBIT(5),
    RABBIT_STEW(10),
    MUTTON(2),
    COOKED_MUTTON(6);

    @Getter private final int saturation;
}
