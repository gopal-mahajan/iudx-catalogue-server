package iudx.catalogue.server.apiserver.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

import static iudx.catalogue.server.Constants.*;

public class Constants {

  /** General purpose */
  public static final String CAT_ADMIN = "catAdmin";
  public static final int PORT = 8443;

  /** Accept Headers and CORS */
  public static final String HEADER_ACCEPT = "Accept";
  public static final String HEADER_TOKEN = "token";
  public static final String HEADER_CONTENT_LENGTH = "Content-Length";
  public static final String HEADER_CONTENT_TYPE = "Content-Type";
  public static final String HEADER_HOST = "Host";
  public static final String HEADER_INSTANCE = "instance";
  public static final String HEADER_ORIGIN = "Origin";
  public static final String HEADER_REFERER = "Referer";
  public static final String HEADER_CORS = "Access-Control-Allow-Origin";
  public static final Set<String> ALLOWED_HEADERS
    = new HashSet<String>(Arrays.asList(HEADER_ACCEPT, HEADER_TOKEN, HEADER_CONTENT_LENGTH,
                                    HEADER_CONTENT_TYPE, HEADER_HOST, HEADER_ORIGIN,
                                    HEADER_REFERER, HEADER_CORS));

  public static final String MIME_APPLICATION_JSON = "application/json";

  /**
   *Routes
   */
  private static String basePath = "/iudx/cat/v1";
  public static final String ROUTE_STATIC = "/apis/*";
  public static final String ROUTE_ITEMS = basePath + "/item";
  public static final String ROUTE_UPDATE_ITEMS = basePath + "/item";
  public static final String ROUTE_DELETE_ITEMS = basePath + "/item";
  public static final String ROUTE_INSTANCE = basePath + "/instance";
  public static final String ROUTE_LIST_RESOURCE_REL = basePath + "\\/(?<id>.*)\\/resource";
  public static final String ROUTE_LIST_RESOURCE_GROUP_REL =
      basePath + "\\/(?<id>.*)\\/resourceGroup";

  public static final String ROUTE_RELATIONSHIP = basePath + "/relationship";
  public static final String ROUTE_SEARCH = basePath + "/search";
  public static final String ROUTE_LIST_ITEMS = basePath + "/list/:itemType";

  public static final String RESOURCE_ITEM = "resItem";
  public static final String RESOURCE_GRP_ITEM = "resGrpItem";
  public static final String RESOURCE_SVR_ITEM = "resSvrItem";
  public static final String PROVIDER_ORG = "prvdrOrg";
  public static final String PROVIDER_ITEM = "pvdrItem";
  public static final String DATA_DES_ITEM = "dataDesItem";

  public static final String ROUTE_GET_ITEM = basePath + "/items";
  public static final String ROUTE_PROVIDER_REL = basePath + "\\/(?<id>.*)\\/provider";
  public static final String ROUTE_RESOURCE_SERVER_REL = basePath + "\\/(?<id>.*)\\/resourceServer";
  public static final String ROUTE_DATA_TYPE = basePath + "\\/(?<id>.*)\\/type";
  public static final String ROUTE_COUNT = basePath + "/count";
  public static final String ROUTE_REL_SEARCH = basePath + "/relsearch";


  public static final String PROVIDER_NAME = "provider.name";
  public static final String PARTIAL_CONTENT = "partial-content";
  public static final String TEXT = "text";

  public static final ArrayList<String> GEORELS 
    = new ArrayList<String>(Arrays.asList(GEOREL_WITHIN, GEOREL_NEAR,
                                          GEOREL_COVERED_BY, GEOREL_INTERSECTS,
                                          GEOREL_EQUALS, GEOREL_DISJOINT));
  /** Geometries */
  public static final String POLYGON = "Polygon";
  public static final String LINE_STRING = "LineString";
  public static final String POINT = "Point";
  public static final ArrayList<String> GEOMETRIES 
    = new ArrayList<String>(Arrays.asList(BBOX, POLYGON,
                                          LINE_STRING, POINT));

  public static final String OPERATION = "operation";
  public static final String ATTRIBUTE_FILTER = "attribute-filter";

  /** Errors */
  public static final String INVALID_SYNTAX = "invalidSyntax";
  public static final String INVALID_VALUE = "invalidValue";
  public static final String BAD_REQUEST = "Bad Request";

  /** Query Pattern */
  public static final String PATTERN_TEXT = "^[\\*]{0,1}[A-Za-z ]+[\\*]{0,1}";
  public static final String PATTERN_ARRAY = "^\\[.*\\]$";

  public static final String REL_KEY = "rel";
  public static final ArrayList<String> ITEMS_KEY =
      new ArrayList<String>(Arrays.asList(RESOURCE, RESOURCE_GRP, RESOURCE_SVR, PROVIDER));
}
