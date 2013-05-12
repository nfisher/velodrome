package ca.junctionbox.velodrome;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yammer.dropwizard.config.Configuration;
import com.yammer.dropwizard.db.DatabaseConfiguration;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/** VelodromeConfiguration encapsulates the configuration specifieid in the
 * YAML configuration file.
 *
 */
public class VelodromeConfiguration extends Configuration {
    /**
     *
     */
    @Valid
    @NotNull
    @JsonProperty
    private DatabaseConfiguration database;

    /**
     *
     * @return DatabaseConfiguration - database configuration settings from
     *                                 the YAML config.
     */
    public final DatabaseConfiguration getDatabaseConfiguration() {
        return database;
    }
}
