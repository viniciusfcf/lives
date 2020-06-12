package com.github.viniciusfcf;

import java.util.Arrays;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class MeuMain implements QuarkusApplication{

	@Override
	public int run(String... args) throws Exception {
        System.out.println("MeuMain.run() "+Arrays.toString(args));
        Quarkus.waitForExit();
		return 0;
	}
    
}