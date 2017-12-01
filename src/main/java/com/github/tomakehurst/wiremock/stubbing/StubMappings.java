/*
 * Copyright (C) 2011 Thomas Akehurst
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.tomakehurst.wiremock.stubbing;


import java.util.List;
import java.util.UUID;

import com.github.tomakehurst.wiremock.http.Request;
import com.google.common.base.Optional;

public interface StubMappings {

	ServeEvent serveFor(Request request);
	void addMapping(String context, StubMapping mapping);
	void removeMapping(String context, StubMapping mapping);
	void editMapping(String context, StubMapping stubMapping);
	void reset();
	void resetScenarios();

    List<StubMapping> getAll(String context);

	List<Scenario> getAllScenarios();
	Optional<StubMapping> get(String context, UUID id);
	
	
}
