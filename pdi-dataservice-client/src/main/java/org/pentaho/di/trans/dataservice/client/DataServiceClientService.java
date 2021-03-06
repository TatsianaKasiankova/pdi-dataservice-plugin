/*! ******************************************************************************
 *
 * Pentaho Data Integration
 *
 * Copyright (C) 2002-2017 by Hitachi Vantara : http://www.pentaho.com
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

package org.pentaho.di.trans.dataservice.client;

import org.pentaho.di.repository.Repository;
import org.pentaho.di.trans.dataservice.jdbc.ThinServiceInformation;
import org.pentaho.metastore.api.IMetaStore;

import java.io.DataInputStream;
import java.sql.SQLException;
import java.util.List;

public interface DataServiceClientService {
  void setMetaStore( IMetaStore metaStore );
  void setRepository( Repository repository );
  DataInputStream query( String sql, int maxRows ) throws SQLException;
  List<ThinServiceInformation> getServiceInformation() throws SQLException;
  ThinServiceInformation getServiceInformation( String name ) throws SQLException;
  List<String> getServiceNames() throws SQLException;
  List<String> getServiceNames( String serviceName ) throws SQLException;
}
