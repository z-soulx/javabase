package com.study.soulx.design_patterns.offcial.headfirsts.designpatterns.combined.djview;
  
public class DJTestDrive {

    public static void main (String[] args) {
        BeatModelInterface model = new BeatModel();
		ControllerInterface controller = new BeatController(model);
    }
}
