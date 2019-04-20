package com.gmail.chickenpowerrr.ranksync.api.rank;

import com.gmail.chickenpowerrr.ranksync.api.bot.Bot;
import java.util.Collection;

/**
 * This interface manages all of the data that a Developer will probably need to synchronize the
 * ranks between multiple services
 *
 * @param <R> the Rank class used by the platform API, not the RankSync API
 * @author Chickenpowerrr
 * @since 1.0.0
 */
public interface RankFactory<R> {

  /**
   * Turns an internally used role into a role that is supported by the RankSync API
   *
   * @param internalRole the Rank object used by the platform API, not the RankSync API
   * @return the RankSync representation of the Role
   */
  Rank getRankFromRole(R internalRole);

  /**
   * Turns internally used roles into roles that are supported by the RankSync API
   *
   * @param internalRoles the Rank objects used by the platform API, not the RankSync API
   * @return the RankSync representations of the Roles
   */
  Collection<Rank> getRanksFromRoles(Collection<R> internalRoles);

  /**
   * Returns the internally used role by its name
   *
   * @param string the name of the role
   * @return the Rank object used by the platform API, not the RankSync API
   */
  R getRoleFromName(String string);

  /**
   * Returns the internally used roles by their names
   *
   * @param strings the names of the roles
   * @return the Rank objects used by the platform API, not the RankSync API
   */
  Collection<R> getRolesFromNames(Collection<String> strings);

  /**
   * Turns the role supported by the RankSync API back into the role that is internally used by the
   * used API
   *
   * @param rank the rank that can by used by the RankSync API
   * @return the internally used role
   */
  R getRoleFromRank(Rank rank);

  /**
   * Turns the roles supported by the RankSync API back into the roles that are internally used by
   * the used API
   *
   * @param ranks the ranks that can by used by the RankSync API
   * @return the internally used roles
   */
  Collection<R> getRolesFromRanks(Collection<Rank> ranks);

  /**
   * Returns the Bot that uses this factory
   */
  Bot<?, R> getBot();
}