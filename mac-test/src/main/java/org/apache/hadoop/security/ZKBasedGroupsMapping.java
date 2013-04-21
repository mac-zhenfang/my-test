package org.apache.hadoop.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * This is a mapping that get the key:val of the group information from
 * Zookeeper this is to 1. Support automatic refresh of groups 2. Support groups
 * self-definition
 * */
public class ZKBasedGroupsMapping implements GroupMappingServiceProvider {

	private final ConcurrentHashMap<String, List<String>> userGroupsMap = new ConcurrentHashMap<String, List<String>>();

	@Override
	public List<String> getGroups(String user) throws IOException {
		if (!userGroupsMap.contains(user)) {
			List<String> grpSet = getFromZk(user);
			userGroupsMap.put(user, grpSet);
		}
		return userGroupsMap.get(user);
	}

	@Override
	public void cacheGroupsRefresh() throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void cacheGroupsAdd(List<String> groups) throws IOException {
		// TODO Auto-generated method stub

	}

	private List<String> getFromZk(final String user) {
		// FIXME - hardcode
		List<String> groupSet = new ArrayList<String>();
		groupSet.add("wbx11");
		return groupSet;
	}
}
