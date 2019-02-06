package hocklo.samples.graphql.scalars;

import graphql.language.StringValue;
import graphql.schema.Coercing;
import graphql.schema.CoercingParseLiteralException;
import graphql.schema.CoercingParseValueException;
import graphql.schema.CoercingSerializeException;
import graphql.schema.GraphQLScalarType;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UUIDScalar extends GraphQLScalarType {
  public UUIDScalar() {
    super(
        "UUID",
        "Scalar UUID",
        new Coercing() {
          @Override
          public Object serialize(Object o) throws CoercingSerializeException {
            return ((UUID) o).toString();
          }

          @Override
          public Object parseValue(Object o) throws CoercingParseValueException {
            return serialize(o);
          }

          @Override
          public Object parseLiteral(Object o) throws CoercingParseLiteralException {
            return UUID.fromString(((StringValue) o).getValue());
          }
        });
  }
}
