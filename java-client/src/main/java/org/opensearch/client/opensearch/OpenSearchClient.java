/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.client.opensearch;

import org.opensearch.client.ApiClient;
import org.opensearch.client.opensearch._types.OpensearchException;
import org.opensearch.client.opensearch._types.ErrorResponse;
import org.opensearch.client.opensearch.cat.OpensearchCatClient;
import org.opensearch.client.opensearch.cluster.OpensearchClusterClient;
import org.opensearch.client.opensearch.core.BulkRequest;
import org.opensearch.client.opensearch.core.BulkResponse;
import org.opensearch.client.opensearch.core.ClearScrollRequest;
import org.opensearch.client.opensearch.core.ClearScrollResponse;
import org.opensearch.client.opensearch.core.ClosePointInTimeRequest;
import org.opensearch.client.opensearch.core.ClosePointInTimeResponse;
import org.opensearch.client.opensearch.core.CountRequest;
import org.opensearch.client.opensearch.core.CountResponse;
import org.opensearch.client.opensearch.core.CreateRequest;
import org.opensearch.client.opensearch.core.CreateResponse;
import org.opensearch.client.opensearch.core.DeleteByQueryRequest;
import org.opensearch.client.opensearch.core.DeleteByQueryResponse;
import org.opensearch.client.opensearch.core.DeleteByQueryRethrottleRequest;
import org.opensearch.client.opensearch.core.DeleteByQueryRethrottleResponse;
import org.opensearch.client.opensearch.core.DeleteRequest;
import org.opensearch.client.opensearch.core.DeleteResponse;
import org.opensearch.client.opensearch.core.DeleteScriptRequest;
import org.opensearch.client.opensearch.core.DeleteScriptResponse;
import org.opensearch.client.opensearch.core.ExistsRequest;
import org.opensearch.client.opensearch.core.ExistsSourceRequest;
import org.opensearch.client.opensearch.core.ExplainRequest;
import org.opensearch.client.opensearch.core.ExplainResponse;
import org.opensearch.client.opensearch.core.FieldCapsRequest;
import org.opensearch.client.opensearch.core.FieldCapsResponse;
import org.opensearch.client.opensearch.core.GetRequest;
import org.opensearch.client.opensearch.core.GetResponse;
import org.opensearch.client.opensearch.core.GetScriptContextRequest;
import org.opensearch.client.opensearch.core.GetScriptContextResponse;
import org.opensearch.client.opensearch.core.GetScriptLanguagesRequest;
import org.opensearch.client.opensearch.core.GetScriptLanguagesResponse;
import org.opensearch.client.opensearch.core.GetScriptRequest;
import org.opensearch.client.opensearch.core.GetScriptResponse;
import org.opensearch.client.opensearch.core.GetSourceRequest;
import org.opensearch.client.opensearch.core.GetSourceResponse;
import org.opensearch.client.opensearch.core.IndexRequest;
import org.opensearch.client.opensearch.core.IndexResponse;
import org.opensearch.client.opensearch.core.InfoRequest;
import org.opensearch.client.opensearch.core.InfoResponse;
import org.opensearch.client.opensearch.core.MgetRequest;
import org.opensearch.client.opensearch.core.MgetResponse;
import org.opensearch.client.opensearch.core.MsearchRequest;
import org.opensearch.client.opensearch.core.MsearchResponse;
import org.opensearch.client.opensearch.core.MsearchTemplateRequest;
import org.opensearch.client.opensearch.core.MsearchTemplateResponse;
import org.opensearch.client.opensearch.core.MtermvectorsRequest;
import org.opensearch.client.opensearch.core.MtermvectorsResponse;
import org.opensearch.client.opensearch.core.OpenPointInTimeRequest;
import org.opensearch.client.opensearch.core.OpenPointInTimeResponse;
import org.opensearch.client.opensearch.core.PingRequest;
import org.opensearch.client.opensearch.core.PutScriptRequest;
import org.opensearch.client.opensearch.core.PutScriptResponse;
import org.opensearch.client.opensearch.core.RankEvalRequest;
import org.opensearch.client.opensearch.core.RankEvalResponse;
import org.opensearch.client.opensearch.core.ReindexRequest;
import org.opensearch.client.opensearch.core.ReindexResponse;
import org.opensearch.client.opensearch.core.ReindexRethrottleRequest;
import org.opensearch.client.opensearch.core.ReindexRethrottleResponse;
import org.opensearch.client.opensearch.core.RenderSearchTemplateRequest;
import org.opensearch.client.opensearch.core.RenderSearchTemplateResponse;
import org.opensearch.client.opensearch.core.ScriptsPainlessExecuteRequest;
import org.opensearch.client.opensearch.core.ScriptsPainlessExecuteResponse;
import org.opensearch.client.opensearch.core.ScrollRequest;
import org.opensearch.client.opensearch.core.ScrollResponse;
import org.opensearch.client.opensearch.core.SearchRequest;
import org.opensearch.client.opensearch.core.SearchResponse;
import org.opensearch.client.opensearch.core.SearchShardsRequest;
import org.opensearch.client.opensearch.core.SearchShardsResponse;
import org.opensearch.client.opensearch.core.SearchTemplateRequest;
import org.opensearch.client.opensearch.core.SearchTemplateResponse;
import org.opensearch.client.opensearch.core.TermsEnumRequest;
import org.opensearch.client.opensearch.core.TermsEnumResponse;
import org.opensearch.client.opensearch.core.TermvectorsRequest;
import org.opensearch.client.opensearch.core.TermvectorsResponse;
import org.opensearch.client.opensearch.core.UpdateByQueryRequest;
import org.opensearch.client.opensearch.core.UpdateByQueryResponse;
import org.opensearch.client.opensearch.core.UpdateByQueryRethrottleRequest;
import org.opensearch.client.opensearch.core.UpdateByQueryRethrottleResponse;
import org.opensearch.client.opensearch.core.UpdateRequest;
import org.opensearch.client.opensearch.core.UpdateResponse;
import org.opensearch.client.opensearch.dangling_indices.OpensearchDanglingIndicesClient;
import org.opensearch.client.opensearch.features.OpensearchFeaturesClient;
import org.opensearch.client.opensearch.indices.OpensearchIndicesClient;
import org.opensearch.client.opensearch.ingest.OpensearchIngestClient;
import org.opensearch.client.opensearch.nodes.OpensearchNodesClient;
import org.opensearch.client.opensearch.shutdown.OpensearchShutdownClient;
import org.opensearch.client.opensearch.snapshot.OpensearchSnapshotClient;
import org.opensearch.client.opensearch.tasks.OpensearchTasksClient;
import org.opensearch.client.transport.OpensearchTransport;
import org.opensearch.client.transport.JsonEndpoint;
import org.opensearch.client.transport.TransportOptions;
import org.opensearch.client.transport.endpoints.BooleanResponse;
import org.opensearch.client.transport.endpoints.EndpointWithResponseMapperAttr;
import org.opensearch.client.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the namespace.
 */
