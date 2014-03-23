grammar StreamFarm;

/*===================================================================

Copyright 2014 Miyuru Dayarathna

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

* Name     = 'StreamFarm Grammer'
* Author   = 'Miyuru Dayarathna'
* Version  = 'Dev8'
* Period  = 'May - September 2011'
* Description    = The grammar of StreamFarm Query Language
*
=====================================================================*/


/*------------------------------------------------------------------
 * PARSER RULES
 *-----------------------------------------------------------------*/

expr	: create_expr | delete_expr | select_expr | status_expr | allocation_expr | deallocation_expr;

create_expr
	:
	  //Plain Springs and Sinkholes
	  'CREATE' (DIGIT|NUMBER) PROTOCOLS'PSPRINGS''FROM'FILEPATH'AS'VARNAME|	
	  'CREATE' (DIGIT|NUMBER) PROTOCOLS'PSPRINGS''FROM'FILEPATH'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))'AS'VARNAME|
	  'CREATE' (DIGIT|NUMBER) PROTOCOLS'PSPRINGS''FROM'FILEPATH'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))'AS'VARNAME'WITH''MAXDRATE'(DIGIT|NUMBER)|
          'CREATE'(DIGIT|NUMBER) PROTOCOLS'PSINKHOLES''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))'AS'VARNAME|
          'CREATE'(DIGIT|NUMBER) PROTOCOLS'PSINKHOLES''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))'AS'VARNAME'WITH''MAXDRATE'(DIGIT|NUMBER)|
          //Filters
          'CREATE''FILTER'X_Y_EXPR'AS'VARNAME'WITH''DRANGE'DRANGE'IN''PERIOD'(DIGIT|NUMBER)|
	  'CREATE''FILTER''PULSEWAVE''AS'VARNAME'WITH''DRANGE'DRANGE'IN''PERIOD'(DIGIT|NUMBER)|
	  //Graph Springs
  	  'CREATE' (DIGIT|NUMBER) PROTOCOLS 'KRONECKER''GSPRINGS''USING''MATRIX'MATRIXDEF'NITER'(DIGIT|NUMBER)|
  	  'CREATE' (DIGIT|NUMBER) PROTOCOLS 'KRONECKER''GSPRINGS''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))'USING''MATRIX'MATRIXDEF'NITER'(DIGIT|NUMBER)|
	  'CREATE' (DIGIT|NUMBER) PROTOCOLS 'KRONECKER''GSPRINGS''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))'AS'VARNAME'USING''MATRIX'MATRIXDEF'NITER'(DIGIT|NUMBER)|
  	  'CREATE' (DIGIT|NUMBER) PROTOCOLS 'KRONECKER''GSPRINGS''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))'AS'VARNAME'WITH''MAXDRATE'(DIGIT|NUMBER)'USING''MATRIX'MATRIXDEF'NITER'(DIGIT|NUMBER)|
    	  //Emulator Springs
  	  'CREATE' (DIGIT|NUMBER) PROTOCOLS 'ESPRINGS''FROM'URLPATH'AS'VARNAME|
  	  'CREATE' (DIGIT|NUMBER) PROTOCOLS 'ESPRINGS''FROM'URLPATH'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))'AS'VARNAME|
  	  'CREATE' (DIGIT|NUMBER) PROTOCOLS 'ESPRINGS''FROM'URLPATH'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))'AS'VARNAME'WITH''MAXDRATE'(DIGIT|NUMBER)'LEARN''FOR'(DIGIT|NUMBER)|
    	  'CREATE' (DIGIT|NUMBER) PROTOCOLS 'ESPRINGS''FROM'URLPATH'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))'AS'VARNAME'WITH''MAXDRATE'(DIGIT|NUMBER)'LEARN''FOR'(DIGIT|NUMBER)'SAVE'|
    	  'CREATE' (DIGIT|NUMBER) PROTOCOLS 'ESPRINGS''FROM'URLPATH'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
  	  'CREATE' (DIGIT|NUMBER) PROTOCOLS 'ESPRINGS''FROM'URLPATH'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))'WITH''MAXDRATE'(DIGIT|NUMBER)'LEARN''FOR'(DIGIT|NUMBER)|
    	  'CREATE' (DIGIT|NUMBER) PROTOCOLS 'ESPRINGS''FROM'URLPATH'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))'WITH''MAXDRATE'(DIGIT|NUMBER)'LEARN''FOR'(DIGIT|NUMBER)'SAVE'|
    	  
    	  //Amplifier Springs
   	  'CREATE' (DIGIT|NUMBER) PROTOCOLS 'ASPRINGS''FROM'URLPATH'AS'VARNAME'WITH''MAXDRATE'(DIGIT|NUMBER)'AMPLIFYING'URLPATH|
   	  'CREATE' (DIGIT|NUMBER) PROTOCOLS 'ASPRINGS''FROM'URLPATH'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))'AS'VARNAME'WITH''MAXDRATE'(DIGIT|NUMBER)'AMPLIFYING'URLPATH;


