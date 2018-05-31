package com.wj.recyclerview;

/**
 * Created by Hannah on 2018/5/31.
 */

public class DataShowBean {
  private String path;
  private String text;

  public DataShowBean(String path, String text) {
    this.path = path;
    this.text = text;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
