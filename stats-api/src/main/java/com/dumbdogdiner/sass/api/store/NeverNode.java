package com.dumbdogdiner.sass.api.store;

import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This class is never instantiated. This should be used to create node types with no children.
 */
public final class NeverNode implements Node<NeverNode> {
    private NeverNode() {}

    @Override
    public @NotNull String getIdentifier() {
        throw new IllegalStateException();
    }

    @Override
    public @NotNull JavaPlugin getPlugin() {
        throw new IllegalStateException();
    }

    @Override
    public @NotNull Node<?> getParent() {
        throw new IllegalStateException();
    }

    @Override
    public @NotNull NeverNode[] getChildren() {
        throw new IllegalStateException();
    }

    @Override
    public @Nullable NeverNode get(@NotNull String id) {
        throw new IllegalStateException();
    }
}
