package com.study.soulx.design_patterns.offcial.headfirsts.designpatterns.adapter.ducks.challenge;

import com.study.soulx.design_patterns.offcial.headfirsts.designpatterns.adapter.ducks.Duck;

public class DroneAdapter implements Duck {
	Drone drone;
 
	public DroneAdapter(Drone drone) {
		this.drone = drone;
	}
    
	public void quack() {
		drone.beep();
	}
  
	public void fly() {
		drone.spin_rotors();
		drone.take_off();
	}
}
