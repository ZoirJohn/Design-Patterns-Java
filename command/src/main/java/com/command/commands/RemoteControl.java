package com.command.commands;

import java.util.Arrays;

public class RemoteControl implements Command {
	private Command[] commands;

	public RemoteControl() {
		this.commands = new Command[8];
	}

	public void setCommand(Command command) {
		for (int i = 0; i < this.commands.length; i++) {
			if (this.commands[i] == null) {
				this.commands[i] = command;
				break;
			}
		}
	}

	@Override
	public void execute() {
		for (Command command : commands) {
			if (command != null) {
				command.execute();
			}

		}
	}

	public String getState() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < commands.length; i++) {
			if (commands[i] != null) {
				sb.append(commands[i].getState());
				if (i != commands.length - 1) {
					sb.append("\n");
				}
			}
		}
		return sb.toString();
	}

	@Override
	public String toString() {
		return Arrays.toString(this.commands);
	}
}
