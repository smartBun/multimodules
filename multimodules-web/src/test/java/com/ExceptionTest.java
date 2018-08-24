package com;

import java.io.IOException;
import java.util.function.IntConsumer;

public class ExceptionTest extends Throwable {

	public static void main(String[] args) throws Exception {
		IntConsumer aNew = int[]::new;

		try{
			throw new Exception("1");
		}catch (IOException e){
			throw new Exception("2");
		}catch (Exception e) {
			throw new Exception("3");
		}finally {
			throw new Exception("4");
		}
	}
}