allocation_expr
	: 'SET''FILTERS'(VARNAME|(VARNAME',')+VARNAME)'ON'PROTOCOLS 'PSPRINGS'((DIGIT|NUMBER)|(((DIGIT|NUMBER)',')+ (DIGIT|NUMBER)))'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SET''FILTERS'(VARNAME|(VARNAME',')+VARNAME)'ON'PROTOCOLS 'PSPRINGS'((DIGIT|NUMBER)|(((DIGIT|NUMBER)',')+ (DIGIT|NUMBER)))'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))'NRPT'(DIGIT|NUMBER);		

deallocation_expr
	: 'REMOVE''FILTERS''*''ON'PROTOCOLS'PSPRINGS'((DIGIT|NUMBER)|(((DIGIT|NUMBER)',')+ (DIGIT|NUMBER)))'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
  	  'REMOVE''FILTERS''*''ON''PSPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
    	  'REMOVE''FILTERS''*''ON''PSPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))'OF'(VARNAME|(VARNAME',')+VARNAME)|
    	  'REMOVE''FILTERS'(VARNAME|(VARNAME',')+VARNAME)'ON''PSPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))'OF'(VARNAME|(VARNAME',')+VARNAME)|    	  
      	  'REMOVE''FILTERS''*''ON''PSPRINGS''*''OF'(VARNAME|(VARNAME',')+VARNAME)|
    	  'REMOVE''FILTERS'(VARNAME|(VARNAME',')+VARNAME)'ON''PSPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
      	  'REMOVE''FILTERS'(VARNAME|(VARNAME',')+VARNAME)'ON''PSPRINGS'((DIGIT|NUMBER)|(((DIGIT|NUMBER)',')+ (DIGIT|NUMBER)))'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
       	  'REMOVE''FILTERS''*''ON''PSPRINGS'((DIGIT|NUMBER)|(((DIGIT|NUMBER)',')+ (DIGIT|NUMBER)))'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
       	  'REMOVE''FILTERS'(VARNAME|(VARNAME',')+VARNAME)'ON'PROTOCOLS 'PSPRINGS'((DIGIT|NUMBER)|(((DIGIT|NUMBER)',')+ (DIGIT|NUMBER)))'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME));
	
