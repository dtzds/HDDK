package com.hddk.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Activity {
    private Integer a_id;//活动id
    private String theme;//活动主题
    private Double score;//思政分
    private String description;//活动描述
    private String tips;//注意事项
    private Integer releaseState;//活动发布方式:'0':直接发布,'1':定时发布
    private String releaseTime;//活动发布时间
    private String signUpStartTime;//报名开始时间
    private String signUpEndTime;//报名结束时间
    private String startTime;//活动开始时间
    private String endTime;//活动结束时间
    private Integer signInState;//活动签到状态?'0':签到未开始,'1':正在签到
    private Integer a_state;//活动状态?'0':草稿,"1":发布,'2':报名中,'3':报名结束,'4':正在进行,'5':结束
    private List<Field> fields;//场地
    private Integer signInTimes;//签到次数

    public Activity() {
    }

    public Activity(Integer a_id, String theme, Double score, String description, String tips, Integer releaseState, String releaseTime, String signUpStartTime, String signUpEndTime, String startTime, String endTime, Integer signInState, Integer a_state, List<Field> fields, Integer signInTimes) {
        this.a_id = a_id;
        this.theme = theme;
        this.score = score;
        this.description = description;
        this.tips = tips;
        this.releaseState = releaseState;
        this.releaseTime = releaseTime;
        this.signUpStartTime = signUpStartTime;
        this.signUpEndTime = signUpEndTime;
        this.startTime = startTime;
        this.endTime = endTime;
        this.signInState = signInState;
        this.a_state = a_state;
        this.fields = fields;
        this.signInTimes = signInTimes;
    }

    public Activity(String theme, Double score, String description, String tips, Integer releaseState, String releaseTime, String signUpStartTime, String signUpEndTime, String startTime, String endTime) {
        this.theme = theme;
        this.score = score;
        this.description = description;
        this.tips = tips;
        this.releaseState = releaseState;
        this.releaseTime = releaseTime;
        this.signUpStartTime = signUpStartTime;
        this.signUpEndTime = signUpEndTime;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Integer getA_id() {
        return a_id;
    }

    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public Integer getReleaseState() {
        return releaseState;
    }

    public void setReleaseState(Integer releaseState) {
        this.releaseState = releaseState;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getSignUpStartTime() {
        return signUpStartTime;
    }

    public void setSignUpStartTime(String signUpStartTime) {
        this.signUpStartTime = signUpStartTime;
    }

    public String getSignUpEndTime() {
        return signUpEndTime;
    }

    public void setSignUpEndTime(String signUpEndTime) {
        this.signUpEndTime = signUpEndTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getSignInState() {
        return signInState;
    }

    public void setSignInState(Integer signInState) {
        this.signInState = signInState;
    }

    public Integer getA_state() {
        return a_state;
    }

    public void setA_state(Integer a_state) {
        this.a_state = a_state;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public Integer getSignInTimes() {
        return signInTimes;
    }

    public void setSignInTimes(Integer signInTimes) {
        this.signInTimes = signInTimes;
    }
}
