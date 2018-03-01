package com.home.log4j2.pattern;

import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.pattern.ConverterKeys;
import org.apache.logging.log4j.core.pattern.LogEventPatternConverter;
import org.apache.logging.log4j.core.pattern.PatternConverter;

@Plugin(name = "DataMaskPatternConverter", category = PatternConverter.CATEGORY)
@ConverterKeys({ "k" })
public final class DataMaskPatternConverter extends LogEventPatternConverter {


	public DataMaskPatternConverter(String[] options) {
		super("DataMask", "");
    }
 
    public static DataMaskPatternConverter newInstance(final String[] options) {
      return new DataMaskPatternConverter(options);
    }

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void format(final LogEvent event, final StringBuilder toAppendTo) {
		toAppendTo.append(event.getMessage().getFormattedMessage());
	}
}