delete_expr
	:	
	  //Plain Springs
          'DELETE''PSPRINGS''*''OF'VARNAME|
          'DELETE''PSPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
          'DELETE'PROTOCOLS 'PSPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
          'DELETE'PROTOCOLS 'PSPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))'OF'VARNAME|
          'DELETE''PSPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))'OF'VARNAME|
	  'DELETE'PROTOCOLS 'PSPRINGS'((DIGIT|NUMBER)|(((DIGIT|NUMBER)',')+ (DIGIT|NUMBER)))'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
  	  //Emulator Springs
          'DELETE''ESPRINGS''*''OF'VARNAME|
          'DELETE''ESPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
          'DELETE'PROTOCOLS 'ESPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
          'DELETE'PROTOCOLS 'ESPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))'OF'VARNAME|
          'DELETE''ESPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))'OF'VARNAME|
	  'DELETE'PROTOCOLS 'ESPRINGS'((DIGIT|NUMBER)|(((DIGIT|NUMBER)',')+ (DIGIT|NUMBER)))'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  //AMPLIFIER Springs
	  'DELETE''ASPRINGS''*''OF'VARNAME|
          'DELETE''ASPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
          'DELETE'PROTOCOLS 'ASPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
          'DELETE'PROTOCOLS 'ASPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))'OF'VARNAME|
          'DELETE''ASPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))'OF'VARNAME|
	  'DELETE'PROTOCOLS 'ASPRINGS'((DIGIT|NUMBER)|(((DIGIT|NUMBER)',')+ (DIGIT|NUMBER)))'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
  	  //Graph Springs
  	  'DELETE''GSPRINGS''*''OF'VARNAME|
          'DELETE''GSPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
          'DELETE'PROTOCOLS 'GSPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
          'DELETE'PROTOCOLS 'GSPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))'OF'VARNAME|
          'DELETE''GSPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))'OF'VARNAME|
	  'DELETE'PROTOCOLS 'GSPRINGS'((DIGIT|NUMBER)|(((DIGIT|NUMBER)',')+ (DIGIT|NUMBER)))'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  //All Springs
          'DELETE''SPRINGS''*''OF'VARNAME|
          'DELETE''SPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
          'DELETE'PROTOCOLS 'SPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|	  
	  //All Sinkholes
	  'DELETE''SINKHOLES''*''OF'VARNAME|
          'DELETE''SINKHOLES''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
          'DELETE'PROTOCOLS 'SINKHOLES''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  //Plain Sinkholes
	  'DELETE''PSINKHOLES''*''OF'VARNAME|
          'DELETE''PSINKHOLES''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
          'DELETE'PROTOCOLS 'PSINKHOLES''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'DELETE'PROTOCOLS 'PSINKHOLES'((DIGIT|NUMBER)|(((DIGIT|NUMBER)',')+ (DIGIT|NUMBER)))'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  //Filters
	  'DELETE''FILTERS''*'|
	  'DELETE''FILTERS'(VARNAME|(VARNAME',')+VARNAME)|
	  'DELETE''FILTERS'(VARNAME|(VARNAME',')+VARNAME)'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'DELETE''FILTERS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
  	  'DELETE''FILTERS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))'OF'VARNAME|
  	  'DELETE''FILTERS''*''OF'VARNAME|
  	  'DELETE''FILTERS'(VARNAME|(VARNAME',')+VARNAME)'OF'VARNAME;

