package io.swagger.client.model;

import io.swagger.client.model.PeriodType;
import io.swagger.client.model.DurationFieldType;
import java.util.*;
import java.util.List;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Period  {
  
  private Integer hours = null;
  private Integer minutes = null;
  private Integer seconds = null;
  private Integer millis = null;
  private Integer months = null;
  private Integer years = null;
  private Integer days = null;
  private Integer weeks = null;
  private PeriodType periodType = null;
  private List<Integer> values = new ArrayList<Integer>() ;
  private List<DurationFieldType> fieldTypes = new ArrayList<DurationFieldType>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("hours")
  public Integer getHours() {
    return hours;
  }
  public void setHours(Integer hours) {
    this.hours = hours;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("minutes")
  public Integer getMinutes() {
    return minutes;
  }
  public void setMinutes(Integer minutes) {
    this.minutes = minutes;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("seconds")
  public Integer getSeconds() {
    return seconds;
  }
  public void setSeconds(Integer seconds) {
    this.seconds = seconds;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("millis")
  public Integer getMillis() {
    return millis;
  }
  public void setMillis(Integer millis) {
    this.millis = millis;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("months")
  public Integer getMonths() {
    return months;
  }
  public void setMonths(Integer months) {
    this.months = months;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("years")
  public Integer getYears() {
    return years;
  }
  public void setYears(Integer years) {
    this.years = years;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("days")
  public Integer getDays() {
    return days;
  }
  public void setDays(Integer days) {
    this.days = days;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("weeks")
  public Integer getWeeks() {
    return weeks;
  }
  public void setWeeks(Integer weeks) {
    this.weeks = weeks;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("periodType")
  public PeriodType getPeriodType() {
    return periodType;
  }
  public void setPeriodType(PeriodType periodType) {
    this.periodType = periodType;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("values")
  public List<Integer> getValues() {
    return values;
  }
  public void setValues(List<Integer> values) {
    this.values = values;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("fieldTypes")
  public List<DurationFieldType> getFieldTypes() {
    return fieldTypes;
  }
  public void setFieldTypes(List<DurationFieldType> fieldTypes) {
    this.fieldTypes = fieldTypes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Period {\n");
    
    sb.append("  hours: ").append(hours).append("\n");
    sb.append("  minutes: ").append(minutes).append("\n");
    sb.append("  seconds: ").append(seconds).append("\n");
    sb.append("  millis: ").append(millis).append("\n");
    sb.append("  months: ").append(months).append("\n");
    sb.append("  years: ").append(years).append("\n");
    sb.append("  days: ").append(days).append("\n");
    sb.append("  weeks: ").append(weeks).append("\n");
    sb.append("  periodType: ").append(periodType).append("\n");
    sb.append("  values: ").append(values).append("\n");
    sb.append("  fieldTypes: ").append(fieldTypes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
