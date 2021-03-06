/*
   Copyright 2010 Voice Technology Ind. e Com. Ltda.
 
   This file is part of RTSPClientLib.

    RTSPClientLib is free software: you can redistribute it and/or modify
    it under the terms of the GNU Lesser General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    RTSPClientLib is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public License
    along with RTSPClientLib.  If not, see <http://www.gnu.org/licenses/>.

*/
package br.com.voicetechnology.rtspclient.headers;


public class ContentLengthHeader extends BaseIntegerHeader
{
	public static final String NAME = "Content-Length";
	
	public ContentLengthHeader()
	{
		super(NAME);
	}
	
	public ContentLengthHeader(int value)
	{
		super(NAME, value);
	}

	public ContentLengthHeader(String header)
	{
		super(NAME, header);
	}

}
