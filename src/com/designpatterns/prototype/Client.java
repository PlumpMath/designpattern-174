package com.designpatterns.prototype;

import java.util.Random;


public class Client {
	private static int MaxCount =6;

	public static void main(String[] args) {
		Mail mail = new Mail(new AdvTemplete());
		mail.setTail("XXX银行版权所有！");
		for (int i = 0; i < MaxCount; i++) {
			Mail cloneMail = mail.clone();
			cloneMail.setReceiver(getRandString(5)+"@"+getRandString(8)+".com");
			cloneMail.setAppellation(getRandString(5)+"先生（女士）");
			sendMail(cloneMail);
		}

	}

	private static void sendMail(Mail cloneMail) {
		System.out.println("标题："+cloneMail.getSubject()+"\t收件人："+cloneMail.getReceiver()+"\t...发送成功");
	}

	private static String getRandString(int i) {
		String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int len = s.length();
		Random r =new Random();
		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < i; j++) {
			sb.append(s.charAt(r.nextInt(len)));
		}
		return sb.toString();
	}

}
