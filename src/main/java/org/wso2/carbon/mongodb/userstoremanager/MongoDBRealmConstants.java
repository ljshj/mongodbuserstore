package org.wso2.carbon.mongodb.userstoremanager;

public class MongoDBRealmConstants {

	 public static final String SELECT_USER = "SelectUserMONGO_QUERY";
	    public static final String GET_ROLE_LIST = "GetRoleListMONGO_QUERY";
	    public static final String GET_USER_FILTER = "UserFilterMONGO_QUERY";
	    public static final String GET_USER_ROLE = "UserRoleMONGO_QUERY";
	    public static final String GET_IS_ROLE_EXISTING = "IsRoleExistingMONGO_QUERY";
	    public static final String GET_USERS_IN_ROLE = "GetUserListOfRoleMONGO_QUERY";

	    public static final String GET_IS_USER_EXISTING = "IsUserExistingMONGO_QUERY";
	    public static final String GET_PROPS_FOR_PROFILE = "GetUserPropertiesForProfileMONGO_QUERY";
	    public static final String GET_PROP_FOR_PROFILE = "GetUserPropertyForProfileMONGO_QUERY";
	    public static final String GET_PROFILE_NAMES = "GetProfileNamesMONGO_QUERY";
	    public static final String GET_PROFILE_NAMES_FOR_USER = "GetUserProfileNamesMONGO_QUERY";
	    public static final String GET_USERID_FROM_USERNAME = "GetUserIDFromUserNameMONGO_QUERY";
	    public static final String GET_USERNAME_FROM_TENANT_ID = "GetUserNameFromTenantIDMONGO_QUERY";
	    public static final String GET_TENANT_ID_FROM_USERNAME = "GetTenantIDFromUserNameMONGO_QUERY";

	    public static final String ADD_USER = "AddUserMONGO_QUERY";
	    public static final String ADD_USER_TO_ROLE = "AddUserToRoleMONGO_QUERY";
	    public static final String ADD_USER_PERMISSION = "AddUserPermission";
	    public static final String ADD_ROLE = "AddRoleMONGO_QUERY";
	    public static final String ADD_ROLE_TO_USER = "AddRoleToUserMONGO_QUERY";
	    public static final String ADD_ROLE_PERMISSION = "AddRolePermissionMONGO_QUERY";
	    public static final String REMOVE_USER_FROM_ROLE = "RemoveUserFromRoleMONGO_QUERY";
	    public static final String REMOVE_ROLE_FROM_USER = "RemoveRoleFromUserMONGO_QUERY";
	    public static final String DELETE_ROLE = "DeleteRoleMONGO_QUERY";
	    public static final String ON_DELETE_ROLE_REMOVE_USER_ROLE = "OnDeleteRoleRemoveUserRoleMappingMONGO_QUERY";
	    public static final String ON_DELETE_ROLE_DELETE_PERMISSION = "OnDeleteRoleRemovePermissionsMONGO_QUERY";
	    public static final String DELETE_USER = "DeleteUserMONGO_QUERY";
	    public static final String ON_DELETE_USER_REMOVE_USER_ROLE = "OnDeleteUserRemoveUserRoleMappingMONGO_QUERY";
	    public static final String ON_DELETE_USER_REMOVE_ATTRIBUTE = "OnDeleteUserRemoveUserAttributeMONGO_QUERY";
	    public static final String ON_DELETE_USER_DELETE_PERMISSION= "OnDeleteUserRemovePermissionsMONGO_QUERY";

	    public static final String UPDATE_USER_PASSWORD = "UpdateUserPasswordMONGO_QUERY";
	    public static final String UPDATE_ROLE_NAME = "UpdateRoleNameMONGO_QUERY";
	    public static final String ADD_USER_PROPERTY = "AddUserPropertyMONGO_QUERY";
	    public static final String UPDATE_USER_PROPERTY = "UpdateUserPropertyMONGO_QUERY";
	    public static final String DELETE_USER_PROPERTY = "DeleteUserPropertyMONGO_QUERY";
	    public static final String USER_NAME_UNIQUE = "UserNameUniqueAcrossTenantsMONGO_QUERY";

