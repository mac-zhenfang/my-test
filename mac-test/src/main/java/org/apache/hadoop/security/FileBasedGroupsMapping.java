package org.apache.hadoop.security;

import java.io.IOException;
import java.util.List;

public class FileBasedGroupsMapping implements GroupMappingServiceProvider {

	@Override
	public List<String> getGroups(String user) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cacheGroupsRefresh() throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void cacheGroupsAdd(List<String> groups) throws IOException {
		// TODO Auto-generated method stub

	}
}
