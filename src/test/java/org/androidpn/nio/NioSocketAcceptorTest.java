package org.androidpn.nio;

import java.net.InetSocketAddress;

import org.apache.mina.transport.socket.nio.NioSocketAcceptor;
import org.junit.Test;


public class NioSocketAcceptorTest {
	
	@Test
	public void testNioSocketAcceptor(){
		NioSocketAcceptor nio = new NioSocketAcceptor();
		InetSocketAddress isa = new InetSocketAddress(5222);
		nio.setDefaultLocalAddress(isa);
		
	}
}
