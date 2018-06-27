/*******************************************************************************
*
* Pentaho Big Data
*
* Copyright (C) 2002-2013 by Pentaho : http://www.pentaho.com
*
*******************************************************************************
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with
* the License. You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*
******************************************************************************/

package org.pentaho.hadoop.mapreduce.converter.converters;

import org.apache.hadoop.io.DoubleWritable;
import org.pentaho.di.core.row.ValueMetaInterface;
import org.pentaho.hadoop.mapreduce.converter.TypeConversionException;
import org.pentaho.hadoop.mapreduce.converter.spi.ITypeConverter;

/**
 * Converts {@link org.apache.hadoop.io.DoubleWritable} objects to {@link Long} objects
 */
public class DoubleWritableToLongConverter implements ITypeConverter<DoubleWritable, Long> {
  @Override
  public boolean canConvert(Class from, Class to) {
    return DoubleWritable.class.equals(from) && Long.class.equals(to);
  }

  @Override
  public Long convert(ValueMetaInterface meta, DoubleWritable obj) throws TypeConversionException {
    return Long.valueOf((long) obj.get());
  }
}
