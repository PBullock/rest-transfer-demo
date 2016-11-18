package demo;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import org.glassfish.jersey.client.JerseyClientBuilder;

import demo.client.DemoClient;

import javax.ws.rs.client.Client;

public class DemoApp extends Application<DemoConf>
{

    public static void main(String[] args) throws Exception
    {
        new DemoApp().run(args);
    }

    @Override
    public void run(final DemoConf DemoConf, final Environment environment)
    {
        final Client client = setupClient(environment);
        environment.jersey().register(new DemoClient(client));
    }

    private Client setupClient(Environment environment)
    {
        return new JerseyClientBuilder(environment).build("REST Client");

    }
}
