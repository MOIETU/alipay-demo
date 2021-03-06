package com.nantian.demo.utils;

public class AlipayConfig {

	/**
	 * APPID 即创建应用后生成
	 */
	public static String app_id = "2021001158603435";

	/**
	 * 商户私钥，您的PKCS8格式RSA2私钥
	 */
	public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQClJRS1JajeEX2yIsk3byPayg8kaj9KJ3vzbEVoi8LLW568zqm2Ut9S8Lia8kp2ohPWUCjJhrxc5kXvuDRsxopOmtu0NXtZ0PF8lE6GldbnTKuX+5wbyZ42u0xgOFuSpVV95KhXYWLmuitUaluqpuYL7Zl+ltj22s/hR/Ybyxy60eXfFzm4dx4caank9qmmIypiz3YOYXgfT4eA+g4/0z3s94T9O/Hxw781M/ZBFThLeqamfqvfE2IKpsiGJRc95q2bXWS9iDaKOpl2t4V/jFtrlBv9Tm16C4LkaTr7/5WnzmNrXtRwP6CJYRc2MMY+5TRd8xfPs7lefLU5VuiCLjX1AgMBAAECggEAJb14owEtOzqiEBCVDV8PwZNFrJu/RPILCJEot4ChDposh5du/2Sm9qxec8KFM+FMSUDeYVeyOkTBnMvq5yTkPJx1MxS50MfIOCEoZOdfSlKiMERm447K4lUhWifm/XddNz0HH5j44iOPfWYk9rXXgshUuLI+eQN+WEx6uNVNBoBLVvnL6oxZCMXyLf7HK4CgWhJo/9FiYvtyCQ5tlmoBkqDZ5SeSJ/GJ36ZbIAJxtPlGN24/NIiypQpbJ1qGex7dEOKJHeqlHbQHWNJa6f4zhyKHLgntl+s7QWaOhf8GdwrngN7STznxzhHlHDZmXl1QJ85qGRw3cTz/sji5yFQCbQKBgQD9BZ5NedyBvwXzAzXbWVigjP2bcFXOKagWx/PyggJDtzX7Oj7KNbWzTtxnk7h68qjYGj0N6vx4YisQ/6ByllRWgc0qqI2YzkbnCQzXeCj/p1f38Tou5ew9HeeAjQFJ1TH3mCJiYjaBHncBMAhV48hBaqGeKmcW0+VXgMirIyjl6wKBgQCnFq37IGV1hxixzmecxvC59PMvEcH9eBe5Hp2xrtDS4rHJYZpRozUBGAbvIESXnacjxyrjw7fj775TE1oRUe4xtHdBELFWo5M087+SYjwatI9PMm8DjzyRF8ldpNxXg1hUuCwrh1+ldbAjWssM8qE4zpfQYhFUjk9a3NYqno77nwKBgQCi8WRR5qGP2NHe/vlHClHeCw4jdQN9IiyCh0Bds0X8D9eus4LOPCqIj8e22FXcr7r2eGdLOEJg0G+FoenVAWTM1QioaSXO+0CD9rsTY+mbQkyPewUKQL2TWlfE3Imw36AvIAU8sJ0DJ/hhhmpHzcof/qiYMBx1gf5XDLOuKpVjAwKBgF9a4RVU6rIE1EH80kK1ggIN2Y6+KqBVnexGnaYeZwxC1UVhDymR45jpNmPXXW3NSepwKnjrZBGP62ULwTXrNO1m2Tvno90W4tawWF7Y8wYmjzaaSKKWZvFCyudHQ3wp+An5RTPeQOZzYH78vK559SovNJJ2tP81a/Il349ZB65vAoGBAJZ2AGAwBnyhoz5XIh8MRMfwy7V3VJjd0aBaM4o4VZsylteRvIpXIFdLq6MEvdMdstlY+AxAzO9jUmFMluLq7P0/r2W9JBvxWtR2XR7BWeMY/qe9EHJEV9h2bjIW9gX/M53XyCijGMoXgeqG6WAsc+w56lpglLhl2/QdTp3zyu/g";

	/**
	 * 支付宝公钥，由支付宝生成
	 */
	public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAx3kaFSGY1EGLPnGUOFYHfOMNSucXizlVWyldJyBJGrqSTN3KX2/p0PeYNRQed1UCT8u87sgI7np7ad4XNyz19F37f/zweQ/NZWn54eukC0oPRG4UGKBehJo5jwZlFJBpF9fJRCLgAONdRiclsPoDsNcax0IN+nCLHN8YGyiGgglSWlo1MiHWxhxrOHXHnLOrEj8W9i3tpVonJH0AmumkuU8+HX5tteAKqE7R+VZkau0tTsjfG49x9+Gcj89vOGydE3O8F5GTaVFp6BdHOdR2R25HTv2CnjBNno6nGnrE9HMq4OPfCWnF4YYDOTe4JNBS/LihZgVfBzvSlY+3fG0TjwIDAQAB";

	/**
	 * 支付宝回调通知
	 */
	public static String notify_url = "http://localhost:8088/alipay/notifyUrl";

	/**
	 * 支付宝回调跳转URL
	 */
	public static String return_url = "http://localhost:8088/alipay/returnUrl";

	/**
	 * 签名方式
	 */
	public static String sign_type = "RSA2";

	/**
	 * 字符编码格式
	 */
	public static String charset = "utf-8";

	/**
	 * 支付宝网关
	 */
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

	/**
	 * 日志打印路径
	 */
	public static String log_path = "D:\\";

}
