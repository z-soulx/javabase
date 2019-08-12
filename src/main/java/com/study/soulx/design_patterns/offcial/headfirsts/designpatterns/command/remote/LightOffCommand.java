package com.study.soulx.design_patterns.offcial.headfirsts.designpatterns.command.remote;

public class LightOffCommand implements Command {
	Light light;
 
	public LightOffCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.off();
	}
}
