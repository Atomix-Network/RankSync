package com.gmail.chickenpowerrr.ranksync.spigot.listener.spigot;

import com.gmail.chickenpowerrr.ranksync.spigot.RankSyncPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * This class updates a player's ranks when it quits the server
 *
 * @author Chickenpowerrr
 * @since 1.0.0
 */
public class PlayerQuitEventListener implements Listener {

  private final RankSyncPlugin rankSyncPlugin = JavaPlugin.getPlugin(RankSyncPlugin.class);

  /**
   * Updates a player's ranks when it quits the server
   *
   * @param event the event that triggered the method
   */
  @EventHandler
  public void onQuit(PlayerQuitEvent event) {
    this.rankSyncPlugin.getLinkHelper().updateRanks(event.getPlayer().getUniqueId());
  }
}