public class OpenSearchClient extends ApiClient<OpensearchTransport, OpenSearchClient> {

	public OpenSearchClient(OpensearchTransport transport) {
		super(transport, null);
	}

	public OpenSearchClient(OpensearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public OpenSearchClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new OpenSearchClient(this.transport, transportOptions);
	}

	// ----- Child clients

	public OpensearchCatClient cat() {
		return new OpensearchCatClient(this.transport, this.transportOptions);
	}

	public OpensearchClusterClient cluster() {
		return new OpensearchClusterClient(this.transport, this.transportOptions);
	}

	public OpensearchDanglingIndicesClient danglingIndices() {
		return new OpensearchDanglingIndicesClient(this.transport, this.transportOptions);
	}

	public OpensearchFeaturesClient features() {
		return new OpensearchFeaturesClient(this.transport, this.transportOptions);
	}

	public OpensearchIndicesClient indices() {
		return new OpensearchIndicesClient(this.transport, this.transportOptions);
	}

	public OpensearchIngestClient ingest() {
		return new OpensearchIngestClient(this.transport, this.transportOptions);
	}

	public OpensearchNodesClient nodes() {
		return new OpensearchNodesClient(this.transport, this.transportOptions);
	}

	public OpensearchShutdownClient shutdown() {
		return new OpensearchShutdownClient(this.transport, this.transportOptions);
	}

	public OpensearchSnapshotClient snapshot() {
		return new OpensearchSnapshotClient(this.transport, this.transportOptions);
	}

	public OpensearchTasksClient tasks() {
		return new OpensearchTasksClient(this.transport, this.transportOptions);
	}

	// ----- Endpoint: bulk

	/**
	 * Allows to perform multiple index/update/delete operations in a single
	 * request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-bulk.html">Documentation
	 *      on elastic.co</a>
	 */

	public BulkResponse bulk(BulkRequest request) throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<BulkRequest, BulkResponse, ErrorResponse> endpoint =
				(JsonEndpoint<BulkRequest, BulkResponse, ErrorResponse>) BulkRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Allows to perform multiple index/update/delete operations in a single
	 * request.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link BulkRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-bulk.html">Documentation
	 *      on elastic.co</a>
	 */

	public final BulkResponse bulk(Function<BulkRequest.Builder, ObjectBuilder<BulkRequest>> fn)
			throws IOException, OpensearchException {
		return bulk(fn.apply(new BulkRequest.Builder()).build());
	}

	/**
	 * Allows to perform multiple index/update/delete operations in a single
	 * request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-bulk.html">Documentation
	 *      on elastic.co</a>
	 */

