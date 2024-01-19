package com.oracle.jdbc.dev.rsi;

import java.util.concurrent.ThreadLocalRandom;

public class RsiHelper {
	
	public static int randomize() {
		return ThreadLocalRandom.current().nextInt();
	}

}
