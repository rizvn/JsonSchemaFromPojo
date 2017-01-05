package com.rizvn;

import com.rizvn.model.Message;
import org.junit.Test;

/**
 * Created by Riz
 */
public class JsonschemaTest {

  @Test
  public void testGenerate(){
    Jsonschema jsonschema = new Jsonschema();
    jsonschema.generate(Message.class);
  }
}