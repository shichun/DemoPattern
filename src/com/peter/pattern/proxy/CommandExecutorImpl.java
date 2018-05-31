package com.peter.pattern.proxy;

public class CommandExecutorImpl implements CommandExecutor {

	public void runCommand(String cmd) throws Exception {
		Runtime.getRuntime().exec(cmd);
		System.out.println("'" + cmd + "' command executed."); 
	}

}