select_expr
	: 
	//--------------------------------------- For all Springs and Sinkholes ----------------------------------------------
	  //Springs and Sinkholes Count
	  'SELECT''*' PROTOCOLS 'SPRINGS'|
	  'SELECT'(DIGIT|NUMBER) PROTOCOLS 'SPRINGS'|
	  'SELECT''*' PROTOCOLS 'SINKHOLES'|
	  'SELECT'(DIGIT|NUMBER) PROTOCOLS 'SINKHOLES'|
  
  	  //Springs Data Rate
	  'SELECT''DATARATE''FROM''SPRINGS'|	  
	  'SELECT''DATARATE''FROM''SPRINGS''*''OF'VARNAME|
  	  'SELECT''DATARATE''FROM''SPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''DATARATE''FROM''SPRINGS''*''OF'VARNAME'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''DATARATE''FROM'PROTOCOLS 'SPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''DATARATE''FROM'PROTOCOLS 'SPRINGS'((DIGIT|NUMBER)|(((DIGIT|NUMBER)',')+ (DIGIT|NUMBER)))'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|

          //Sinkholes Data Rate
	  'SELECT''DATARATE''FROM''SINKHOLES'|	  
	  'SELECT''DATARATE''FROM''SINKHOLES''*''OF'VARNAME|
  	  'SELECT''DATARATE''FROM''SINKHOLES''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''DATARATE''FROM''SINKHOLES''*''OF'VARNAME'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''DATARATE''FROM'PROTOCOLS 'SINKHOLES''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''DATARATE''FROM'PROTOCOLS 'SINKHOLES'((DIGIT|NUMBER)|(((DIGIT|NUMBER)',')+ (DIGIT|NUMBER)))'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  
	  //Aggregated Data Rate of Springs
	  'SELECT''SUM''(''DATARATE'')''FROM''SPRINGS'|	  
	  'SELECT''SUM''(''DATARATE'')''FROM''SPRINGS''*''OF'VARNAME|
  	  'SELECT''SUM''(''DATARATE'')''FROM''SPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''SUM''(''DATARATE'')''FROM''SPRINGS''*''OF'VARNAME'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''SUM''(''DATARATE'')''FROM'PROTOCOLS 'SPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''SUM''(''DATARATE'')''FROM'PROTOCOLS 'SPRINGS'((DIGIT|NUMBER)|(((DIGIT|NUMBER)',')+ (DIGIT|NUMBER)))'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|

          //Aggregated Data Rate of Sinkholes
	  'SELECT''SUM''(''DATARATE'')''FROM''SINKHOLES'|	  
	  'SELECT''SUM''(''DATARATE'')''FROM''SINKHOLES''*''OF'VARNAME|
  	  'SELECT''SUM''(''DATARATE'')''FROM''SINKHOLES''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''SUM''(''DATARATE'')''FROM''SINKHOLES''*''OF'VARNAME'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''SUM''(''DATARATE'')''FROM'PROTOCOLS 'SINKHOLES''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''SUM''(''DATARATE'')''FROM'PROTOCOLS 'SINKHOLES'((DIGIT|NUMBER)|(((DIGIT|NUMBER)',')+ (DIGIT|NUMBER)))'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  
	//--------------------------------------- For Plain Springs and Sinkholes (i.e. PSPRINGS and PSINKHOLES ) ----------------------------------------------
	  //Springs and Sinkholes Count
	  'SELECT''*' PROTOCOLS 'PSPRINGS'|
	  'SELECT'(DIGIT|NUMBER) PROTOCOLS 'PSPRINGS'|
	  'SELECT''*' PROTOCOLS 'PSINKHOLES'|
	  'SELECT'(DIGIT|NUMBER) PROTOCOLS 'PSINKHOLES'|
  
  	  //Springs Data Rate
	  'SELECT''DATARATE''FROM''PSPRINGS'|	  
	  'SELECT''DATARATE''FROM''PSPRINGS''*''OF'VARNAME|
  	  'SELECT''DATARATE''FROM''PSPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''DATARATE''FROM''PSPRINGS''*''OF'VARNAME'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''DATARATE''FROM'PROTOCOLS 'PSPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''DATARATE''FROM'PROTOCOLS 'PSPRINGS'((DIGIT|NUMBER)|(((DIGIT|NUMBER)',')+ (DIGIT|NUMBER)))'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|

          //Sinkholes Data Rate
	  'SELECT''DATARATE''FROM''PSINKHOLES'|	  
	  'SELECT''DATARATE''FROM''PSINKHOLES''*''OF'VARNAME|
  	  'SELECT''DATARATE''FROM''PSINKHOLES''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''DATARATE''FROM''PSINKHOLES''*''OF'VARNAME'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''DATARATE''FROM'PROTOCOLS 'PSINKHOLES''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''DATARATE''FROM'PROTOCOLS 'PSINKHOLES'((DIGIT|NUMBER)|(((DIGIT|NUMBER)',')+ (DIGIT|NUMBER)))'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  
	  //Aggregated Data Rate of Springs
	  'SELECT''SUM''(''DATARATE'')''FROM''PSPRINGS'|	  
	  'SELECT''SUM''(''DATARATE'')''FROM''PSPRINGS''*''OF'VARNAME|
  	  'SELECT''SUM''(''DATARATE'')''FROM''PSPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''SUM''(''DATARATE'')''FROM''PSPRINGS''*''OF'VARNAME'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''SUM''(''DATARATE'')''FROM'PROTOCOLS 'PSPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''SUM''(''DATARATE'')''FROM'PROTOCOLS 'PSPRINGS'((DIGIT|NUMBER)|(((DIGIT|NUMBER)',')+ (DIGIT|NUMBER)))'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|

          //Aggregated Data Rate of Sinkholes
	  'SELECT''SUM''(''DATARATE'')''FROM''PSINKHOLES'|	  
	  'SELECT''SUM''(''DATARATE'')''FROM''PSINKHOLES''*''OF'VARNAME|
  	  'SELECT''SUM''(''DATARATE'')''FROM''PSINKHOLES''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''SUM''(''DATARATE'')''FROM''PSINKHOLES''*''OF'VARNAME'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''SUM''(''DATARATE'')''FROM'PROTOCOLS 'PSINKHOLES''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''SUM''(''DATARATE'')''FROM'PROTOCOLS 'PSINKHOLES'((DIGIT|NUMBER)|(((DIGIT|NUMBER)',')+ (DIGIT|NUMBER)))'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  