	    public static final String SELECT_USER_MONGO_QUERY = "{'collection' : 'UM_USER','UM_USER_NAME' : '?','UM_TENANT_ID' : '?'}";
	    public static final String GET_ROLE_LIST_MONGO_QUERY = "{'collection' : 'UM_ROLE','UM_TENANT_ID' : '?','projection':{'UM_ROLE_NAME' : '1','_id' : '0'}}";
	    public static final String GET_USER_FILTER_MONGO_QUERY = "{'collection' : 'UM_USER','UM_USER_NAME' : '?','UM_TENANT_ID' : '?','projection' : {'UM_USER_NAME' : '1','$orderby' : {'UM_USER_NAME' : '1'}}}";
	    public static final String GET_USER_ROLE_MONGO_QUERY = "{'collection' : 'UM_ROLE','UM_TENANT_ID' : '?','projection' : {'UM_ROLE_NAME' : '1'},'$lookup' : [{'from' : 'UM_USER_ROLE','localField' : 'UM_ID','foreignField' : 'UM_ROLE_ID','UM_TENANT_ID' : '?'},{'from' : 'UM_USER','localField' : 'UM_ID','foreignField' : 'UM_ROLE_ID','UM_TENANT_ID' : '?'}]}";
	                                                   
	    public static final String GET_IS_ROLE_EXISTING_MONGO_QUERY = "{'collection' : 'UM_ROLE','UM_ROLE_NAME' : '?','UM_TENANT_ID' : '?','projection' : '{'UM_ID' : '1'}'}";
	    public static final String GET_USERS_IN_ROLE_MONGO_QUERY = "{'collection' : 'UM_USER','UM_TENANT_ID' : '?','role.UM_ROLE_NAME' : '?','role.UM_TENANT_ID' : '?','userRole.UM_TENANT_ID' : '?','projection' : {'UM_USER_NAME' : '1'},'$lookup' : '[{'from' : 'UM_USER_ROLE','localField' : 'UM_ID','foreignField' : 'UM_USER_ID','as' : 'userRole'},{'from' : 'UM_ROLE','localField' : 'UM_USER_ROLE.UM_ROLE_ID','foreignField' : 'UM_ROLE.UM_ID','as' : 'role'}]'}";
	    public static final String GET_IS_USER_EXISTING_MONGO_QUERY = "{'collection' : 'UM_USER','UM_USER_NAME' : '?','UM_TENANT_ID' : '?','projection' : '{'UM_ID' : '1'}'}";
	    public static final String GET_PROPS_FOR_PROFILE_MONGO_QUERY = "{'collection' : 'UM_USER_ATTRIBUTE','UM_PROFILE_ID' : '?','UM_TENANT_ID' : '?','users.UM_USER_NAME' : '?','users.UM_TENANT_ID' : '?','$lookup' : '{'from' : 'UM_USER','localField' : 'UM_USER_ID','foreignField' : 'UM_ID','as' : 'users'}','projection' : '{'UM_ATTR_NAME' : '1','UM_PROFILE_VALUE' : '1'}'}";
	    public static final String GET_PROP_FOR_PROFILE_MONGO_QUERY = "{'collection' : 'UM_USER_ATTRIBUTE','UM_ATTR_NAME' : '?','UM_PROFILE_ID' : '?','UM_TENANT_ID' : '?','users.UM_USER_NAME' : '?','users.UM_TENANT_ID' : '?','$lookup' : '{'from' : 'UM_USER','localField' : 'UM_USER_ID','foreignField' : 'UM_ID','as' : 'users'},'projection' : '{'UM_ATTR_VALUE' : '1'}''}";
	    public static final String GET_PROFILE_NAMES_MONGO_QUERY = "{'collection' : 'UM_USER_ATTRIBUTE','UM_TENANT_ID' : '?','projection' : '{'UM_PROFILE_ID' : '1'}','distinct' : 'UM_PROFILE_ID'}";
	    public static final String GET_PROFILE_NAMES_FOR_USER_MONGO_QUERY = "{'collection' : 'UM_USER_ATTRIBUTE','UM_USER_ID' : '?','projection' : '{'UM_PROFILE_ID' : '?'}','distinct' : 'UM_PROFILE_ID'}";
	    public static final String GET_PROFILE_NAMES_FOR_USER_MONGO_QUERY_CONDITION = "{'collection' : 'UM_USER','UM_USER_NAME' : '?','UM_TENANT_ID' : '?','projection' : '{'UM_ID' : '?'}'}";
	    public static final String GET_USERID_FROM_USERNAME_MONGO_QUERY = "{'collection' : 'UM_USER','UM_USER_NAME' : '?','UM_TENANT_ID' : '?','projection' : '{'UM_ID' : '1'}'}";
	    public static final String GET_USERNAME_FROM_TENANT_ID_MONGO_QUERY = "{'collection' : 'UM_USER','UM_TENANT_ID' : '?','projection' : '{'UM_USER_NAME' : '1'}'}";
	    public static final String GET_TENANT_ID_FROM_USERNAME_MONGO_QUERY = "{'collection' : 'UM_USER','UM_USER_NAME' : '?','projection' : '{'UM_TENANT_ID' : '?'}'}";
	                                                                 



