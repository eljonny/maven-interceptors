package org.apache.maven.cli;

/*
 * Copyright Olivier Lamy
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.maven.execution.MavenExecutionRequest;
import org.apache.maven.execution.MavenExecutionRequestPopulationException;
import org.apache.maven.settings.building.SettingsBuildingException;

import java.io.PrintStream;

/**
 * @author Olivier Lamy
 */
public interface MavenExecutionRequestBuilder
{
    MavenExecutionRequest getMavenExecutionRequest( String[] args, PrintStream printStream)
        throws MavenExecutionRequestPopulationException, SettingsBuildingException, MavenExecutionRequestsBuilderException;

    MavenExecutionRequest getMavenExecutionRequest( CommonCliRequest commonCliRequest )
        throws MavenExecutionRequestPopulationException, SettingsBuildingException, MavenExecutionRequestsBuilderException;
}