//--------------------------------------- For Emulator Springs (i.e. ESPRINGS ) ----------------------------------------------
	  //Springs and Sinkholes Count
	  'SELECT''*' PROTOCOLS 'ESPRINGS'|
	  'SELECT'(DIGIT|NUMBER) PROTOCOLS 'ESPRINGS'|
  
  	  //Springs Data Rate
	  'SELECT''DATARATE''FROM''ESPRINGS'|	  
	  'SELECT''DATARATE''FROM''ESPRINGS''*''OF'VARNAME|
  	  'SELECT''DATARATE''FROM''ESPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''DATARATE''FROM''ESPRINGS''*''OF'VARNAME'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''DATARATE''FROM'PROTOCOLS 'ESPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''DATARATE''FROM'PROTOCOLS 'ESPRINGS'((DIGIT|NUMBER)|(((DIGIT|NUMBER)',')+ (DIGIT|NUMBER)))'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
  
	  //Aggregated Data Rate of Springs
	  'SELECT''SUM''(''DATARATE'')''FROM''ESPRINGS'|	  
	  'SELECT''SUM''(''DATARATE'')''FROM''ESPRINGS''*''OF'VARNAME|
  	  'SELECT''SUM''(''DATARATE'')''FROM''ESPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''SUM''(''DATARATE'')''FROM''ESPRINGS''*''OF'VARNAME'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''SUM''(''DATARATE'')''FROM'PROTOCOLS 'ESPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''SUM''(''DATARATE'')''FROM'PROTOCOLS 'ESPRINGS'((DIGIT|NUMBER)|(((DIGIT|NUMBER)',')+ (DIGIT|NUMBER)))'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|

	  //--------------------------------------- For Graph Springs (i.e. GSPRINGS) ----------------------------------------------
	  //Springs and Sinkholes Count
	  'SELECT''*' PROTOCOLS 'GSPRINGS'|
	  'SELECT'(DIGIT|NUMBER) PROTOCOLS 'GSPRINGS'|
  
  	  //Springs Data Rate
	  'SELECT''DATARATE''FROM''GSPRINGS'|	  
	  'SELECT''DATARATE''FROM''GSPRINGS''*''OF'VARNAME|
  	  'SELECT''DATARATE''FROM''GSPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''DATARATE''FROM''GSPRINGS''*''OF'VARNAME'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''DATARATE''FROM'PROTOCOLS 'GSPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''DATARATE''FROM'PROTOCOLS 'GSPRINGS'((DIGIT|NUMBER)|(((DIGIT|NUMBER)',')+ (DIGIT|NUMBER)))'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
  
	  //Aggregated Data Rate of Springs
	  'SELECT''SUM''(''DATARATE'')''FROM''GSPRINGS'|	  
	  'SELECT''SUM''(''DATARATE'')''FROM''GSPRINGS''*''OF'VARNAME|
  	  'SELECT''SUM''(''DATARATE'')''FROM''GSPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''SUM''(''DATARATE'')''FROM''GSPRINGS''*''OF'VARNAME'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''SUM''(''DATARATE'')''FROM'PROTOCOLS 'GSPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''SUM''(''DATARATE'')''FROM'PROTOCOLS 'GSPRINGS'((DIGIT|NUMBER)|(((DIGIT|NUMBER)',')+ (DIGIT|NUMBER)))'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|

	  //--------------------------------------- For Amplifier Springs(i.e. ASPRINGS ) ----------------------------------------------
	  //Springs and Sinkholes Count
	  'SELECT''*' PROTOCOLS 'ASPRINGS'|
	  'SELECT'(DIGIT|NUMBER) PROTOCOLS 'ASPRINGS'|
  
  	  //Springs Data Rate
	  'SELECT''DATARATE''FROM''ASPRINGS'|	  
	  'SELECT''DATARATE''FROM''ASPRINGS''*''OF'VARNAME|
  	  'SELECT''DATARATE''FROM''ASPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''DATARATE''FROM''ASPRINGS''*''OF'VARNAME'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''DATARATE''FROM'PROTOCOLS 'ASPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''DATARATE''FROM'PROTOCOLS 'ASPRINGS'((DIGIT|NUMBER)|(((DIGIT|NUMBER)',')+ (DIGIT|NUMBER)))'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
  
	  //Aggregated Data Rate of Springs
	  'SELECT''SUM''(''DATARATE'')''FROM''ASPRINGS'|	  
	  'SELECT''SUM''(''DATARATE'')''FROM''ASPRINGS''*''OF'VARNAME|
  	  'SELECT''SUM''(''DATARATE'')''FROM''ASPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''SUM''(''DATARATE'')''FROM''ASPRINGS''*''OF'VARNAME'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''SUM''(''DATARATE'')''FROM'PROTOCOLS 'ASPRINGS''*''ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME))|
	  'SELECT''SUM''(''DATARATE'')''FROM'PROTOCOLS 'ASPRINGS'((DIGIT|NUMBER)|(((DIGIT|NUMBER)',')+ (DIGIT|NUMBER)))'ON'(HOSTNAME|((HOSTNAME',')+ HOSTNAME));

