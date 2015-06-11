package com.vaadin.components.gwt.polymer.client.webapi;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface Document extends Node {
    EventTarget getElementById(String id);
    <T> T createElement(String tag);
    @JsProperty HTMLElement getHead();
    @JsProperty HTMLElement getBody();
}