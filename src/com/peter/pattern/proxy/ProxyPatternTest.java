package com.peter.pattern.proxy;

public class ProxyPatternTest {
	public static void main(String[] args) throws Exception{
		CommandExecutor executor = new CommandExecutorProxy("Pankaj", "J@urnalD$v");
		executor.runCommand("cd cmd");
	}
}