status_expr
	:	 'LIST''STATUS'|
		 'LIST''HOSTS'|
		 'LIST''ESPRINGS''SESSION''STATUS'|
		 'LIST''LEARNING''STATUS''OF'VARNAME;

/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/
//SPRINGS - The Super class of all springs
//ESPRINGS - Emulator springs which learns from the contents of the data streams they are presented with
//GSPRINGS - These are graph springs which generates graph data as continuous streams
//PSPRINGS - The plain springs. These are just plain data generator springs that generates data ata a specific rate.

//SPRINGTYPES 
//	:	'SPRINGS' | 'ESPRINGS' | 'GSPRINGS' | 'PSPRINGS';
	
//SINKHOLES - The Super class of all Sinkholes
//PSINKHOLES - The plain sinkholes. They just pull the data from the application continuously in a specific rate.
//SINKHOLETYPES
//	:	'SINKHOLES' | 'PSINKHOLES';

DIGIT 
	:	'0'..'9';

DECIMAL	:	NUMBER'.'NUMBER;

NUMBER	:	(DIGIT)+;

PROTOCOLS 
	:	 'UDP' |
		'TCP';
		
URLPATH :       '"''http'':''//'(HOSTNAME|(HOSTNAME'.')+HOSTNAME)('/'NUMBER)*('/'HOSTNAME)*'"';	

DRANGE 	:	NUMBER','NUMBER | NUMBER','NUMBER','NUMBER;

HOSTNAME :	(('a'..'z') | ('A'..'Z'))+ |
		(('a'..'z') | ('A'..'Z'))+ NUMBER;

VARNAME 
	:	NUMBER + HOSTNAME |
	        '"'HOSTNAME'"';
	        
X_Y_EXPR 
	:	'"''y''='(('a'..'z') | ('A'..'Z')|('0'..'9')|'^'|'+'|'-'|'\\'|'*'|'('|')')+'"';
	
MATRIXDEF
	:	'"'DECIMAL','DECIMAL';'DECIMAL','DECIMAL'"';     
	
FILEPATH 
	:	'"'(('a'..'z') | ('A'..'Z'))+'.'(('a'..'z') | ('A'..'Z'))+'"' |
		'"'('/'(('a'..'z') | ('A'..'Z'))+)+'.'(('a'..'z') | ('A'..'Z'))+'"' ;