	public BulkResponse bulk() throws IOException, OpensearchException {
		return this.transport.performRequest(new BulkRequest.Builder().build(), BulkRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: clear_scroll

	/**
	 * Explicitly clears the search context for a scroll.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/clear-scroll-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public ClearScrollResponse clearScroll(ClearScrollRequest request) throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClearScrollRequest, ClearScrollResponse, ErrorResponse> endpoint =
				(JsonEndpoint<ClearScrollRequest, ClearScrollResponse, ErrorResponse>) ClearScrollRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Explicitly clears the search context for a scroll.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClearScrollRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/clear-scroll-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ClearScrollResponse clearScroll(
			Function<ClearScrollRequest.Builder, ObjectBuilder<ClearScrollRequest>> fn)
			throws IOException, OpensearchException {
		return clearScroll(fn.apply(new ClearScrollRequest.Builder()).build());
	}

	/**
	 * Explicitly clears the search context for a scroll.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/clear-scroll-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public ClearScrollResponse clearScroll() throws IOException, OpensearchException {
		return this.transport.performRequest(new ClearScrollRequest.Builder().build(), ClearScrollRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: close_point_in_time

	/**
	 * Close a point in time
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/point-in-time-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public ClosePointInTimeResponse closePointInTime(ClosePointInTimeRequest request)
			throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClosePointInTimeRequest, ClosePointInTimeResponse, ErrorResponse> endpoint =
				(JsonEndpoint<ClosePointInTimeRequest, ClosePointInTimeResponse, ErrorResponse>)
						ClosePointInTimeRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Close a point in time
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClosePointInTimeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/point-in-time-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ClosePointInTimeResponse closePointInTime(
			Function<ClosePointInTimeRequest.Builder, ObjectBuilder<ClosePointInTimeRequest>> fn)
			throws IOException, OpensearchException {
		return closePointInTime(fn.apply(new ClosePointInTimeRequest.Builder()).build());
	}

	// ----- Endpoint: count

	/**
	 * Returns number of documents matching a query.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-count.html">Documentation
	 *      on elastic.co</a>
	 */

	public CountResponse count(CountRequest request) throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CountRequest, CountResponse, ErrorResponse> endpoint =
				(JsonEndpoint<CountRequest, CountResponse, ErrorResponse>) CountRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns number of documents matching a query.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CountRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-count.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CountResponse count(Function<CountRequest.Builder, ObjectBuilder<CountRequest>> fn)
			throws IOException, OpensearchException {
		return count(fn.apply(new CountRequest.Builder()).build());
	}

	/**
	 * Returns number of documents matching a query.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-count.html">Documentation
	 *      on elastic.co</a>
	 */

	public CountResponse count() throws IOException, OpensearchException {
		return this.transport.performRequest(new CountRequest.Builder().build(), CountRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: create

	/**
	 * Creates a new document in the index.
	 * <p>
	 * Returns a 409 response when a document with a same ID already exists in the
	 * index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-index_.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CreateResponse create(CreateRequest<TDocument> request)
			throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CreateRequest<?>, CreateResponse, ErrorResponse> endpoint =
				(JsonEndpoint<CreateRequest<?>, CreateResponse, ErrorResponse>) CreateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates a new document in the index.
	 * <p>
	 * Returns a 409 response when a document with a same ID already exists in the
	 * index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CreateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-index_.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CreateResponse create(
			Function<CreateRequest.Builder<TDocument>, ObjectBuilder<CreateRequest<TDocument>>> fn)
			throws IOException, OpensearchException {
		return create(fn.apply(new CreateRequest.Builder<TDocument>()).build());
	}

	// ----- Endpoint: delete

	/**
	 * Removes a document from the index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-delete.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteResponse delete(DeleteRequest request) throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteRequest, DeleteResponse, ErrorResponse> endpoint =
				(JsonEndpoint<DeleteRequest, DeleteResponse, ErrorResponse>) DeleteRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Removes a document from the index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-delete.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteResponse delete(Function<DeleteRequest.Builder, ObjectBuilder<DeleteRequest>> fn)
			throws IOException, OpensearchException {
		return delete(fn.apply(new DeleteRequest.Builder()).build());
	}

	// ----- Endpoint: delete_by_query

	/**
	 * Deletes documents matching the provided query.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-delete-by-query.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteByQueryResponse deleteByQuery(DeleteByQueryRequest request)
			throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteByQueryRequest, DeleteByQueryResponse, ErrorResponse> endpoint =
				(JsonEndpoint<DeleteByQueryRequest, DeleteByQueryResponse, ErrorResponse>) DeleteByQueryRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes documents matching the provided query.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteByQueryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-delete-by-query.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteByQueryResponse deleteByQuery(
			Function<DeleteByQueryRequest.Builder, ObjectBuilder<DeleteByQueryRequest>> fn)
			throws IOException, OpensearchException {
		return deleteByQuery(fn.apply(new DeleteByQueryRequest.Builder()).build());
	}

	// ----- Endpoint: delete_by_query_rethrottle

	/**
	 * Changes the number of requests per second for a particular Delete By Query
	 * operation.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/docs-delete-by-query.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteByQueryRethrottleResponse deleteByQueryRethrottle(DeleteByQueryRethrottleRequest request)
			throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteByQueryRethrottleRequest, DeleteByQueryRethrottleResponse, ErrorResponse> endpoint =
				(JsonEndpoint<DeleteByQueryRethrottleRequest, DeleteByQueryRethrottleResponse, ErrorResponse>)
						DeleteByQueryRethrottleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Changes the number of requests per second for a particular Delete By Query
	 * operation.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteByQueryRethrottleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/docs-delete-by-query.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteByQueryRethrottleResponse deleteByQueryRethrottle(
			Function<DeleteByQueryRethrottleRequest.Builder, ObjectBuilder<DeleteByQueryRethrottleRequest>> fn)
			throws IOException, OpensearchException {
		return deleteByQueryRethrottle(fn.apply(new DeleteByQueryRethrottleRequest.Builder()).build());
	}

	// ----- Endpoint: delete_script

	/**
	 * Deletes a script.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteScriptResponse deleteScript(DeleteScriptRequest request) throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteScriptRequest, DeleteScriptResponse, ErrorResponse> endpoint =
				(JsonEndpoint<DeleteScriptRequest, DeleteScriptResponse, ErrorResponse>) DeleteScriptRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes a script.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteScriptRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteScriptResponse deleteScript(
			Function<DeleteScriptRequest.Builder, ObjectBuilder<DeleteScriptRequest>> fn)
			throws IOException, OpensearchException {
		return deleteScript(fn.apply(new DeleteScriptRequest.Builder()).build());
	}

	// ----- Endpoint: exists

	/**
	 * Returns information about whether a document exists in an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public BooleanResponse exists(ExistsRequest request) throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ExistsRequest, BooleanResponse, ErrorResponse> endpoint =
				(JsonEndpoint<ExistsRequest, BooleanResponse, ErrorResponse>) ExistsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about whether a document exists in an index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExistsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public final BooleanResponse exists(Function<ExistsRequest.Builder, ObjectBuilder<ExistsRequest>> fn)
			throws IOException, OpensearchException {
		return exists(fn.apply(new ExistsRequest.Builder()).build());
	}

	// ----- Endpoint: exists_source

	/**
	 * Returns information about whether a document source exists in an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public BooleanResponse existsSource(ExistsSourceRequest request) throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ExistsSourceRequest, BooleanResponse, ErrorResponse> endpoint =
				(JsonEndpoint<ExistsSourceRequest, BooleanResponse, ErrorResponse>) ExistsSourceRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about whether a document source exists in an index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExistsSourceRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public final BooleanResponse existsSource(
			Function<ExistsSourceRequest.Builder, ObjectBuilder<ExistsSourceRequest>> fn)
			throws IOException, OpensearchException {
		return existsSource(fn.apply(new ExistsSourceRequest.Builder()).build());
	}

	// ----- Endpoint: explain

	/**
	 * Returns information about why a specific matches (or doesn't match) a query.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-explain.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> ExplainResponse<TDocument> explain(ExplainRequest request, Class<TDocument> tDocumentClass)
			throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ExplainRequest, ExplainResponse<TDocument>, ErrorResponse> endpoint =
				(JsonEndpoint<ExplainRequest, ExplainResponse<TDocument>, ErrorResponse>) ExplainRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.explain.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about why a specific matches (or doesn't match) a query.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExplainRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-explain.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> ExplainResponse<TDocument> explain(
			Function<ExplainRequest.Builder, ObjectBuilder<ExplainRequest>> fn, Class<TDocument> tDocumentClass)
			throws IOException, OpensearchException {
		return explain(fn.apply(new ExplainRequest.Builder()).build(), tDocumentClass);
	}

	// ----- Endpoint: field_caps

	/**
	 * Returns the information about the capabilities of fields among multiple
	 * indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-field-caps.html">Documentation
	 *      on elastic.co</a>
	 */

	public FieldCapsResponse fieldCaps(FieldCapsRequest request) throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<FieldCapsRequest, FieldCapsResponse, ErrorResponse> endpoint =
				(JsonEndpoint<FieldCapsRequest, FieldCapsResponse, ErrorResponse>) FieldCapsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns the information about the capabilities of fields among multiple
	 * indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link FieldCapsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-field-caps.html">Documentation
	 *      on elastic.co</a>
	 */

	public final FieldCapsResponse fieldCaps(Function<FieldCapsRequest.Builder, ObjectBuilder<FieldCapsRequest>> fn)
			throws IOException, OpensearchException {
		return fieldCaps(fn.apply(new FieldCapsRequest.Builder()).build());
	}

	/**
	 * Returns the information about the capabilities of fields among multiple
	 * indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-field-caps.html">Documentation
	 *      on elastic.co</a>
	 */

	public FieldCapsResponse fieldCaps() throws IOException, OpensearchException {
		return this.transport.performRequest(new FieldCapsRequest.Builder().build(), FieldCapsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: get

	/**
	 * Returns a document.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> GetResponse<TDocument> get(GetRequest request, Class<TDocument> tDocumentClass)
			throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetRequest, GetResponse<TDocument>, ErrorResponse> endpoint =
				(JsonEndpoint<GetRequest, GetResponse<TDocument>, ErrorResponse>) GetRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.get.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns a document.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> GetResponse<TDocument> get(Function<GetRequest.Builder, ObjectBuilder<GetRequest>> fn,
			Class<TDocument> tDocumentClass) throws IOException, OpensearchException {
		return get(fn.apply(new GetRequest.Builder()).build(), tDocumentClass);
	}

	// ----- Endpoint: get_script

	/**
	 * Returns a script.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetScriptResponse getScript(GetScriptRequest request) throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetScriptRequest, GetScriptResponse, ErrorResponse> endpoint =
				(JsonEndpoint<GetScriptRequest, GetScriptResponse, ErrorResponse>) GetScriptRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns a script.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetScriptRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetScriptResponse getScript(Function<GetScriptRequest.Builder, ObjectBuilder<GetScriptRequest>> fn)
			throws IOException, OpensearchException {
		return getScript(fn.apply(new GetScriptRequest.Builder()).build());
	}

	// ----- Endpoint: get_script_context

	/**
	 * Returns all script contexts.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/painless/master/painless-contexts.html">Documentation
	 *      on elastic.co</a>
	 */
	public GetScriptContextResponse getScriptContext() throws IOException, OpensearchException {
		return this.transport.performRequest(GetScriptContextRequest._INSTANCE, GetScriptContextRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: get_script_languages

	/**
	 * Returns available script types, languages and contexts
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
	 *      on elastic.co</a>
	 */
	public GetScriptLanguagesResponse getScriptLanguages() throws IOException, OpensearchException {
		return this.transport.performRequest(GetScriptLanguagesRequest._INSTANCE, GetScriptLanguagesRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: get_source

	/**
	 * Returns the source of a document.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> GetSourceResponse<TDocument> getSource(GetSourceRequest request, Class<TDocument> tDocumentClass)
			throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetSourceRequest, GetSourceResponse<TDocument>, ErrorResponse> endpoint =
				(JsonEndpoint<GetSourceRequest, GetSourceResponse<TDocument>, ErrorResponse>)
						GetSourceRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.get_source.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns the source of a document.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetSourceRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> GetSourceResponse<TDocument> getSource(
			Function<GetSourceRequest.Builder, ObjectBuilder<GetSourceRequest>> fn, Class<TDocument> tDocumentClass)
			throws IOException, OpensearchException {
		return getSource(fn.apply(new GetSourceRequest.Builder()).build(), tDocumentClass);
	}

	// ----- Endpoint: index

	/**
	 * Creates or updates a document in an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-index_.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> IndexResponse index(IndexRequest<TDocument> request) throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<IndexRequest<?>, IndexResponse, ErrorResponse> endpoint =
				(JsonEndpoint<IndexRequest<?>, IndexResponse, ErrorResponse>) IndexRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates or updates a document in an index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link IndexRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-index_.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> IndexResponse index(
			Function<IndexRequest.Builder<TDocument>, ObjectBuilder<IndexRequest<TDocument>>> fn)
			throws IOException, OpensearchException {
		return index(fn.apply(new IndexRequest.Builder<TDocument>()).build());
	}

	// ----- Endpoint: info

	/**
	 * Returns basic information about the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/index.html">Documentation
	 *      on elastic.co</a>
	 */
	public InfoResponse info() throws IOException, OpensearchException {
		return this.transport.performRequest(InfoRequest._INSTANCE, InfoRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: mget

	/**
	 * Allows to get multiple documents in one request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-multi-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> MgetResponse<TDocument> mget(MgetRequest request, Class<TDocument> tDocumentClass)
			throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MgetRequest, MgetResponse<TDocument>, ErrorResponse> endpoint =
				(JsonEndpoint<MgetRequest, MgetResponse<TDocument>, ErrorResponse>) MgetRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.mget.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Allows to get multiple documents in one request.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MgetRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-multi-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> MgetResponse<TDocument> mget(Function<MgetRequest.Builder, ObjectBuilder<MgetRequest>> fn,
			Class<TDocument> tDocumentClass) throws IOException, OpensearchException {
		return mget(fn.apply(new MgetRequest.Builder()).build(), tDocumentClass);
	}

	// ----- Endpoint: msearch

	/**
	 * Allows to execute several search operations in one request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-multi-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> MsearchResponse<TDocument> msearch(MsearchRequest request, Class<TDocument> tDocumentClass)
			throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MsearchRequest, MsearchResponse<TDocument>, ErrorResponse> endpoint =
				(JsonEndpoint<MsearchRequest, MsearchResponse<TDocument>, ErrorResponse>) MsearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.msearch.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Allows to execute several search operations in one request.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MsearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-multi-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> MsearchResponse<TDocument> msearch(
			Function<MsearchRequest.Builder, ObjectBuilder<MsearchRequest>> fn, Class<TDocument> tDocumentClass)
			throws IOException, OpensearchException {
		return msearch(fn.apply(new MsearchRequest.Builder()).build(), tDocumentClass);
	}

	// ----- Endpoint: msearch_template

	/**
	 * Allows to execute several search template operations in one request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-multi-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> MsearchTemplateResponse<TDocument> msearchTemplate(MsearchTemplateRequest request,
			Class<TDocument> tDocumentClass) throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MsearchTemplateRequest, MsearchTemplateResponse<TDocument>, ErrorResponse> endpoint =
				(JsonEndpoint<MsearchTemplateRequest, MsearchTemplateResponse<TDocument>, ErrorResponse>)
						MsearchTemplateRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.msearch_template.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Allows to execute several search template operations in one request.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MsearchTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-multi-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> MsearchTemplateResponse<TDocument> msearchTemplate(
			Function<MsearchTemplateRequest.Builder, ObjectBuilder<MsearchTemplateRequest>> fn,
			Class<TDocument> tDocumentClass) throws IOException, OpensearchException {
		return msearchTemplate(fn.apply(new MsearchTemplateRequest.Builder()).build(), tDocumentClass);
	}

	// ----- Endpoint: mtermvectors

	/**
	 * Returns multiple termvectors in one request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-multi-termvectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public MtermvectorsResponse mtermvectors(MtermvectorsRequest request) throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MtermvectorsRequest, MtermvectorsResponse, ErrorResponse> endpoint =
				(JsonEndpoint<MtermvectorsRequest, MtermvectorsResponse, ErrorResponse>) MtermvectorsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns multiple termvectors in one request.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MtermvectorsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-multi-termvectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public final MtermvectorsResponse mtermvectors(
			Function<MtermvectorsRequest.Builder, ObjectBuilder<MtermvectorsRequest>> fn)
			throws IOException, OpensearchException {
		return mtermvectors(fn.apply(new MtermvectorsRequest.Builder()).build());
	}

	/**
	 * Returns multiple termvectors in one request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-multi-termvectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public MtermvectorsResponse mtermvectors() throws IOException, OpensearchException {
		return this.transport.performRequest(new MtermvectorsRequest.Builder().build(), MtermvectorsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: open_point_in_time

	/**
	 * Open a point in time that can be used in subsequent searches
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/point-in-time-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public OpenPointInTimeResponse openPointInTime(OpenPointInTimeRequest request)
			throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<OpenPointInTimeRequest, OpenPointInTimeResponse, ErrorResponse> endpoint =
				(JsonEndpoint<OpenPointInTimeRequest, OpenPointInTimeResponse, ErrorResponse>)
						OpenPointInTimeRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Open a point in time that can be used in subsequent searches
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link OpenPointInTimeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/point-in-time-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final OpenPointInTimeResponse openPointInTime(
			Function<OpenPointInTimeRequest.Builder, ObjectBuilder<OpenPointInTimeRequest>> fn)
			throws IOException, OpensearchException {
		return openPointInTime(fn.apply(new OpenPointInTimeRequest.Builder()).build());
	}

	// ----- Endpoint: ping

	/**
	 * Returns whether the cluster is running.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/index.html">Documentation
	 *      on elastic.co</a>
	 */
	public BooleanResponse ping() throws IOException, OpensearchException {
		return this.transport.performRequest(PingRequest._INSTANCE, PingRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: put_script

	/**
	 * Creates or updates a script.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutScriptResponse putScript(PutScriptRequest request) throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutScriptRequest, PutScriptResponse, ErrorResponse> endpoint =
				(JsonEndpoint<PutScriptRequest, PutScriptResponse, ErrorResponse>) PutScriptRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates or updates a script.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutScriptRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutScriptResponse putScript(Function<PutScriptRequest.Builder, ObjectBuilder<PutScriptRequest>> fn)
			throws IOException, OpensearchException {
		return putScript(fn.apply(new PutScriptRequest.Builder()).build());
	}

	// ----- Endpoint: rank_eval

	/**
	 * Allows to evaluate the quality of ranked search results over a set of typical
	 * search queries
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-rank-eval.html">Documentation
	 *      on elastic.co</a>
	 */

	public RankEvalResponse rankEval(RankEvalRequest request) throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RankEvalRequest, RankEvalResponse, ErrorResponse> endpoint =
				(JsonEndpoint<RankEvalRequest, RankEvalResponse, ErrorResponse>) RankEvalRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Allows to evaluate the quality of ranked search results over a set of typical
	 * search queries
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RankEvalRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-rank-eval.html">Documentation
	 *      on elastic.co</a>
	 */

	public final RankEvalResponse rankEval(Function<RankEvalRequest.Builder, ObjectBuilder<RankEvalRequest>> fn)
			throws IOException, OpensearchException {
		return rankEval(fn.apply(new RankEvalRequest.Builder()).build());
	}

	// ----- Endpoint: reindex

	/**
	 * Allows to copy documents from one index to another, optionally filtering the
	 * source documents by a query, changing the destination index settings, or
	 * fetching the documents from a remote cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-reindex.html">Documentation
	 *      on elastic.co</a>
	 */

	public ReindexResponse reindex(ReindexRequest request) throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ReindexRequest, ReindexResponse, ErrorResponse> endpoint =
				(JsonEndpoint<ReindexRequest, ReindexResponse, ErrorResponse>) ReindexRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Allows to copy documents from one index to another, optionally filtering the
	 * source documents by a query, changing the destination index settings, or
	 * fetching the documents from a remote cluster.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ReindexRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-reindex.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ReindexResponse reindex(Function<ReindexRequest.Builder, ObjectBuilder<ReindexRequest>> fn)
			throws IOException, OpensearchException {
		return reindex(fn.apply(new ReindexRequest.Builder()).build());
	}

	/**
	 * Allows to copy documents from one index to another, optionally filtering the
	 * source documents by a query, changing the destination index settings, or
	 * fetching the documents from a remote cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-reindex.html">Documentation
	 *      on elastic.co</a>
	 */

	public ReindexResponse reindex() throws IOException, OpensearchException {
		return this.transport.performRequest(new ReindexRequest.Builder().build(), ReindexRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: reindex_rethrottle

	/**
	 * Changes the number of requests per second for a particular Reindex operation.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-reindex.html">Documentation
	 *      on elastic.co</a>
	 */

	public ReindexRethrottleResponse reindexRethrottle(ReindexRethrottleRequest request)
			throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ReindexRethrottleRequest, ReindexRethrottleResponse, ErrorResponse> endpoint =
				(JsonEndpoint<ReindexRethrottleRequest, ReindexRethrottleResponse, ErrorResponse>)
						ReindexRethrottleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Changes the number of requests per second for a particular Reindex operation.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ReindexRethrottleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-reindex.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ReindexRethrottleResponse reindexRethrottle(
			Function<ReindexRethrottleRequest.Builder, ObjectBuilder<ReindexRethrottleRequest>> fn)
			throws IOException, OpensearchException {
		return reindexRethrottle(fn.apply(new ReindexRethrottleRequest.Builder()).build());
	}

	// ----- Endpoint: render_search_template

	/**
	 * Allows to use the Mustache language to pre-render a search definition.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/render-search-template-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public RenderSearchTemplateResponse renderSearchTemplate(RenderSearchTemplateRequest request)
			throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RenderSearchTemplateRequest, RenderSearchTemplateResponse, ErrorResponse> endpoint =
				(JsonEndpoint<RenderSearchTemplateRequest, RenderSearchTemplateResponse, ErrorResponse>)
						RenderSearchTemplateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Allows to use the Mustache language to pre-render a search definition.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RenderSearchTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/render-search-template-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final RenderSearchTemplateResponse renderSearchTemplate(
			Function<RenderSearchTemplateRequest.Builder, ObjectBuilder<RenderSearchTemplateRequest>> fn)
			throws IOException, OpensearchException {
		return renderSearchTemplate(fn.apply(new RenderSearchTemplateRequest.Builder()).build());
	}

	/**
	 * Allows to use the Mustache language to pre-render a search definition.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/render-search-template-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public RenderSearchTemplateResponse renderSearchTemplate() throws IOException, OpensearchException {
		return this.transport.performRequest(new RenderSearchTemplateRequest.Builder().build(),
				RenderSearchTemplateRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: scripts_painless_execute

	/**
	 * Allows an arbitrary script to be executed and a result to be returned
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/painless/master/painless-execute-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TResult> ScriptsPainlessExecuteResponse<TResult> scriptsPainlessExecute(
			ScriptsPainlessExecuteRequest request, Class<TResult> tResultClass)
			throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ScriptsPainlessExecuteRequest, ScriptsPainlessExecuteResponse<TResult>, ErrorResponse> endpoint =
				(JsonEndpoint<ScriptsPainlessExecuteRequest, ScriptsPainlessExecuteResponse<TResult>, ErrorResponse>)
						ScriptsPainlessExecuteRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.scripts_painless_execute.TResult",
				getDeserializer(tResultClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Allows an arbitrary script to be executed and a result to be returned
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ScriptsPainlessExecuteRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/painless/master/painless-execute-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TResult> ScriptsPainlessExecuteResponse<TResult> scriptsPainlessExecute(
			Function<ScriptsPainlessExecuteRequest.Builder, ObjectBuilder<ScriptsPainlessExecuteRequest>> fn,
			Class<TResult> tResultClass) throws IOException, OpensearchException {
		return scriptsPainlessExecute(fn.apply(new ScriptsPainlessExecuteRequest.Builder()).build(), tResultClass);
	}

	// ----- Endpoint: scroll

	/**
	 * Allows to retrieve a large numbers of results from a single search request.
	 * 
	 */

	public <TDocument> ScrollResponse<TDocument> scroll(ScrollRequest request, Class<TDocument> tDocumentClass)
			throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ScrollRequest, ScrollResponse<TDocument>, ErrorResponse> endpoint =
				(JsonEndpoint<ScrollRequest, ScrollResponse<TDocument>, ErrorResponse>) ScrollRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.scroll.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Allows to retrieve a large numbers of results from a single search request.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ScrollRequest}
	 */

	public final <TDocument> ScrollResponse<TDocument> scroll(
			Function<ScrollRequest.Builder, ObjectBuilder<ScrollRequest>> fn, Class<TDocument> tDocumentClass)
			throws IOException, OpensearchException {
		return scroll(fn.apply(new ScrollRequest.Builder()).build(), tDocumentClass);
	}

	// ----- Endpoint: search

	/**
	 * Returns results matching a query.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> SearchResponse<TDocument> search(SearchRequest request, Class<TDocument> tDocumentClass)
			throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SearchRequest, SearchResponse<TDocument>, ErrorResponse> endpoint =
				(JsonEndpoint<SearchRequest, SearchResponse<TDocument>, ErrorResponse>) SearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.search.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns results matching a query.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> SearchResponse<TDocument> search(
			Function<SearchRequest.Builder, ObjectBuilder<SearchRequest>> fn, Class<TDocument> tDocumentClass)
			throws IOException, OpensearchException {
		return search(fn.apply(new SearchRequest.Builder()).build(), tDocumentClass);
	}

	// ----- Endpoint: search_shards

	/**
	 * Returns information about the indices and shards that a search request would
	 * be executed against.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-shards.html">Documentation
	 *      on elastic.co</a>
	 */

	public SearchShardsResponse searchShards(SearchShardsRequest request) throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SearchShardsRequest, SearchShardsResponse, ErrorResponse> endpoint =
				(JsonEndpoint<SearchShardsRequest, SearchShardsResponse, ErrorResponse>) SearchShardsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about the indices and shards that a search request would
	 * be executed against.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SearchShardsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-shards.html">Documentation
	 *      on elastic.co</a>
	 */

	public final SearchShardsResponse searchShards(
			Function<SearchShardsRequest.Builder, ObjectBuilder<SearchShardsRequest>> fn)
			throws IOException, OpensearchException {
		return searchShards(fn.apply(new SearchShardsRequest.Builder()).build());
	}

	/**
	 * Returns information about the indices and shards that a search request would
	 * be executed against.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-shards.html">Documentation
	 *      on elastic.co</a>
	 */

	public SearchShardsResponse searchShards() throws IOException, OpensearchException {
		return this.transport.performRequest(new SearchShardsRequest.Builder().build(), SearchShardsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: search_template

	/**
	 * Allows to use the Mustache language to pre-render a search definition.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> SearchTemplateResponse<TDocument> searchTemplate(SearchTemplateRequest request,
			Class<TDocument> tDocumentClass) throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SearchTemplateRequest, SearchTemplateResponse<TDocument>, ErrorResponse> endpoint =
				(JsonEndpoint<SearchTemplateRequest, SearchTemplateResponse<TDocument>, ErrorResponse>)
						SearchTemplateRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.search_template.TDocument",
				getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Allows to use the Mustache language to pre-render a search definition.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SearchTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> SearchTemplateResponse<TDocument> searchTemplate(
			Function<SearchTemplateRequest.Builder, ObjectBuilder<SearchTemplateRequest>> fn,
			Class<TDocument> tDocumentClass) throws IOException, OpensearchException {
		return searchTemplate(fn.apply(new SearchTemplateRequest.Builder()).build(), tDocumentClass);
	}

	// ----- Endpoint: terms_enum

	/**
	 * The terms enum API can be used to discover terms in the index that begin with
	 * the provided string. It is designed for low-latency look-ups used in
	 * auto-complete scenarios.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-terms-enum.html">Documentation
	 *      on elastic.co</a>
	 */

	public TermsEnumResponse termsEnum(TermsEnumRequest request) throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<TermsEnumRequest, TermsEnumResponse, ErrorResponse> endpoint =
				(JsonEndpoint<TermsEnumRequest, TermsEnumResponse, ErrorResponse>) TermsEnumRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * The terms enum API can be used to discover terms in the index that begin with
	 * the provided string. It is designed for low-latency look-ups used in
	 * auto-complete scenarios.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link TermsEnumRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-terms-enum.html">Documentation
	 *      on elastic.co</a>
	 */

	public final TermsEnumResponse termsEnum(Function<TermsEnumRequest.Builder, ObjectBuilder<TermsEnumRequest>> fn)
			throws IOException, OpensearchException {
		return termsEnum(fn.apply(new TermsEnumRequest.Builder()).build());
	}

	// ----- Endpoint: termvectors

	/**
	 * Returns information and statistics about terms in the fields of a particular
	 * document.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-termvectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> TermvectorsResponse termvectors(TermvectorsRequest<TDocument> request)
			throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<TermvectorsRequest<?>, TermvectorsResponse, ErrorResponse> endpoint =
				(JsonEndpoint<TermvectorsRequest<?>, TermvectorsResponse, ErrorResponse>) TermvectorsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information and statistics about terms in the fields of a particular
	 * document.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link TermvectorsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-termvectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> TermvectorsResponse termvectors(
			Function<TermvectorsRequest.Builder<TDocument>, ObjectBuilder<TermvectorsRequest<TDocument>>> fn)
			throws IOException, OpensearchException {
		return termvectors(fn.apply(new TermvectorsRequest.Builder<TDocument>()).build());
	}

	// ----- Endpoint: update

	/**
	 * Updates a document with a script or partial document.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-update.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument, TPartialDocument> UpdateResponse<TDocument> update(
			UpdateRequest<TDocument, TPartialDocument> request, Class<TDocument> tDocumentClass)
			throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateRequest<?, ?>, UpdateResponse<TDocument>, ErrorResponse> endpoint =
				(JsonEndpoint<UpdateRequest<?, ?>, UpdateResponse<TDocument>, ErrorResponse>) UpdateRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.update.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Updates a document with a script or partial document.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-update.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument, TPartialDocument> UpdateResponse<TDocument> update(

			Function<UpdateRequest.Builder<TDocument, TPartialDocument>,
					ObjectBuilder<UpdateRequest<TDocument, TPartialDocument>>> fn,
			Class<TDocument> tDocumentClass) throws IOException, OpensearchException {
		return update(fn.apply(new UpdateRequest.Builder<TDocument, TPartialDocument>()).build(), tDocumentClass);
	}

	// ----- Endpoint: update_by_query

	/**
	 * Performs an update on every document in the index without changing the
	 * source, for example to pick up a mapping change.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-update-by-query.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateByQueryResponse updateByQuery(UpdateByQueryRequest request)
			throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateByQueryRequest, UpdateByQueryResponse, ErrorResponse> endpoint =
				(JsonEndpoint<UpdateByQueryRequest, UpdateByQueryResponse, ErrorResponse>)
						UpdateByQueryRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Performs an update on every document in the index without changing the
	 * source, for example to pick up a mapping change.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateByQueryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-update-by-query.html">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdateByQueryResponse updateByQuery(
			Function<UpdateByQueryRequest.Builder, ObjectBuilder<UpdateByQueryRequest>> fn)
			throws IOException, OpensearchException {
		return updateByQuery(fn.apply(new UpdateByQueryRequest.Builder()).build());
	}

	// ----- Endpoint: update_by_query_rethrottle

	/**
	 * Changes the number of requests per second for a particular Update By Query
	 * operation.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/docs-update-by-query.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateByQueryRethrottleResponse updateByQueryRethrottle(UpdateByQueryRethrottleRequest request)
			throws IOException, OpensearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateByQueryRethrottleRequest, UpdateByQueryRethrottleResponse, ErrorResponse> endpoint =
				(JsonEndpoint<UpdateByQueryRethrottleRequest, UpdateByQueryRethrottleResponse, ErrorResponse>)
						UpdateByQueryRethrottleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Changes the number of requests per second for a particular Update By Query
	 * operation.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateByQueryRethrottleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/docs-update-by-query.html">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdateByQueryRethrottleResponse updateByQueryRethrottle(
			Function<UpdateByQueryRethrottleRequest.Builder, ObjectBuilder<UpdateByQueryRethrottleRequest>> fn)
			throws IOException, OpensearchException {
		return updateByQueryRethrottle(fn.apply(new UpdateByQueryRethrottleRequest.Builder()).build());
	}

}
