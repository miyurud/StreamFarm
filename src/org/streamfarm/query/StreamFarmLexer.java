/**
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
 */

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class StreamFarmLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int DECIMAL=4;
    public static final int DIGIT=5;
    public static final int DRANGE=6;
    public static final int FILEPATH=7;
    public static final int HOSTNAME=8;
    public static final int MATRIXDEF=9;
    public static final int NUMBER=10;
    public static final int PROTOCOLS=11;
    public static final int URLPATH=12;
    public static final int VARNAME=13;
    public static final int X_Y_EXPR=14;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public StreamFarmLexer() {} 
    public StreamFarmLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public StreamFarmLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:2:7: ( '(' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:2:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:3:7: ( ')' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:3:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:4:7: ( '*' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:4:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:5:7: ( ',' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:5:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:6:7: ( 'AMPLIFYING' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:6:9: 'AMPLIFYING'
            {
            match("AMPLIFYING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:7:7: ( 'AS' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:7:9: 'AS'
            {
            match("AS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:8:7: ( 'ASPRINGS' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:8:9: 'ASPRINGS'
            {
            match("ASPRINGS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:9:7: ( 'CREATE' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:9:9: 'CREATE'
            {
            match("CREATE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:10:7: ( 'DATARATE' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:10:9: 'DATARATE'
            {
            match("DATARATE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:11:7: ( 'DELETE' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:11:9: 'DELETE'
            {
            match("DELETE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:12:7: ( 'DRANGE' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:12:9: 'DRANGE'
            {
            match("DRANGE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:13:7: ( 'ESPRINGS' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:13:9: 'ESPRINGS'
            {
            match("ESPRINGS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:14:7: ( 'FILTER' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:14:9: 'FILTER'
            {
            match("FILTER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:15:7: ( 'FILTERS' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:15:9: 'FILTERS'
            {
            match("FILTERS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:16:7: ( 'FOR' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:16:9: 'FOR'
            {
            match("FOR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:17:7: ( 'FROM' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:17:9: 'FROM'
            {
            match("FROM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:18:7: ( 'GSPRINGS' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:18:9: 'GSPRINGS'
            {
            match("GSPRINGS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:19:7: ( 'HOSTS' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:19:9: 'HOSTS'
            {
            match("HOSTS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:20:7: ( 'IN' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:20:9: 'IN'
            {
            match("IN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:21:7: ( 'KRONECKER' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:21:9: 'KRONECKER'
            {
            match("KRONECKER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:22:7: ( 'LEARN' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:22:9: 'LEARN'
            {
            match("LEARN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:23:7: ( 'LEARNING' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:23:9: 'LEARNING'
            {
            match("LEARNING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:24:7: ( 'LIST' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:24:9: 'LIST'
            {
            match("LIST"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:25:7: ( 'MATRIX' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:25:9: 'MATRIX'
            {
            match("MATRIX"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:26:7: ( 'MAXDRATE' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:26:9: 'MAXDRATE'
            {
            match("MAXDRATE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:27:7: ( 'NITER' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:27:9: 'NITER'
            {
            match("NITER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:28:7: ( 'NRPT' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:28:9: 'NRPT'
            {
            match("NRPT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:29:7: ( 'OF' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:29:9: 'OF'
            {
            match("OF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:30:7: ( 'ON' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:30:9: 'ON'
            {
            match("ON"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:31:7: ( 'PERIOD' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:31:9: 'PERIOD'
            {
            match("PERIOD"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:32:7: ( 'PSINKHOLES' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:32:9: 'PSINKHOLES'
            {
            match("PSINKHOLES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:33:7: ( 'PSPRINGS' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:33:9: 'PSPRINGS'
            {
            match("PSPRINGS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:34:7: ( 'PULSEWAVE' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:34:9: 'PULSEWAVE'
            {
            match("PULSEWAVE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:35:7: ( 'REMOVE' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:35:9: 'REMOVE'
            {
            match("REMOVE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:36:7: ( 'SAVE' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:36:9: 'SAVE'
            {
            match("SAVE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:37:7: ( 'SELECT' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:37:9: 'SELECT'
            {
            match("SELECT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:38:7: ( 'SESSION' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:38:9: 'SESSION'
            {
            match("SESSION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:39:7: ( 'SET' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:39:9: 'SET'
            {
            match("SET"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:40:7: ( 'SINKHOLES' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:40:9: 'SINKHOLES'
            {
            match("SINKHOLES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:41:7: ( 'SPRINGS' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:41:9: 'SPRINGS'
            {
            match("SPRINGS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:42:7: ( 'STATUS' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:42:9: 'STATUS'
            {
            match("STATUS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:43:7: ( 'SUM' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:43:9: 'SUM'
            {
            match("SUM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:44:7: ( 'USING' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:44:9: 'USING'
            {
            match("USING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:45:7: ( 'WITH' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:45:9: 'WITH'
            {
            match("WITH"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            int _type = DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:283:2: ( '0' .. '9' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "DECIMAL"
    public final void mDECIMAL() throws RecognitionException {
        try {
            int _type = DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:285:9: ( NUMBER '.' NUMBER )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:285:11: NUMBER '.' NUMBER
            {
            mNUMBER(); 


            match('.'); 

            mNUMBER(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DECIMAL"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:287:8: ( ( DIGIT )+ )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:287:10: ( DIGIT )+
            {
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:287:10: ( DIGIT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "PROTOCOLS"
    public final void mPROTOCOLS() throws RecognitionException {
        try {
            int _type = PROTOCOLS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:290:2: ( 'UDP' | 'TCP' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='U') ) {
                alt2=1;
            }
            else if ( (LA2_0=='T') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:290:5: 'UDP'
                    {
                    match("UDP"); 



                    }
                    break;
                case 2 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:291:3: 'TCP'
                    {
                    match("TCP"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PROTOCOLS"

    // $ANTLR start "URLPATH"
    public final void mURLPATH() throws RecognitionException {
        try {
            int _type = URLPATH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:293:9: ( '\"' 'http' ':' '//' ( HOSTNAME | ( HOSTNAME '.' )+ HOSTNAME ) ( '/' NUMBER )* ( '/' HOSTNAME )* '\"' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:293:17: '\"' 'http' ':' '//' ( HOSTNAME | ( HOSTNAME '.' )+ HOSTNAME ) ( '/' NUMBER )* ( '/' HOSTNAME )* '\"'
            {
            match('\"'); 

            match("http"); 



            match(':'); 

            match("//"); 



            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:293:33: ( HOSTNAME | ( HOSTNAME '.' )+ HOSTNAME )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:293:34: HOSTNAME
                    {
                    mHOSTNAME(); 


                    }
                    break;
                case 2 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:293:43: ( HOSTNAME '.' )+ HOSTNAME
                    {
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:293:43: ( HOSTNAME '.' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        alt3 = dfa3.predict(input);
                        switch (alt3) {
                    	case 1 :
                    	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:293:44: HOSTNAME '.'
                    	    {
                    	    mHOSTNAME(); 


                    	    match('.'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    mHOSTNAME(); 


                    }
                    break;

            }


            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:293:66: ( '/' NUMBER )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='/') ) {
                    int LA5_1 = input.LA(2);

                    if ( ((LA5_1 >= '0' && LA5_1 <= '9')) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:293:67: '/' NUMBER
            	    {
            	    match('/'); 

            	    mNUMBER(); 


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:293:78: ( '/' HOSTNAME )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='/') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:293:79: '/' HOSTNAME
            	    {
            	    match('/'); 

            	    mHOSTNAME(); 


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "URLPATH"

    // $ANTLR start "DRANGE"
    public final void mDRANGE() throws RecognitionException {
        try {
            int _type = DRANGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:295:9: ( NUMBER ',' NUMBER | NUMBER ',' NUMBER ',' NUMBER )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:295:11: NUMBER ',' NUMBER
                    {
                    mNUMBER(); 


                    match(','); 

                    mNUMBER(); 


                    }
                    break;
                case 2 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:295:29: NUMBER ',' NUMBER ',' NUMBER
                    {
                    mNUMBER(); 


                    match(','); 

                    mNUMBER(); 


                    match(','); 

                    mNUMBER(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DRANGE"

    // $ANTLR start "HOSTNAME"
    public final void mHOSTNAME() throws RecognitionException {
        try {
            int _type = HOSTNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:297:10: ( ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )+ | ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )+ NUMBER )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:297:12: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )+
                    {
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:297:12: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0 >= 'A' && LA8_0 <= 'Z')||(LA8_0 >= 'a' && LA8_0 <= 'z')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:
                    	    {
                    	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:298:3: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )+ NUMBER
                    {
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:298:3: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0 >= 'A' && LA9_0 <= 'Z')||(LA9_0 >= 'a' && LA9_0 <= 'z')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:
                    	    {
                    	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    mNUMBER(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HOSTNAME"

    // $ANTLR start "VARNAME"
    public final void mVARNAME() throws RecognitionException {
        try {
            int _type = VARNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:301:2: ( ( NUMBER )+ HOSTNAME | '\"' HOSTNAME '\"' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
                alt12=1;
            }
            else if ( (LA12_0=='\"') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:301:4: ( NUMBER )+ HOSTNAME
                    {
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:301:4: ( NUMBER )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:301:4: NUMBER
                    	    {
                    	    mNUMBER(); 


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);


                    mHOSTNAME(); 


                    }
                    break;
                case 2 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:302:10: '\"' HOSTNAME '\"'
                    {
                    match('\"'); 

                    mHOSTNAME(); 


                    match('\"'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VARNAME"

    // $ANTLR start "X_Y_EXPR"
    public final void mX_Y_EXPR() throws RecognitionException {
        try {
            int _type = X_Y_EXPR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:305:2: ( '\"' 'y' '=' ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) | '^' | '+' | '-' | '\\\\' | '*' | '(' | ')' )+ '\"' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:305:4: '\"' 'y' '=' ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) | '^' | '+' | '-' | '\\\\' | '*' | '(' | ')' )+ '\"'
            {
            match('\"'); 

            match('y'); 

            match('='); 

            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:305:13: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) | '^' | '+' | '-' | '\\\\' | '*' | '(' | ')' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0 >= '(' && LA13_0 <= '+')||LA13_0=='-'||(LA13_0 >= '0' && LA13_0 <= '9')||(LA13_0 >= 'A' && LA13_0 <= 'Z')||LA13_0=='\\'||LA13_0=='^'||(LA13_0 >= 'a' && LA13_0 <= 'z')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:
            	    {
            	    if ( (input.LA(1) >= '(' && input.LA(1) <= '+')||input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='\\'||input.LA(1)=='^'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "X_Y_EXPR"

    // $ANTLR start "MATRIXDEF"
    public final void mMATRIXDEF() throws RecognitionException {
        try {
            int _type = MATRIXDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:308:2: ( '\"' DECIMAL ',' DECIMAL ';' DECIMAL ',' DECIMAL '\"' )
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:308:4: '\"' DECIMAL ',' DECIMAL ';' DECIMAL ',' DECIMAL '\"'
            {
            match('\"'); 

            mDECIMAL(); 


            match(','); 

            mDECIMAL(); 


            match(';'); 

            mDECIMAL(); 


            match(','); 

            mDECIMAL(); 


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MATRIXDEF"

    // $ANTLR start "FILEPATH"
    public final void mFILEPATH() throws RecognitionException {
        try {
            int _type = FILEPATH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:311:2: ( '\"' ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )+ '.' ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )+ '\"' | '\"' ( '/' ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )+ )+ '.' ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )+ '\"' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\"') ) {
                int LA19_1 = input.LA(2);

                if ( ((LA19_1 >= 'A' && LA19_1 <= 'Z')||(LA19_1 >= 'a' && LA19_1 <= 'z')) ) {
                    alt19=1;
                }
                else if ( (LA19_1=='/') ) {
                    alt19=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:311:4: '\"' ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )+ '.' ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )+ '\"'
                    {
                    match('\"'); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:311:7: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0 >= 'A' && LA14_0 <= 'Z')||(LA14_0 >= 'a' && LA14_0 <= 'z')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:
                    	    {
                    	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);


                    match('.'); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:311:36: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0 >= 'A' && LA15_0 <= 'Z')||(LA15_0 >= 'a' && LA15_0 <= 'z')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:
                    	    {
                    	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    match('\"'); 

                    }
                    break;
                case 2 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:312:3: '\"' ( '/' ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )+ )+ '.' ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )+ '\"'
                    {
                    match('\"'); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:312:6: ( '/' ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )+ )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='/') ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:312:7: '/' ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )+
                    	    {
                    	    match('/'); 

                    	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:312:10: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )+
                    	    int cnt16=0;
                    	    loop16:
                    	    do {
                    	        int alt16=2;
                    	        int LA16_0 = input.LA(1);

                    	        if ( ((LA16_0 >= 'A' && LA16_0 <= 'Z')||(LA16_0 >= 'a' && LA16_0 <= 'z')) ) {
                    	            alt16=1;
                    	        }


                    	        switch (alt16) {
                    	    	case 1 :
                    	    	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:
                    	    	    {
                    	    	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                    	    	        input.consume();
                    	    	    }
                    	    	    else {
                    	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	    	        recover(mse);
                    	    	        throw mse;
                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt16 >= 1 ) break loop16;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(16, input);
                    	                throw eee;
                    	        }
                    	        cnt16++;
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);


                    match('.'); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:312:41: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0 >= 'A' && LA18_0 <= 'Z')||(LA18_0 >= 'a' && LA18_0 <= 'z')) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:
                    	    {
                    	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);


                    match('\"'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FILEPATH"

    public void mTokens() throws RecognitionException {
        // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | DIGIT | DECIMAL | NUMBER | PROTOCOLS | URLPATH | DRANGE | HOSTNAME | VARNAME | X_Y_EXPR | MATRIXDEF | FILEPATH )
        int alt20=55;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:10: T__15
                {
                mT__15(); 


                }
                break;
            case 2 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:16: T__16
                {
                mT__16(); 


                }
                break;
            case 3 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:22: T__17
                {
                mT__17(); 


                }
                break;
            case 4 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:28: T__18
                {
                mT__18(); 


                }
                break;
            case 5 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:34: T__19
                {
                mT__19(); 


                }
                break;
            case 6 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:40: T__20
                {
                mT__20(); 


                }
                break;
            case 7 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:46: T__21
                {
                mT__21(); 


                }
                break;
            case 8 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:52: T__22
                {
                mT__22(); 


                }
                break;
            case 9 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:58: T__23
                {
                mT__23(); 


                }
                break;
            case 10 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:64: T__24
                {
                mT__24(); 


                }
                break;
            case 11 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:70: T__25
                {
                mT__25(); 


                }
                break;
            case 12 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:76: T__26
                {
                mT__26(); 


                }
                break;
            case 13 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:82: T__27
                {
                mT__27(); 


                }
                break;
            case 14 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:88: T__28
                {
                mT__28(); 


                }
                break;
            case 15 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:94: T__29
                {
                mT__29(); 


                }
                break;
            case 16 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:100: T__30
                {
                mT__30(); 


                }
                break;
            case 17 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:106: T__31
                {
                mT__31(); 


                }
                break;
            case 18 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:112: T__32
                {
                mT__32(); 


                }
                break;
            case 19 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:118: T__33
                {
                mT__33(); 


                }
                break;
            case 20 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:124: T__34
                {
                mT__34(); 


                }
                break;
            case 21 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:130: T__35
                {
                mT__35(); 


                }
                break;
            case 22 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:136: T__36
                {
                mT__36(); 


                }
                break;
            case 23 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:142: T__37
                {
                mT__37(); 


                }
                break;
            case 24 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:148: T__38
                {
                mT__38(); 


                }
                break;
            case 25 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:154: T__39
                {
                mT__39(); 


                }
                break;
            case 26 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:160: T__40
                {
                mT__40(); 


                }
                break;
            case 27 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:166: T__41
                {
                mT__41(); 


                }
                break;
            case 28 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:172: T__42
                {
                mT__42(); 


                }
                break;
            case 29 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:178: T__43
                {
                mT__43(); 


                }
                break;
            case 30 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:184: T__44
                {
                mT__44(); 


                }
                break;
            case 31 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:190: T__45
                {
                mT__45(); 


                }
                break;
            case 32 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:196: T__46
                {
                mT__46(); 


                }
                break;
            case 33 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:202: T__47
                {
                mT__47(); 


                }
                break;
            case 34 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:208: T__48
                {
                mT__48(); 


                }
                break;
            case 35 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:214: T__49
                {
                mT__49(); 


                }
                break;
            case 36 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:220: T__50
                {
                mT__50(); 


                }
                break;
            case 37 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:226: T__51
                {
                mT__51(); 


                }
                break;
            case 38 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:232: T__52
                {
                mT__52(); 


                }
                break;
            case 39 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:238: T__53
                {
                mT__53(); 


                }
                break;
            case 40 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:244: T__54
                {
                mT__54(); 


                }
                break;
            case 41 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:250: T__55
                {
                mT__55(); 


                }
                break;
            case 42 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:256: T__56
                {
                mT__56(); 


                }
                break;
            case 43 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:262: T__57
                {
                mT__57(); 


                }
                break;
            case 44 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:268: T__58
                {
                mT__58(); 


                }
                break;
            case 45 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:274: DIGIT
                {
                mDIGIT(); 


                }
                break;
            case 46 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:280: DECIMAL
                {
                mDECIMAL(); 


                }
                break;
            case 47 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:288: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 48 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:295: PROTOCOLS
                {
                mPROTOCOLS(); 


                }
                break;
            case 49 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:305: URLPATH
                {
                mURLPATH(); 


                }
                break;
            case 50 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:313: DRANGE
                {
                mDRANGE(); 


                }
                break;
            case 51 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:320: HOSTNAME
                {
                mHOSTNAME(); 


                }
                break;
            case 52 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:329: VARNAME
                {
                mVARNAME(); 


                }
                break;
            case 53 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:337: X_Y_EXPR
                {
                mX_Y_EXPR(); 


                }
                break;
            case 54 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:346: MATRIXDEF
                {
                mMATRIXDEF(); 


                }
                break;
            case 55 :
                // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:1:356: FILEPATH
                {
                mFILEPATH(); 


                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA4_eotS =
        "\5\uffff";
    static final String DFA4_eofS =
        "\5\uffff";
    static final String DFA4_minS =
        "\1\101\1\42\1\uffff\1\42\1\uffff";
    static final String DFA4_maxS =
        "\2\172\1\uffff\1\71\1\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\1\1\uffff\1\2";
    static final String DFA4_specialS =
        "\5\uffff}>";
    static final String[] DFA4_transitionS = {
            "\32\1\6\uffff\32\1",
            "\1\2\13\uffff\1\4\1\2\12\3\7\uffff\32\1\6\uffff\32\1",
            "",
            "\1\2\13\uffff\1\4\1\2\12\3",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "293:33: ( HOSTNAME | ( HOSTNAME '.' )+ HOSTNAME )";
        }
    }
    static final String DFA3_eotS =
        "\5\uffff";
    static final String DFA3_eofS =
        "\5\uffff";
    static final String DFA3_minS =
        "\1\101\1\42\1\uffff\1\42\1\uffff";
    static final String DFA3_maxS =
        "\2\172\1\uffff\1\71\1\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\1\uffff\1\1";
    static final String DFA3_specialS =
        "\5\uffff}>";
    static final String[] DFA3_transitionS = {
            "\32\1\6\uffff\32\1",
            "\1\2\13\uffff\1\4\1\2\12\3\7\uffff\32\1\6\uffff\32\1",
            "",
            "\1\2\13\uffff\1\4\1\2\12\3",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "()+ loopback of 293:43: ( HOSTNAME '.' )+";
        }
    }
    static final String DFA7_eotS =
        "\3\uffff\1\4\2\uffff";
    static final String DFA7_eofS =
        "\6\uffff";
    static final String DFA7_minS =
        "\1\60\1\54\1\60\1\54\2\uffff";
    static final String DFA7_maxS =
        "\4\71\2\uffff";
    static final String DFA7_acceptS =
        "\4\uffff\1\1\1\2";
    static final String DFA7_specialS =
        "\6\uffff}>";
    static final String[] DFA7_transitionS = {
            "\12\1",
            "\1\2\3\uffff\12\1",
            "\12\3",
            "\1\5\3\uffff\12\3",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "295:1: DRANGE : ( NUMBER ',' NUMBER | NUMBER ',' NUMBER ',' NUMBER );";
        }
    }
    static final String DFA10_eotS =
        "\1\uffff\1\2\2\uffff";
    static final String DFA10_eofS =
        "\4\uffff";
    static final String DFA10_minS =
        "\1\101\1\60\2\uffff";
    static final String DFA10_maxS =
        "\2\172\2\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA10_specialS =
        "\4\uffff}>";
    static final String[] DFA10_transitionS = {
            "\32\1\6\uffff\32\1",
            "\12\3\7\uffff\32\1\6\uffff\32\1",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "297:1: HOSTNAME : ( ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )+ | ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )+ NUMBER );";
        }
    }
    static final String DFA20_eotS =
        "\5\uffff\22\32\1\75\1\32\2\uffff\1\32\1\112\12\32\1\125\6\32\1\135"+
        "\1\136\15\32\2\uffff\1\157\2\uffff\1\32\5\uffff\2\32\1\uffff\6\32"+
        "\1\173\3\32\1\uffff\7\32\2\uffff\10\32\1\u008e\3\32\1\u0092\1\32"+
        "\1\u0094\1\32\1\uffff\1\u0094\2\uffff\10\32\1\uffff\1\u009f\4\32"+
        "\1\u00a4\3\32\1\u00a8\5\32\1\u00ae\2\32\1\uffff\3\32\1\uffff\1\32"+
        "\1\uffff\1\u00b5\1\uffff\10\32\1\uffff\1\32\1\u00c0\1\32\1\u00c3"+
        "\1\uffff\2\32\1\u00c6\1\uffff\5\32\1\uffff\5\32\1\u00d1\2\uffff"+
        "\2\32\1\u00d5\1\32\1\u00d7\1\u00d8\1\32\1\u00db\1\32\1\uffff\2\32"+
        "\1\uffff\1\u00df\1\32\1\uffff\1\u00e1\3\32\1\u00e5\1\u00e6\3\32"+
        "\1\u00ea\2\uffff\2\32\1\uffff\1\32\2\uffff\1\32\1\u00ef\1\uffff"+
        "\3\32\1\uffff\1\32\1\uffff\3\32\2\uffff\1\u00f7\1\32\1\u00f9\1\uffff"+
        "\1\32\1\u00fb\1\u00fc\1\u00fd\1\uffff\1\u00fe\1\32\1\u0100\1\u0101"+
        "\1\32\1\u0103\1\32\1\uffff\1\32\1\uffff\1\32\4\uffff\1\u0107\2\uffff"+
        "\1\32\1\uffff\1\u0109\1\u010a\1\u010b\1\uffff\1\u010c\4\uffff";
    static final String DFA20_eofS =
        "\u010d\uffff";
    static final String DFA20_minS =
        "\1\42\4\uffff\1\115\1\122\1\101\1\123\1\111\1\123\1\117\1\116\1"+
        "\122\1\105\1\101\1\111\1\106\2\105\1\101\1\104\1\111\1\54\1\103"+
        "\1\57\1\uffff\1\120\1\60\1\105\1\124\1\114\1\101\1\120\1\114\1\122"+
        "\1\117\1\120\1\123\1\60\1\117\1\101\1\123\2\124\1\120\2\60\1\122"+
        "\1\111\1\114\1\115\1\126\1\114\1\116\1\122\1\101\1\115\1\111\1\120"+
        "\1\124\2\uffff\1\54\2\uffff\1\120\3\42\2\uffff\1\114\1\122\1\uffff"+
        "\2\101\1\105\1\116\1\122\1\124\1\60\1\115\1\122\1\124\1\uffff\1"+
        "\116\1\122\1\124\1\122\1\104\1\105\1\124\2\uffff\1\111\1\116\1\122"+
        "\1\123\1\117\2\105\1\123\1\60\1\113\1\111\1\124\1\60\1\116\1\60"+
        "\1\110\1\uffff\1\60\1\42\1\uffff\2\111\1\124\1\122\1\124\1\107\1"+
        "\111\1\105\1\uffff\1\60\1\111\1\123\1\105\1\116\1\60\1\111\2\122"+
        "\1\60\1\117\1\113\1\111\1\105\1\126\1\60\1\103\1\111\1\uffff\1\110"+
        "\1\116\1\125\1\uffff\1\107\1\uffff\1\60\1\42\1\106\1\116\1\105\1"+
        "\101\2\105\1\116\1\122\1\uffff\1\116\1\60\1\103\1\60\1\uffff\1\130"+
        "\1\101\1\60\1\uffff\1\104\1\110\1\116\1\127\1\105\1\uffff\1\124"+
        "\2\117\1\107\1\123\1\60\1\uffff\1\42\1\131\1\107\1\60\1\124\2\60"+
        "\1\107\1\60\1\107\1\uffff\1\113\1\116\1\uffff\1\60\1\124\1\uffff"+
        "\1\60\1\117\1\107\1\101\2\60\1\116\1\114\1\123\1\60\2\uffff\1\111"+
        "\1\123\1\uffff\1\105\2\uffff\1\123\1\60\1\uffff\1\123\1\105\1\107"+
        "\1\uffff\1\105\1\uffff\1\114\1\123\1\126\2\uffff\1\60\1\105\1\60"+
        "\1\uffff\1\116\3\60\1\uffff\1\60\1\122\2\60\1\105\1\60\1\105\1\uffff"+
        "\1\123\1\uffff\1\107\4\uffff\1\60\2\uffff\1\123\1\uffff\3\60\1\uffff"+
        "\1\60\4\uffff";
    static final String DFA20_maxS =
        "\1\172\4\uffff\1\123\2\122\1\123\1\122\1\123\1\117\1\116\1\122\1"+
        "\111\1\101\1\122\1\116\1\125\1\105\1\125\1\123\1\111\1\172\1\103"+
        "\1\172\1\uffff\1\120\1\172\1\105\1\124\1\114\1\101\1\120\1\114\1"+
        "\122\1\117\1\120\1\123\1\172\1\117\1\101\1\123\1\130\1\124\1\120"+
        "\2\172\1\122\1\120\1\114\1\115\1\126\1\124\1\116\1\122\1\101\1\115"+
        "\1\111\1\120\1\124\2\uffff\1\172\2\uffff\1\120\3\172\2\uffff\1\114"+
        "\1\122\1\uffff\2\101\1\105\1\116\1\122\1\124\1\172\1\115\1\122\1"+
        "\124\1\uffff\1\116\1\122\1\124\1\122\1\104\1\105\1\124\2\uffff\1"+
        "\111\1\116\1\122\1\123\1\117\2\105\1\123\1\172\1\113\1\111\1\124"+
        "\1\172\1\116\1\172\1\110\1\uffff\2\172\1\uffff\2\111\1\124\1\122"+
        "\1\124\1\107\1\111\1\105\1\uffff\1\172\1\111\1\123\1\105\1\116\1"+
        "\172\1\111\2\122\1\172\1\117\1\113\1\111\1\105\1\126\1\172\1\103"+
        "\1\111\1\uffff\1\110\1\116\1\125\1\uffff\1\107\1\uffff\2\172\1\106"+
        "\1\116\1\105\1\101\2\105\1\116\1\122\1\uffff\1\116\1\172\1\103\1"+
        "\172\1\uffff\1\130\1\101\1\172\1\uffff\1\104\1\110\1\116\1\127\1"+
        "\105\1\uffff\1\124\2\117\1\107\1\123\1\172\1\uffff\1\172\1\131\1"+
        "\107\1\172\1\124\2\172\1\107\1\172\1\107\1\uffff\1\113\1\116\1\uffff"+
        "\1\172\1\124\1\uffff\1\172\1\117\1\107\1\101\2\172\1\116\1\114\1"+
        "\123\1\172\2\uffff\1\111\1\123\1\uffff\1\105\2\uffff\1\123\1\172"+
        "\1\uffff\1\123\1\105\1\107\1\uffff\1\105\1\uffff\1\114\1\123\1\126"+
        "\2\uffff\1\172\1\105\1\172\1\uffff\1\116\3\172\1\uffff\1\172\1\122"+
        "\2\172\1\105\1\172\1\105\1\uffff\1\123\1\uffff\1\107\4\uffff\1\172"+
        "\2\uffff\1\123\1\uffff\3\172\1\uffff\1\172\4\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\25\uffff\1\63\42\uffff\1\55\1\56\1\uffff"+
        "\1\62\1\64\4\uffff\1\66\1\67\2\uffff\1\6\12\uffff\1\23\7\uffff\1"+
        "\34\1\35\20\uffff\1\57\2\uffff\1\65\10\uffff\1\17\22\uffff\1\46"+
        "\3\uffff\1\52\1\uffff\1\60\12\uffff\1\20\4\uffff\1\27\3\uffff\1"+
        "\33\5\uffff\1\43\6\uffff\1\54\12\uffff\1\22\2\uffff\1\25\2\uffff"+
        "\1\32\12\uffff\1\53\1\61\2\uffff\1\10\1\uffff\1\12\1\13\2\uffff"+
        "\1\15\3\uffff\1\30\1\uffff\1\36\3\uffff\1\42\1\44\3\uffff\1\51\4"+
        "\uffff\1\16\7\uffff\1\45\1\uffff\1\50\1\uffff\1\7\1\11\1\14\1\21"+
        "\1\uffff\1\26\1\31\1\uffff\1\40\3\uffff\1\24\1\uffff\1\41\1\47\1"+
        "\5\1\37";
    static final String DFA20_specialS =
        "\u010d\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\31\5\uffff\1\1\1\2\1\3\1\uffff\1\4\3\uffff\12\27\7\uffff"+
            "\1\5\1\32\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\32\1\15\1\16\1"+
            "\17\1\20\1\21\1\22\1\32\1\23\1\24\1\30\1\25\1\32\1\26\3\32\6"+
            "\uffff\32\32",
            "",
            "",
            "",
            "",
            "\1\33\5\uffff\1\34",
            "\1\35",
            "\1\36\3\uffff\1\37\14\uffff\1\40",
            "\1\41",
            "\1\42\5\uffff\1\43\2\uffff\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51\3\uffff\1\52",
            "\1\53",
            "\1\54\10\uffff\1\55",
            "\1\56\7\uffff\1\57",
            "\1\60\15\uffff\1\61\1\uffff\1\62",
            "\1\63",
            "\1\64\3\uffff\1\65\3\uffff\1\66\6\uffff\1\67\3\uffff\1\70\1"+
            "\71",
            "\1\73\16\uffff\1\72",
            "\1\74",
            "\1\100\1\uffff\1\76\1\uffff\12\77\7\uffff\32\101\6\uffff\32"+
            "\101",
            "\1\102",
            "\1\107\12\106\7\uffff\32\105\6\uffff\7\105\1\103\20\105\1\104"+
            "\1\105",
            "",
            "\1\110",
            "\12\32\7\uffff\17\32\1\111\12\32\6\uffff\32\32",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131\3\uffff\1\132",
            "\1\133",
            "\1\134",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\1\137",
            "\1\140\6\uffff\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145\6\uffff\1\146\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "",
            "\1\100\1\uffff\1\76\1\uffff\12\77\7\uffff\32\101\6\uffff\32"+
            "\101",
            "",
            "",
            "\1\160",
            "\1\101\13\uffff\1\107\1\uffff\12\101\7\uffff\32\105\6\uffff"+
            "\23\105\1\161\6\105",
            "\1\101\13\uffff\1\107\1\uffff\12\101\3\uffff\1\162\3\uffff"+
            "\32\105\6\uffff\32\105",
            "\1\101\13\uffff\1\107\1\uffff\12\101\7\uffff\32\105\6\uffff"+
            "\32\105",
            "",
            "",
            "\1\163",
            "\1\164",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\1\174",
            "\1\175",
            "\1\176",
            "",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "",
            "",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\1\u0093",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\1\u0095",
            "",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\1\101\13\uffff\1\107\1\uffff\12\101\7\uffff\32\105\6\uffff"+
            "\23\105\1\u0096\6\105",
            "",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\1\u00af",
            "\1\u00b0",
            "",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "\1\u00b4",
            "",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\1\101\13\uffff\1\107\1\uffff\12\101\7\uffff\32\105\6\uffff"+
            "\17\105\1\u00b6\12\105",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "",
            "\1\u00bf",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\1\u00c1",
            "\12\32\7\uffff\10\32\1\u00c2\21\32\6\uffff\32\32",
            "",
            "\1\u00c4",
            "\1\u00c5",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "",
            "\1\101\13\uffff\1\107\1\uffff\12\101\1\u00d2\6\uffff\32\105"+
            "\6\uffff\32\105",
            "\1\u00d3",
            "\1\u00d4",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\1\u00d6",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\1\u00d9",
            "\12\32\7\uffff\22\32\1\u00da\7\32\6\uffff\32\32",
            "\1\u00dc",
            "",
            "\1\u00dd",
            "\1\u00de",
            "",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\1\u00e0",
            "",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "",
            "",
            "\1\u00eb",
            "\1\u00ec",
            "",
            "\1\u00ed",
            "",
            "",
            "\1\u00ee",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "\1\u00f3",
            "",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "",
            "",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\1\u00f8",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "",
            "\1\u00fa",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\1\u00ff",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\1\u0102",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\1\u0104",
            "",
            "\1\u0105",
            "",
            "\1\u0106",
            "",
            "",
            "",
            "",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "",
            "",
            "\1\u0108",
            "",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | DIGIT | DECIMAL | NUMBER | PROTOCOLS | URLPATH | DRANGE | HOSTNAME | VARNAME | X_Y_EXPR | MATRIXDEF | FILEPATH );";
        }
    }
 

}