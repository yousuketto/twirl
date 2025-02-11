/*
 * Copyright (C) from 2022 The Play Framework Contributors <https://github.com/playframework>, 2011-2021 Lightbend Inc. <https://www.lightbend.com>
 */
package play.twirl.gradle.internal;

import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.provider.ListProperty;
import org.gradle.api.provider.Property;
import org.gradle.api.provider.SetProperty;
import org.gradle.work.ChangeType;
import org.gradle.workers.WorkParameters;

/** Parameters of compilation work action. */
public interface TwirlCompileParams extends WorkParameters {

  Property<ChangeType> getChangeType();

  RegularFileProperty getSourceFile();

  DirectoryProperty getSourceDirectory();

  DirectoryProperty getDestinationDirectory();

  Property<String> getFormatterType();

  SetProperty<String> getTemplateImports();

  ListProperty<String> getConstructorAnnotations();

  Property<String> getSourceEncoding();
}
