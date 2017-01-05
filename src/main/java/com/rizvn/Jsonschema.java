package com.rizvn;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.factories.SchemaFactoryWrapper;

/**
 * Created by Riz
 */
public class Jsonschema {

  public void generate(Class<?> rootClass)
  {
    try
    {
      ObjectMapper mapper = new ObjectMapper();
      SchemaFactoryWrapper visitor = new SchemaFactoryWrapper();
      mapper.acceptJsonFormatVisitor(rootClass, visitor);
      JsonSchema schema = visitor.finalSchema();
      System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(schema));
    }
    catch (Exception ex)
    {
      throw new IllegalStateException(ex);
    }

  }
}
