package ca.junctionbox.velodrome;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import com.yammer.dropwizard.db.DatabaseConfiguration;
import com.yammer.dropwizard.migrations.MigrationsBundle;

/**
 *
 */
public class VelodromeService extends Service<VelodromeConfiguration> {
    /**
     *
     * @param args Arguments and stuff.
     * @throws Exception stuff.
     */
    public static void main(final String [] args) throws Exception {
        new VelodromeService().run(args);
    }

    /**
     *
     * @param bootstrap bootstraps and stuff.
     */
    @Override
    public final void initialize(
            final Bootstrap<VelodromeConfiguration> bootstrap) {
        bootstrap.setName("velodrome");
        bootstrap.addBundle(new MigrationsBundle<VelodromeConfiguration>() {
            @Override
            public DatabaseConfiguration getDatabaseConfiguration(
                    final VelodromeConfiguration configuration) {
                return configuration.getDatabaseConfiguration();
            }
        });
    }

    @Override
    public void run(final VelodromeConfiguration configuration,
                    final Environment environment) throws Exception {

    }
}
