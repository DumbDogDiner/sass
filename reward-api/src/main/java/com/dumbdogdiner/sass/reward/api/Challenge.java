/*
 * Copyright (c) 2021 DumbDogDiner <dumbdogdiner.com>. All rights reserved.
 * Licensed under the MIT license, see LICENSE for more information.
 */
package com.dumbdogdiner.sass.reward.api;

import java.util.UUID;
import java.util.function.Predicate;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a challenge. Challenges are goals that a player may pursue. They contain various attributes that allow
 * players to choose challenges to complete, track their progress, and anticipate rewards.
 */
public interface Challenge {
    /**
     * @return The store this challenge belongs to.
     */
    @NotNull
    ChallengeStore getChallengeStore();

    /**
     * @return The identifier for this challenge.
     */
    @NotNull
    String getIdentifier();

    /**
     * @return The friendly name of this challenge.
     */
    @NotNull
    String getName();

    /**
     * @param value The new friendly name of this challenge.
     */
    void setName(@NotNull String value);

    /**
     * @return The function that determines if a given player may see this challenge.
     */
    @NotNull
    Predicate<UUID> getVisibility();

    /**
     * @param value The new function that determines if a given player may see this challenge.
     */
    void setVisibility(@NotNull Predicate<UUID> value);

    /**
     * Delete this challenge. Further use of this object is invalid.
     */
    void delete();
}
