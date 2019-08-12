package com.study.soulx.design_patterns.my_code.chapter_2.Observer;

import com.study.soulx.design_patterns.offcial.headfirsts.designpatterns.observer.weather.Subject;

import java.util.Observable;
import java.util.Observer;

/**
 * @program: javabase
 * @description: 观察者
 * java自带的 可以使用push 或拉 比自己写好
 * @see  Observable [可观察者，java自己实现的可以追踪所有观察者
 * ，且 被主题继承。 由于继承的局限性，可以根据业务实现自己的模式。
 * ]
 * @author: soulx
 * @create: 2019-08-12 20:15
 **/
public class MyObservable implements Observer {
    private float temperature;
    private float humidity;
    private Observable weatherData;

    public MyObservable(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
      if(o instanceof WeatherData){
          WeatherData weatherData = (WeatherData) o;
          this.humidity = weatherData.getHumidity();
      }
    }
}