	    public static final String ADD_USER_MONGO_QUERY = "{'collection' : 'UM_USER','UM_USER_NAME' : '?','UM_USER_PASSWORD' : '?','UM_SALT_VALUE' : '?','UM_REQUIRE_CHANGE' : '?','UM_CHANGED_TIME' : '?','UM_TENANT_ID' : '?'}";
	    public static final String ADD_USER_TO_ROLE_MONGO_QUERY = "{'collection' : 'UM_USER_ROLE','UM_USER_ID' : '?','UM_ROLE_ID' : '?','UM_TENANT_ID' : '?'}";
	    public static final String ADD_USER_TO_ROLE_MONGO_QUERY_CONDITION1 = "{'collection' : 'UM_USER','UM_USER_NAME' : '?','UM_TENANT_ID' : '?','projection' : '{'UM_ID' : '?'}'}";
	    public static final String ADD_USER_TO_ROLE_MONGO_QUERY_CONDITION2	= "{'collection' : 'UM_ROLE','UM_ROLE_NAME' : '?','UM_TENANT_ID' : '?','projection' : '{'UM_ID' : '?'}'}";
	    public static final String ADD_USER_PERMISSION_MONGO_QUERY = "AddUserPermission";
	    public static final String ADD_ROLE_MONGO_QUERY = "{'collection' : 'UM_ROLE','UM_ROLE_NAME' : '?','UM_TENANT_ID' : '?'}";
	    public static final String ADD_ROLE_TO_USER_MONGO_QUERY = "{'collection' : 'UM_USER_ROLE','UM_ROLE_ID' : '?','UM_USER_ID' : '?','UM_TENANT_ID' : '?'}";
	    public static final String ADD_ROLE_PERMISSION_MONGO_QUERY = "AddRolePermissionMONGO_QUERY";
	    public static final String REMOVE_USER_FROM_ROLE_MONGO_QUERY = "{'collection' : 'UM_USER_ROLE','UM_USER_ID' : '?','UM_ROLE_ID' : '?','UM_TENANT_ID' : '?'}";
	    public static final String REMOVE_ROLE_FROM_USER_MONGO_QUERY = "{'collection' : 'UM_USER_ROLE','UM_ROLE_ID' : '?','UM_USER_ID': '?','UM_TENANT_ID' : '?'}";
	    public static final String DELETE_ROLE_MONGO_QUERY = "{'collection' : 'UM_ROLE','UM_ROLE_NAME' : '?','UM_TENANT_ID' : '?'}";
	    public static final String ON_DELETE_ROLE_REMOVE_USER_ROLE_MONGO_QUERY = "DELETE FROM UM_USER_ROLE WHERE UM_ROLE_ID=(SELECT UM_ID FROM UM_ROLE WHERE UM_ROLE_NAME=? AND UM_TENANT_ID=?) AND UM_TENANT_ID=?";
	    public static final String ON_DELETE_ROLE_DELETE_PERMISSION_MONGO_QUERY = "OnDeleteRoleRemovePermissionsMONGO_QUERY";
	    public static final String DELETE_USER_MONGO_QUERY = "{'collection' : 'UM_USER','UM_USER_NAME' : '?','UM_TENANT_ID' : '?'}";
	    public static final String ON_DELETE_USER_REMOVE_USER_ROLE_MONGO_QUERY = "{'collection' : 'UM_USER_ROLE','UM_USER_ID' : '?','UM_TENANT_ID' : '?'}";
	    public static final String ON_DELETE_USER_REMOVE_ATTRIBUTE_MONGO_QUERY = "{'collection' : 'UM_USER_ATTRIBUTE','UM_USER_ID' : '?',UM_TENANT_ID : '?'}";
	    public static final String ON_DELETE_USER_DELETE_PERMISSION_MONGO_QUERY= "OnDeleteUserRemovePermissionsMONGO_QUERY";

