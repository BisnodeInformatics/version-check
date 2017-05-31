package com.bisnode.versioncheck.rules;

import java.util.List;

import org.gradle.api.artifacts.Configuration;
import org.gradle.api.artifacts.ModuleVersionIdentifier;

import com.bisnode.versioncheck.ValidationReportRenderer;

public interface VersionRule {

    void apply(Configuration config, List<ModuleVersionIdentifier> deps, ValidationReportRenderer renderer);

}
