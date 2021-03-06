package net.jurinson.jmemcached.client.impl;

import net.jurinson.jmemcached.protocol.impl.DefaultObjectSerializer;
import net.jurinson.jmemcached.protocol.impl.DefaultRequestConverter;
import net.jurinson.jmemcached.protocol.impl.DefaultResponseConverter;
import org.junit.Test;

import static org.junit.Assert.*;

public class DefaultClientConfigTest {

    private final DefaultClientConfig defaultClientConfig = new DefaultClientConfig("localhost", 9010);

    @Test
    public void getHost() {
        assertEquals("localhost", defaultClientConfig.getHost());
    }

    @Test
    public void getPort() {
        assertEquals(9010, defaultClientConfig.getPort());
    }

    @Test
    public void getRequestConverter() {
        assertEquals(DefaultRequestConverter.class, defaultClientConfig.getRequestConverter().getClass());
    }

    @Test
    public void getResponseConverter() {
        assertEquals(DefaultResponseConverter.class, defaultClientConfig.getResponseConverter().getClass());
    }

    @Test
    public void getObjectSerializer() {
        assertEquals(DefaultObjectSerializer.class, defaultClientConfig.getObjectSerializer().getClass());
    }

}