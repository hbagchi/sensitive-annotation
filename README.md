# @Sensitive Annotation
A Java Annotation to mask sensitive information during logging model classes, e.g. credit cards, national IDs and other financial or PII information.

**@Sensitive** is a field level annotation to be applied to fields whose value we want to mask during logging.

For **@Sensitive** to work, model classes have to extend com.home.model.BaseModel