	    public static final String UPDATE_USER_PASSWORD_MONGO_QUERY = "{'collection' : 'UM_USER','UM_USER_NAME' : '?','UM_TENANT_ID' : '?','projection' : '{'$set'  : '{'UM_USER_PASSWORD' : '?','UM_SALT_VALUE' : '?','UM_REQUIRE_CHANGE' : '?','UM_CHANGED_TIME' : '?'}'}'}";
	    public static final String UPDATE_ROLE_NAME_MONGO_QUERY="{'collection' : 'UM_ROLE','UM_ROLE_NAME' : '?','UM_TENANT_ID' : '?','projection' : '{'$set' : '{'UM_ROLE_NAME' : '?'}'}'}";


	    public static final String ADD_USER_PROPERTY_MONGO_QUERY = "{'collection' : 'UM_USER_ATTRIBUTE','UM_USER_ID' : '?','UM_ATTR_NAME' : '?','UM_ATTR_VALUE' : '?','UM_PROFILE_ID' : '?','UM_TENANT_ID' : '?'}";
	    public static final String UPDATE_USER_PROPERTY_MONGO_QUERY = "{'collection' : 'UM_USER_ATTRIBUTE','UM_USER_ID' : '?','UM_ATTR_NAME' : '?','UM_PROFILE_ID' : '?','UM_TENANT_ID' : '?','projection' : '{$set' : '{'UM_ATTR_VALUE' : '?'}}'}";
	    public static final String DELETE_USER_PROPERTY_MONGO_QUERY = "{'collection' : 'UM_USER_ATTRIBUTE','UM_USER_ID' : '?','UM_ATTR_NAME' : '?','UM_PROFILE_ID' : '?','UM_TENANT_ID' : '?'}";
	    public static final String USER_NAME_UNIQUE_MONGO_QUERY = "{'collection' : 'UM_USER_ATTRIBUTE','UM_USER_ID' : '?','UM_ATTR_NAME' : '?','UM_PROFILE_ID' : '?','UM_TENANT_ID' : '?'}";
	    
	    public static final String DIGEST_FUNCTION = "PasswordDigest";
	    public static final String STORE_SALTED_PASSWORDS = "StoreSaltedPassword";
	    
	    //properties
	    public static final String URL = "url";
	    public static final String USER_NAME = "userName";
	    public static final String PASSWORD = "password";
	    public static final String DRIVER_NAME = "driverName";
	    public static final String MAX_ACTIVE = "maxActive";
	    public static final String MAX_WAIT = "maxWait";
	    public static final String MIN_IDLE = "minIdle";
	    public static final String MAX_IDLE = "maxIdle";
	    public static final String VALIDATION_QUERY = "validationQuery";
	    public static final String DIALECT_FLAG = "dialectFlag";
	    

}