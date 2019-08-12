package com.study.soulx.design_patterns.my_code.chapter_2.Observer;

import java.util.Observable;

/**
 * @program: java-base
 * @description: 天气主题
 * java自带的 可以使用push 或拉 比自己写好
 *   @see  Observable [可观察者，java自己实现的可以追踪所有观察者，
 *   可以追踪所有观察者
 *   两种方式不带参数的通知时拉模式
 *   带参数是push
 * @author: soulx
 * @create: 2019-08-12 17:35
 **/
public class WeatherData  extends Observable{
    private float temperature;
    private float humidity;
    private float pressure;
    /**
    * @Description:  通知所有
    * @Author: soulx
    */
    public void measurementsChanged() {
        //更加灵活，可以设定那些通知，以防只发生一丝丝的变化就通知，信息量太大。
        setChanged();
        notifyObservers();
    }
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
     /**
     * @Description: 为了使用拉方法，设置get
     * @Author: soulx
     */
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
