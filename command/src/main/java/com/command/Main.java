package com.command;

import com.command.commands.ACCommand;
import com.command.commands.LightCommand;
import com.command.commands.RemoteControl;
import com.command.items.AC;
import com.command.items.Light;

public class Main {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl();
		LightCommand lc = new LightCommand(new Light());
		ACCommand acc = new ACCommand(new AC());

		rc.setCommand(lc);
		rc.setCommand(acc);
		rc.execute();
	}
}