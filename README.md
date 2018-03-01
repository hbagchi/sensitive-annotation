# @Sensitive Annotation
A Java Annotation to mask sensitive information during logging model classes, e.g. credit cards, national IDs and other financial or PII information.

**@Sensitive** is a field level annotation to be applied to fields whose value we want to mask during logging.

For **@Sensitive** to work,
1. Model classes have to extend BaseModel
2. `DataMaskPatternConverter` have to be configured in the PatternLayout of the appenders in `log4j2.xml`.