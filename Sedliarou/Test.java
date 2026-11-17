package com.example;

import java.util.List;
import java.util.Arrays;





import org.eclipse.jdt.core.dom.ASTParser;

public class Example {
    public interface ExampleProvider {
        Example getExample();
        // Between here...

        // and here are 3 blank lines
        List<Example> getManyExamples();
    }

    public class Foo {
        int a;
    }
}

class Another {

    System.out.println("");
    