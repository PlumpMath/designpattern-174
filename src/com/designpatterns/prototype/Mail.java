package com.designpatterns.prototype;

public class Mail implements Cloneable {
	private String receiver;
	private String subject;
	private String appellation;
	private String context;
	private String tail;

	public Mail(AdvTemplete advTemplete) {
		this.context = advTemplete.getAdvContext();
		this.subject = advTemplete.getAdvSubject();
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getAppellation() {
		return appellation;
	}

	public String getSubject() {
		return subject;
	}

	public String getContext() {
		return context;
	}

	public void setAppellation(String appellation) {
		this.appellation = appellation;
	}

	public String getTail() {
		return tail;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}

	@Override
	public Mail clone() {
		Mail mail = null;
		try {
			mail = (Mail) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return mail;
	}
}
