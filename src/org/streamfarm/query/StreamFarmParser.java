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

package org.streamfarm.query;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class StreamFarmParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DECIMAL", "DIGIT", "DRANGE", "FILEPATH", "HOSTNAME", "MATRIXDEF", "NUMBER", "PROTOCOLS", "URLPATH", "VARNAME", "X_Y_EXPR", "'('", "')'", "'*'", "','", "'AMPLIFYING'", "'AS'", "'ASPRINGS'", "'CREATE'", "'DATARATE'", "'DELETE'", "'DRANGE'", "'ESPRINGS'", "'FILTER'", "'FILTERS'", "'FOR'", "'FROM'", "'GSPRINGS'", "'HOSTS'", "'IN'", "'KRONECKER'", "'LEARN'", "'LEARNING'", "'LIST'", "'MATRIX'", "'MAXDRATE'", "'NITER'", "'NRPT'", "'OF'", "'ON'", "'PERIOD'", "'PSINKHOLES'", "'PSPRINGS'", "'PULSEWAVE'", "'REMOVE'", "'SAVE'", "'SELECT'", "'SESSION'", "'SET'", "'SINKHOLES'", "'SPRINGS'", "'STATUS'", "'SUM'", "'USING'", "'WITH'"
    };

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
    public static final int AST=17;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public StreamFarmParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public StreamFarmParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return StreamFarmParser.tokenNames; }
    public String getGrammarFileName() { return "E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g"; } //No need

    public final QueryResults expr() throws RecognitionException {
    	QueryResults result = null;
        try {
            int alt1=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt1=1;
                }
                break;
            case 24:
                {
                alt1=2;
                }
                break;
            case 50:
                {
                alt1=3;
                }
                break;
            case 37:
                {
                alt1=4;
                }
                break;
            case 52:
                {
                alt1=5;
                }
                break;
            case 48:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    {
                    pushFollow(FOLLOW_create_expr_in_expr17);
                    result = create_expr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    {
                    pushFollow(FOLLOW_delete_expr_in_expr21);
                    result = delete_expr();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    {
                    pushFollow(FOLLOW_select_expr_in_expr25);
                    result = select_expr();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    {
                    pushFollow(FOLLOW_status_expr_in_expr29);
                    result = status_expr();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    {
                    pushFollow(FOLLOW_allocation_expr_in_expr33);
                    result = allocation_expr();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    {
                    pushFollow(FOLLOW_deallocation_expr_in_expr37);
                    result = deallocation_expr();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }

    public final QueryResults create_expr() throws RecognitionException {
    	QueryResults result = null;
        try {
            int alt30=20;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    {
                    match(input,22,FOLLOW_22_in_create_expr53); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_create_expr61); 

                    match(input,46,FOLLOW_46_in_create_expr62); 

                    match(input,30,FOLLOW_30_in_create_expr63); 

                    match(input,FILEPATH,FOLLOW_FILEPATH_in_create_expr64); 

                    match(input,20,FOLLOW_20_in_create_expr65); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_create_expr66); 

                    result = QueryResults.CREATE_N_PROTOCOL_PSPRINGS_FROM_FILE_AS_VARNAME; //Case1
                    }
                    break;
                case 2 :
                    {
                    match(input,22,FOLLOW_22_in_create_expr73); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_create_expr81); 

                    match(input,46,FOLLOW_46_in_create_expr82); 

                    match(input,30,FOLLOW_30_in_create_expr83); 

                    match(input,FILEPATH,FOLLOW_FILEPATH_in_create_expr84); 

                    match(input,43,FOLLOW_43_in_create_expr85); 

                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==HOSTNAME) ) {
                        int LA3_1 = input.LA(2);

                        if ( (LA3_1==18) ) {
                            alt3=2;
                        }
                        else if ( (LA3_1==20) ) {
                            alt3=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;

                    }
                    switch (alt3) {
                        case 1 :
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr87); 

                            }
                            break;
                        case 2 :
                            {
                            {
                            int cnt2=0;
                            loop2:
                            do {
                                int alt2=2;
                                int LA2_0 = input.LA(1);

                                if ( (LA2_0==HOSTNAME) ) {
                                    int LA2_1 = input.LA(2);

                                    if ( (LA2_1==18) ) {
                                        alt2=1;
                                    }


                                }


                                switch (alt2) {
                            	case 1 :
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr91); 

                            	    match(input,18,FOLLOW_18_in_create_expr92); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt2 >= 1 ) break loop2;
                                        EarlyExitException eee =
                                            new EarlyExitException(2, input);
                                        throw eee;
                                }
                                cnt2++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr96); 

                            }


                            }
                            break;

                    }


                    match(input,20,FOLLOW_20_in_create_expr99); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_create_expr100); 

                    result = QueryResults.CREATE_N_PROTOCOL_PSPRINGS_FROM_FILE_ON_HOST_AS_VARNAME;//Case 2
                    }
                    break;
                case 3 :
                    {
                    match(input,22,FOLLOW_22_in_create_expr106); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_create_expr114); 

                    match(input,46,FOLLOW_46_in_create_expr115); 

                    match(input,30,FOLLOW_30_in_create_expr116); 

                    match(input,FILEPATH,FOLLOW_FILEPATH_in_create_expr117); 

                    match(input,43,FOLLOW_43_in_create_expr118); 

                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==HOSTNAME) ) {
                        int LA5_1 = input.LA(2);

                        if ( (LA5_1==18) ) {
                            alt5=2;
                        }
                        else if ( (LA5_1==20) ) {
                            alt5=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;

                    }
                    switch (alt5) {
                        case 1 :
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr120); 

                            }
                            break;
                        case 2 :
                            {
                            {
                            int cnt4=0;
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( (LA4_0==HOSTNAME) ) {
                                    int LA4_1 = input.LA(2);

                                    if ( (LA4_1==18) ) {
                                        alt4=1;
                                    }
                                }

                                switch (alt4) {
                            	case 1 :
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr124); 

                            	    match(input,18,FOLLOW_18_in_create_expr125); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt4 >= 1 ) break loop4;
                                        EarlyExitException eee =
                                            new EarlyExitException(4, input);
                                        throw eee;
                                }
                                cnt4++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr129); 

                            }


                            }
                            break;

                    }


                    match(input,20,FOLLOW_20_in_create_expr132); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_create_expr133); 

                    match(input,58,FOLLOW_58_in_create_expr134); 

                    match(input,39,FOLLOW_39_in_create_expr135); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    result = QueryResults.CREATE_N_PROTOCOL_PSPRINGS_FROM_FILE_ON_HOST_AS_VARNAME_WITH_MAXDRATE_R;//Case 3
                    }
                    break;
                case 4 :
                    {
                    match(input,22,FOLLOW_22_in_create_expr153); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_create_expr160); 

                    match(input,45,FOLLOW_45_in_create_expr161); 

                    match(input,43,FOLLOW_43_in_create_expr162); 

                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==HOSTNAME) ) {
                        int LA7_1 = input.LA(2);

                        if ( (LA7_1==18) ) {
                            alt7=2;
                        }
                        else if ( (LA7_1==20) ) {
                            alt7=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;

                    }
                    switch (alt7) {
                        case 1 :
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr164); 

                            }
                            break;
                        case 2 :
                            {
                            {
                            int cnt6=0;
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( (LA6_0==HOSTNAME) ) {
                                    int LA6_1 = input.LA(2);

                                    if ( (LA6_1==18) ) {
                                        alt6=1;
                                    }
                                }

                                switch (alt6) {
                            	case 1 :
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr168); 

                            	    match(input,18,FOLLOW_18_in_create_expr169); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt6 >= 1 ) break loop6;
                                        EarlyExitException eee =
                                            new EarlyExitException(6, input);
                                        throw eee;
                                }
                                cnt6++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr173); 

                            }


                            }
                            break;

                    }


                    match(input,20,FOLLOW_20_in_create_expr176); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_create_expr177); 

                    result = QueryResults.CREATE_N_PROTOCOL_PSINKHOLES_ON_HOST_AS_VARNAME; //Case 4
                    }
                    break;
                case 5 :
                    {
                    match(input,22,FOLLOW_22_in_create_expr190); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_create_expr197); 

                    match(input,45,FOLLOW_45_in_create_expr198); 

                    match(input,43,FOLLOW_43_in_create_expr199); 
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==HOSTNAME) ) {
                        int LA9_1 = input.LA(2);

                        if ( (LA9_1==18) ) {
                            alt9=2;
                        }
                        else if ( (LA9_1==20) ) {
                            alt9=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;

                    }
                    switch (alt9) {
                        case 1 :
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr201); 

                            }
                            break;
                        case 2 :
                            {
                            {
                            int cnt8=0;
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( (LA8_0==HOSTNAME) ) {
                                    int LA8_1 = input.LA(2);

                                    if ( (LA8_1==18) ) {
                                        alt8=1;
                                    }


                                }


                                switch (alt8) {
                            	case 1 :
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr205); 

                            	    match(input,18,FOLLOW_18_in_create_expr206); 

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


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr210); 

                            }


                            }
                            break;

                    }


                    match(input,20,FOLLOW_20_in_create_expr213); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_create_expr214); 

                    match(input,58,FOLLOW_58_in_create_expr215); 

                    match(input,39,FOLLOW_39_in_create_expr216); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    result = QueryResults.CREATE_N_PROTOCOL_PSINKHOLES_ON_HOST_AS_VARNAME_WITH_MAXDRATE_R; //Case 5
                    }
                    break;
                case 6 :
                    {
                    match(input,22,FOLLOW_22_in_create_expr245); 

                    match(input,27,FOLLOW_27_in_create_expr246); 

                    match(input,X_Y_EXPR,FOLLOW_X_Y_EXPR_in_create_expr247); 

                    match(input,20,FOLLOW_20_in_create_expr248); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_create_expr249); 

                    match(input,58,FOLLOW_58_in_create_expr250); 

                    match(input,25,FOLLOW_25_in_create_expr251); 

                    match(input,DRANGE,FOLLOW_DRANGE_in_create_expr252); 

                    match(input,33,FOLLOW_33_in_create_expr253); 

                    match(input,44,FOLLOW_44_in_create_expr254); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    result = QueryResults.CREATE_FILTER_X_Y_EXPR_AS_VARNAME_WITH_DRANGE_D_IN_PERIOD_P; //Case 6
                    }
                    break;
                case 7 :
                    {
                    match(input,22,FOLLOW_22_in_create_expr265); 

                    match(input,27,FOLLOW_27_in_create_expr266); 

                    match(input,47,FOLLOW_47_in_create_expr267); 

                    match(input,20,FOLLOW_20_in_create_expr268); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_create_expr269); 

                    match(input,58,FOLLOW_58_in_create_expr270); 

                    match(input,25,FOLLOW_25_in_create_expr271); 

                    match(input,DRANGE,FOLLOW_DRANGE_in_create_expr272); 

                    match(input,33,FOLLOW_33_in_create_expr273); 

                    match(input,44,FOLLOW_44_in_create_expr274); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    result = QueryResults.CREATE_FILTER_PULSEWAVE_AS_VARNAME_WITH_DRANGE_D_IN_PERIOD_P;//Case 7
                    }
                    break;
                case 8 :
                    {
                    match(input,22,FOLLOW_22_in_create_expr291); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_create_expr299); 

                    match(input,34,FOLLOW_34_in_create_expr301); 

                    match(input,31,FOLLOW_31_in_create_expr302); 

                    match(input,57,FOLLOW_57_in_create_expr303); 

                    match(input,38,FOLLOW_38_in_create_expr304); 

                    match(input,MATRIXDEF,FOLLOW_MATRIXDEF_in_create_expr305); 

                    match(input,40,FOLLOW_40_in_create_expr306); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    result = QueryResults.CREATE_N_PROTOCOL_KRONECKER_GSPRINGS_USING_MATRIX_MATRIXDEF_NITER_N;//Case 8
                    }
                    break;
                case 9 :
                    {
                    match(input,22,FOLLOW_22_in_create_expr319); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_create_expr327); 

                    match(input,34,FOLLOW_34_in_create_expr329); 

                    match(input,31,FOLLOW_31_in_create_expr330); 

                    match(input,43,FOLLOW_43_in_create_expr331); 

                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==HOSTNAME) ) {
                        int LA11_1 = input.LA(2);

                        if ( (LA11_1==18) ) {
                            alt11=2;
                        }
                        else if ( (LA11_1==57) ) {
                            alt11=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;

                    }
                    switch (alt11) {
                        case 1 :
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr333); 

                            }
                            break;
                        case 2 :
                            {
                            {
                            int cnt10=0;
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==HOSTNAME) ) {
                                    int LA10_1 = input.LA(2);

                                    if ( (LA10_1==18) ) {
                                        alt10=1;
                                    }


                                }


                                switch (alt10) {
                            	case 1 :
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr337); 

                            	    match(input,18,FOLLOW_18_in_create_expr338); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt10 >= 1 ) break loop10;
                                        EarlyExitException eee =
                                            new EarlyExitException(10, input);
                                        throw eee;
                                }
                                cnt10++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr342); 

                            }


                            }
                            break;

                    }


                    match(input,57,FOLLOW_57_in_create_expr345); 

                    match(input,38,FOLLOW_38_in_create_expr346); 

                    match(input,MATRIXDEF,FOLLOW_MATRIXDEF_in_create_expr347); 

                    match(input,40,FOLLOW_40_in_create_expr348); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    result = QueryResults.CREATE_N_PROTOCOL_KRONECKER_GSPRINGS_ON_HOST_USING_MATRIX_MATRIXDEF_NITER_N;//Case 9
                    }
                    break;
                case 10 :
                    {
                    match(input,22,FOLLOW_22_in_create_expr359); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_create_expr367); 

                    match(input,34,FOLLOW_34_in_create_expr369); 

                    match(input,31,FOLLOW_31_in_create_expr370); 

                    match(input,43,FOLLOW_43_in_create_expr371); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:34:63: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==HOSTNAME) ) {
                        int LA13_1 = input.LA(2);

                        if ( (LA13_1==18) ) {
                            alt13=2;
                        }
                        else if ( (LA13_1==20) ) {
                            alt13=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;

                    }
                    switch (alt13) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:34:64: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr373); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:34:73: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:34:73: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:34:74: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:34:74: ( HOSTNAME ',' )+
                            int cnt12=0;
                            loop12:
                            do {
                                int alt12=2;
                                int LA12_0 = input.LA(1);

                                if ( (LA12_0==HOSTNAME) ) {
                                    int LA12_1 = input.LA(2);

                                    if ( (LA12_1==18) ) {
                                        alt12=1;
                                    }


                                }


                                switch (alt12) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:34:75: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr377); 

                            	    match(input,18,FOLLOW_18_in_create_expr378); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt12 >= 1 ) break loop12;
                                        EarlyExitException eee =
                                            new EarlyExitException(12, input);
                                        throw eee;
                                }
                                cnt12++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr382); 

                            }


                            }
                            break;

                    }


                    match(input,20,FOLLOW_20_in_create_expr385); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_create_expr386); 

                    match(input,57,FOLLOW_57_in_create_expr387); 

                    match(input,38,FOLLOW_38_in_create_expr388); 

                    match(input,MATRIXDEF,FOLLOW_MATRIXDEF_in_create_expr389); 

                    match(input,40,FOLLOW_40_in_create_expr390); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }
//'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'KRONECKER' 'GSPRINGS' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'AS' VARNAME 'USING' 'MATRIX' MATRIXDEF 'NITER' ( DIGIT | NUMBER )
                    result = QueryResults.CREATE_N_PROTOCOL_KRONECKER_GSPRINGS_ON_HOST_AS_VARNAME_USING_MATRIX_MATRIXDEF_NITER_N; //Case 10
                    }
                    break;
                case 11 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:35:6: 'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'KRONECKER' 'GSPRINGS' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'AS' VARNAME 'WITH' 'MAXDRATE' ( DIGIT | NUMBER ) 'USING' 'MATRIX' MATRIXDEF 'NITER' ( DIGIT | NUMBER )
                    {
                    match(input,22,FOLLOW_22_in_create_expr403); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_create_expr411); 

                    match(input,34,FOLLOW_34_in_create_expr413); 

                    match(input,31,FOLLOW_31_in_create_expr414); 

                    match(input,43,FOLLOW_43_in_create_expr415); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:35:65: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==HOSTNAME) ) {
                        int LA15_1 = input.LA(2);

                        if ( (LA15_1==18) ) {
                            alt15=2;
                        }
                        else if ( (LA15_1==20) ) {
                            alt15=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;

                    }
                    switch (alt15) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:35:66: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr417); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:35:75: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:35:75: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:35:76: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:35:76: ( HOSTNAME ',' )+
                            int cnt14=0;
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( (LA14_0==HOSTNAME) ) {
                                    int LA14_1 = input.LA(2);

                                    if ( (LA14_1==18) ) {
                                        alt14=1;
                                    }


                                }


                                switch (alt14) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:35:77: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr421); 

                            	    match(input,18,FOLLOW_18_in_create_expr422); 

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


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr426); 

                            }


                            }
                            break;

                    }


                    match(input,20,FOLLOW_20_in_create_expr429); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_create_expr430); 

                    match(input,58,FOLLOW_58_in_create_expr431); 

                    match(input,39,FOLLOW_39_in_create_expr432); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,57,FOLLOW_57_in_create_expr438); 

                    match(input,38,FOLLOW_38_in_create_expr439); 

                    match(input,MATRIXDEF,FOLLOW_MATRIXDEF_in_create_expr440); 

                    match(input,40,FOLLOW_40_in_create_expr441); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    //'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'KRONECKER' 'GSPRINGS' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'AS' VARNAME 'WITH' 'MAXDRATE' ( DIGIT | NUMBER ) 'USING' 'MATRIX' MATRIXDEF 'NITER' ( DIGIT | NUMBER )
                    result = QueryResults.CREATE_N_PROTOCOL_KRONECKER_GSPRINGS_ON_HOST_AS_VARNAME_WITH_MAXDRATE_D_USING_MATRIX_MATRIXDEF_NITER_N; //Case 11
                    }
                    break;
                case 12 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:37:6: 'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'ESPRINGS' 'FROM' URLPATH 'AS' VARNAME
                    {
                    match(input,22,FOLLOW_22_in_create_expr462); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_create_expr470); 

                    match(input,26,FOLLOW_26_in_create_expr472); 

                    match(input,30,FOLLOW_30_in_create_expr473); 

                    match(input,URLPATH,FOLLOW_URLPATH_in_create_expr474); 

                    match(input,20,FOLLOW_20_in_create_expr475); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_create_expr476); 

                    //'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'ESPRINGS' 'FROM' URLPATH 'AS' VARNAME
                    result = QueryResults.CREATE_N_PROTOCOL_ESPRINGS_FROM_URLPATH_AS_VARNAME;//Case 12
                    }
                    break;
                case 13 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:38:6: 'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'ESPRINGS' 'FROM' URLPATH 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'AS' VARNAME
                    {
                    match(input,22,FOLLOW_22_in_create_expr484); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_create_expr492); 

                    match(input,26,FOLLOW_26_in_create_expr494); 

                    match(input,30,FOLLOW_30_in_create_expr495); 

                    match(input,URLPATH,FOLLOW_URLPATH_in_create_expr496); 

                    match(input,43,FOLLOW_43_in_create_expr497); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:38:67: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==HOSTNAME) ) {
                        int LA17_1 = input.LA(2);

                        if ( (LA17_1==18) ) {
                            alt17=2;
                        }
                        else if ( (LA17_1==20) ) {
                            alt17=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;

                    }
                    switch (alt17) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:38:68: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr499); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:38:77: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:38:77: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:38:78: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:38:78: ( HOSTNAME ',' )+
                            int cnt16=0;
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==HOSTNAME) ) {
                                    int LA16_1 = input.LA(2);

                                    if ( (LA16_1==18) ) {
                                        alt16=1;
                                    }


                                }


                                switch (alt16) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:38:79: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr503); 

                            	    match(input,18,FOLLOW_18_in_create_expr504); 

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


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr508); 

                            }


                            }
                            break;

                    }


                    match(input,20,FOLLOW_20_in_create_expr511); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_create_expr512); 

                    //'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'ESPRINGS' 'FROM' URLPATH 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'AS' VARNAME
                    result = QueryResults.CREATE_N_PROTOCOL_ESPRINGS_FROM_URLPATH_ON_HOST_AS_VARNAME;//Case 13
                    }
                    break;
                case 14 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:39:6: 'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'ESPRINGS' 'FROM' URLPATH 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'AS' VARNAME 'WITH' 'MAXDRATE' ( DIGIT | NUMBER ) 'LEARN' 'FOR' ( DIGIT | NUMBER )
                    {
                    match(input,22,FOLLOW_22_in_create_expr520); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_create_expr528); 

                    match(input,26,FOLLOW_26_in_create_expr530); 

                    match(input,30,FOLLOW_30_in_create_expr531); 

                    match(input,URLPATH,FOLLOW_URLPATH_in_create_expr532); 

                    match(input,43,FOLLOW_43_in_create_expr533); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:39:67: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==HOSTNAME) ) {
                        int LA19_1 = input.LA(2);

                        if ( (LA19_1==18) ) {
                            alt19=2;
                        }
                        else if ( (LA19_1==20) ) {
                            alt19=1;
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
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:39:68: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr535); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:39:77: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:39:77: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:39:78: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:39:78: ( HOSTNAME ',' )+
                            int cnt18=0;
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==HOSTNAME) ) {
                                    int LA18_1 = input.LA(2);

                                    if ( (LA18_1==18) ) {
                                        alt18=1;
                                    }


                                }


                                switch (alt18) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:39:79: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr539); 

                            	    match(input,18,FOLLOW_18_in_create_expr540); 

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


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr544); 

                            }


                            }
                            break;

                    }


                    match(input,20,FOLLOW_20_in_create_expr547); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_create_expr548); 

                    match(input,58,FOLLOW_58_in_create_expr549); 

                    match(input,39,FOLLOW_39_in_create_expr550); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,35,FOLLOW_35_in_create_expr556); 

                    match(input,29,FOLLOW_29_in_create_expr557); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    //'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'ESPRINGS' 'FROM' URLPATH 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'AS' VARNAME 'WITH' 'MAXDRATE' ( DIGIT | NUMBER ) 'LEARN' 'FOR' ( DIGIT | NUMBER )
                    result = QueryResults.CREATE_N_PROTOCOL_ESPRINGS_FROM_URLPATH_ON_HOST_AS_VARNAME_WITH_MAXDRATE_D_LEARN_FOR_T;//Case 14
                    }
                    break;
                case 15 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:40:8: 'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'ESPRINGS' 'FROM' URLPATH 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'AS' VARNAME 'WITH' 'MAXDRATE' ( DIGIT | NUMBER ) 'LEARN' 'FOR' ( DIGIT | NUMBER ) 'SAVE'
                    {
                    match(input,22,FOLLOW_22_in_create_expr572); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_create_expr580); 

                    match(input,26,FOLLOW_26_in_create_expr582); 

                    match(input,30,FOLLOW_30_in_create_expr583); 

                    match(input,URLPATH,FOLLOW_URLPATH_in_create_expr584); 

                    match(input,43,FOLLOW_43_in_create_expr585); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:40:69: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==HOSTNAME) ) {
                        int LA21_1 = input.LA(2);

                        if ( (LA21_1==18) ) {
                            alt21=2;
                        }
                        else if ( (LA21_1==20) ) {
                            alt21=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 21, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;

                    }
                    switch (alt21) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:40:70: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr587); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:40:79: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:40:79: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:40:80: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:40:80: ( HOSTNAME ',' )+
                            int cnt20=0;
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==HOSTNAME) ) {
                                    int LA20_1 = input.LA(2);

                                    if ( (LA20_1==18) ) {
                                        alt20=1;
                                    }


                                }


                                switch (alt20) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:40:81: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr591); 

                            	    match(input,18,FOLLOW_18_in_create_expr592); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt20 >= 1 ) break loop20;
                                        EarlyExitException eee =
                                            new EarlyExitException(20, input);
                                        throw eee;
                                }
                                cnt20++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr596); 

                            }


                            }
                            break;

                    }


                    match(input,20,FOLLOW_20_in_create_expr599); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_create_expr600); 

                    match(input,58,FOLLOW_58_in_create_expr601); 

                    match(input,39,FOLLOW_39_in_create_expr602); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,35,FOLLOW_35_in_create_expr608); 

                    match(input,29,FOLLOW_29_in_create_expr609); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,49,FOLLOW_49_in_create_expr615); 

                    //'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'ESPRINGS' 'FROM' URLPATH 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'AS' VARNAME 'WITH' 'MAXDRATE' ( DIGIT | NUMBER ) 'LEARN' 'FOR' ( DIGIT | NUMBER ) 'SAVE'
                    result = QueryResults.CREATE_N_PROTOCOL_ESPRINGS_FROM_URLPATH_ON_HOST_AS_VARNAME_WITH_MAXDRATE_D_LEARN_FOR_T_SAVE;//Case 15
                    }
                    break;
                case 16 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:41:8: 'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'ESPRINGS' 'FROM' URLPATH 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,22,FOLLOW_22_in_create_expr625); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_create_expr633); 

                    match(input,26,FOLLOW_26_in_create_expr635); 

                    match(input,30,FOLLOW_30_in_create_expr636); 

                    match(input,URLPATH,FOLLOW_URLPATH_in_create_expr637); 

                    match(input,43,FOLLOW_43_in_create_expr638); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:41:69: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==HOSTNAME) ) {
                        int LA23_1 = input.LA(2);

                        if ( (LA23_1==18) ) {
                            alt23=2;
                        }
                        else if ( (LA23_1==EOF) ) {
                            alt23=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;

                    }
                    switch (alt23) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:41:70: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr640); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:41:79: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:41:79: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:41:80: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:41:80: ( HOSTNAME ',' )+
                            int cnt22=0;
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==HOSTNAME) ) {
                                    int LA22_1 = input.LA(2);

                                    if ( (LA22_1==18) ) {
                                        alt22=1;
                                    }


                                }


                                switch (alt22) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:41:81: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr644); 

                            	    match(input,18,FOLLOW_18_in_create_expr645); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt22 >= 1 ) break loop22;
                                        EarlyExitException eee =
                                            new EarlyExitException(22, input);
                                        throw eee;
                                }
                                cnt22++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr649); 

                            }


                            }
                            break;

                    }

                    //'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'ESPRINGS' 'FROM' URLPATH 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.CREATE_N_PROTOCOL_ESPRINGS_FROM_URLPATH_ON_HOST;//Case 16
                    }
                    break;
                case 17 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:42:6: 'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'ESPRINGS' 'FROM' URLPATH 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'WITH' 'MAXDRATE' ( DIGIT | NUMBER ) 'LEARN' 'FOR' ( DIGIT | NUMBER )
                    {
                    match(input,22,FOLLOW_22_in_create_expr659); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_create_expr667); 

                    match(input,26,FOLLOW_26_in_create_expr669); 

                    match(input,30,FOLLOW_30_in_create_expr670); 

                    match(input,URLPATH,FOLLOW_URLPATH_in_create_expr671); 

                    match(input,43,FOLLOW_43_in_create_expr672); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:42:67: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==HOSTNAME) ) {
                        int LA25_1 = input.LA(2);

                        if ( (LA25_1==18) ) {
                            alt25=2;
                        }
                        else if ( (LA25_1==58) ) {
                            alt25=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 25, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;

                    }
                    switch (alt25) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:42:68: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr674); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:42:77: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:42:77: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:42:78: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:42:78: ( HOSTNAME ',' )+
                            int cnt24=0;
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( (LA24_0==HOSTNAME) ) {
                                    int LA24_1 = input.LA(2);

                                    if ( (LA24_1==18) ) {
                                        alt24=1;
                                    }


                                }


                                switch (alt24) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:42:79: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr678); 

                            	    match(input,18,FOLLOW_18_in_create_expr679); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt24 >= 1 ) break loop24;
                                        EarlyExitException eee =
                                            new EarlyExitException(24, input);
                                        throw eee;
                                }
                                cnt24++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr683); 

                            }


                            }
                            break;

                    }


                    match(input,58,FOLLOW_58_in_create_expr686); 

                    match(input,39,FOLLOW_39_in_create_expr687); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,35,FOLLOW_35_in_create_expr693); 

                    match(input,29,FOLLOW_29_in_create_expr694); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    //'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'ESPRINGS' 'FROM' URLPATH 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'WITH' 'MAXDRATE' ( DIGIT | NUMBER ) 'LEARN' 'FOR' ( DIGIT | NUMBER )
                    result = QueryResults.CREATE_N_PROTOCOL_ESPRINGS_FROM_URLPATH_ON_HOST_WITH_MAXDRATE_DLEARN_FOR_T;//Case 17
                    }
                    break;
                case 18 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:43:8: 'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'ESPRINGS' 'FROM' URLPATH 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'WITH' 'MAXDRATE' ( DIGIT | NUMBER ) 'LEARN' 'FOR' ( DIGIT | NUMBER ) 'SAVE'
                    {
                    match(input,22,FOLLOW_22_in_create_expr709); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_create_expr717); 

                    match(input,26,FOLLOW_26_in_create_expr719); 

                    match(input,30,FOLLOW_30_in_create_expr720); 

                    match(input,URLPATH,FOLLOW_URLPATH_in_create_expr721); 

                    match(input,43,FOLLOW_43_in_create_expr722); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:43:69: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==HOSTNAME) ) {
                        int LA27_1 = input.LA(2);

                        if ( (LA27_1==18) ) {
                            alt27=2;
                        }
                        else if ( (LA27_1==58) ) {
                            alt27=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 27, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;

                    }
                    switch (alt27) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:43:70: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr724); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:43:79: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:43:79: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:43:80: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:43:80: ( HOSTNAME ',' )+
                            int cnt26=0;
                            loop26:
                            do {
                                int alt26=2;
                                int LA26_0 = input.LA(1);

                                if ( (LA26_0==HOSTNAME) ) {
                                    int LA26_1 = input.LA(2);

                                    if ( (LA26_1==18) ) {
                                        alt26=1;
                                    }


                                }


                                switch (alt26) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:43:81: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr728); 

                            	    match(input,18,FOLLOW_18_in_create_expr729); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt26 >= 1 ) break loop26;
                                        EarlyExitException eee =
                                            new EarlyExitException(26, input);
                                        throw eee;
                                }
                                cnt26++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr733); 

                            }


                            }
                            break;

                    }


                    match(input,58,FOLLOW_58_in_create_expr736); 

                    match(input,39,FOLLOW_39_in_create_expr737); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,35,FOLLOW_35_in_create_expr743); 

                    match(input,29,FOLLOW_29_in_create_expr744); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,49,FOLLOW_49_in_create_expr750); 

                    //'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'ESPRINGS' 'FROM' URLPATH 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'WITH' 'MAXDRATE' ( DIGIT | NUMBER ) 'LEARN' 'FOR' ( DIGIT | NUMBER ) 'SAVE'
                    result = QueryResults.CREATE_N_PROTOCOL_ESPRINGS_FROM_URLPATH_ON_HOST_WITH_MAXDRATE_D_LEARN_FOR_T_SAVE;//Case 18
                    }
                    break;
                case 19 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:46:7: 'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'ASPRINGS' 'FROM' URLPATH 'AS' VARNAME 'WITH' 'MAXDRATE' ( DIGIT | NUMBER ) 'AMPLIFYING' URLPATH
                    {
                    match(input,22,FOLLOW_22_in_create_expr775); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_create_expr783); 

                    match(input,21,FOLLOW_21_in_create_expr785); 

                    match(input,30,FOLLOW_30_in_create_expr786); 

                    match(input,URLPATH,FOLLOW_URLPATH_in_create_expr787); 

                    match(input,20,FOLLOW_20_in_create_expr788); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_create_expr789); 

                    match(input,58,FOLLOW_58_in_create_expr790); 

                    match(input,39,FOLLOW_39_in_create_expr791); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,19,FOLLOW_19_in_create_expr797); 

                    match(input,URLPATH,FOLLOW_URLPATH_in_create_expr798); 

                    //'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'ASPRINGS' 'FROM' URLPATH 'AS' VARNAME 'WITH' 'MAXDRATE' ( DIGIT | NUMBER ) 'AMPLIFYING' URLPATH
                    result = QueryResults.CREATE_N_PROTOCOL_ASPRINGS_FROM_URLPATH_AS_VARNAME_WITH_MAXDRATE_D_AMPLIFYING_URLPATH;//Case 19
                    }
                    break;
                case 20 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:47:7: 'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'ASPRINGS' 'FROM' URLPATH 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'AS' VARNAME 'WITH' 'MAXDRATE' ( DIGIT | NUMBER ) 'AMPLIFYING' URLPATH
                    {
                    match(input,22,FOLLOW_22_in_create_expr807); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_create_expr815); 

                    match(input,21,FOLLOW_21_in_create_expr817); 

                    match(input,30,FOLLOW_30_in_create_expr818); 

                    match(input,URLPATH,FOLLOW_URLPATH_in_create_expr819); 

                    match(input,43,FOLLOW_43_in_create_expr820); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:47:68: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==HOSTNAME) ) {
                        int LA29_1 = input.LA(2);

                        if ( (LA29_1==18) ) {
                            alt29=2;
                        }
                        else if ( (LA29_1==20) ) {
                            alt29=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 29, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;

                    }
                    switch (alt29) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:47:69: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr822); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:47:78: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:47:78: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:47:79: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:47:79: ( HOSTNAME ',' )+
                            int cnt28=0;
                            loop28:
                            do {
                                int alt28=2;
                                int LA28_0 = input.LA(1);

                                if ( (LA28_0==HOSTNAME) ) {
                                    int LA28_1 = input.LA(2);

                                    if ( (LA28_1==18) ) {
                                        alt28=1;
                                    }


                                }


                                switch (alt28) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:47:80: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr826); 

                            	    match(input,18,FOLLOW_18_in_create_expr827); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt28 >= 1 ) break loop28;
                                        EarlyExitException eee =
                                            new EarlyExitException(28, input);
                                        throw eee;
                                }
                                cnt28++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_create_expr831); 

                            }


                            }
                            break;

                    }


                    match(input,20,FOLLOW_20_in_create_expr834); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_create_expr835); 

                    match(input,58,FOLLOW_58_in_create_expr836); 

                    match(input,39,FOLLOW_39_in_create_expr837); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,19,FOLLOW_19_in_create_expr843); 

                    match(input,URLPATH,FOLLOW_URLPATH_in_create_expr844);
                    
                    //'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'ASPRINGS' 'FROM' URLPATH 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'AS' VARNAME 'WITH' 'MAXDRATE' ( DIGIT | NUMBER ) 'AMPLIFYING' URLPATH
                    result =  QueryResults.CREATE_N_PROTOCOL_ASPRINGS_FROM_URLPATH_ON_HOST_AS_VARNAME_WITH_MAXDRATE_D_AMPLIFYING_URLPATH;//Case 20
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "create_expr"



    // $ANTLR start "allocation_expr"
    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:50:1: allocation_expr : ( 'SET' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SET' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'NRPT' ( DIGIT | NUMBER ) );
    public final QueryResults allocation_expr() throws RecognitionException {
    	QueryResults result = null;
        try {
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:51:2: ( 'SET' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SET' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'NRPT' ( DIGIT | NUMBER ) )
            int alt43=2;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:51:4: 'SET' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,52,FOLLOW_52_in_allocation_expr854); 

                    match(input,28,FOLLOW_28_in_allocation_expr855); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:51:18: ( VARNAME | ( VARNAME ',' )+ VARNAME )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==VARNAME) ) {
                        int LA32_1 = input.LA(2);

                        if ( (LA32_1==18) ) {
                            alt32=2;
                        }
                        else if ( (LA32_1==43) ) {
                            alt32=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 32, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;

                    }
                    switch (alt32) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:51:19: VARNAME
                            {
                            match(input,VARNAME,FOLLOW_VARNAME_in_allocation_expr857); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:51:27: ( VARNAME ',' )+ VARNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:51:27: ( VARNAME ',' )+
                            int cnt31=0;
                            loop31:
                            do {
                                int alt31=2;
                                int LA31_0 = input.LA(1);

                                if ( (LA31_0==VARNAME) ) {
                                    int LA31_1 = input.LA(2);

                                    if ( (LA31_1==18) ) {
                                        alt31=1;
                                    }


                                }


                                switch (alt31) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:51:28: VARNAME ','
                            	    {
                            	    match(input,VARNAME,FOLLOW_VARNAME_in_allocation_expr860); 

                            	    match(input,18,FOLLOW_18_in_allocation_expr861); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt31 >= 1 ) break loop31;
                                        EarlyExitException eee =
                                            new EarlyExitException(31, input);
                                        throw eee;
                                }
                                cnt31++;
                            } while (true);


                            match(input,VARNAME,FOLLOW_VARNAME_in_allocation_expr864); 

                            }
                            break;

                    }


                    match(input,43,FOLLOW_43_in_allocation_expr866); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_allocation_expr867); 

                    match(input,46,FOLLOW_46_in_allocation_expr869); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:51:72: ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==DIGIT||LA34_0==NUMBER) ) {
                        int LA34_1 = input.LA(2);

                        if ( (LA34_1==18) ) {
                            alt34=2;
                        }
                        else if ( (LA34_1==43) ) {
                            alt34=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 34, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;

                    }
                    switch (alt34) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:51:73: ( DIGIT | NUMBER )
                            {
                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:51:88: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:51:88: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:51:89: ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:51:89: ( ( DIGIT | NUMBER ) ',' )+
                            int cnt33=0;
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==DIGIT||LA33_0==NUMBER) ) {
                                    int LA33_1 = input.LA(2);

                                    if ( (LA33_1==18) ) {
                                        alt33=1;
                                    }


                                }


                                switch (alt33) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:51:90: ( DIGIT | NUMBER ) ','
                            	    {
                            	    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                            	        input.consume();
                            	        state.errorRecovery=false;
                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        throw mse;
                            	    }


                            	    match(input,18,FOLLOW_18_in_allocation_expr884); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt33 >= 1 ) break loop33;
                                        EarlyExitException eee =
                                            new EarlyExitException(33, input);
                                        throw eee;
                                }
                                cnt33++;
                            } while (true);


                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }


                            }
                            break;

                    }


                    match(input,43,FOLLOW_43_in_allocation_expr895); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:51:130: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==HOSTNAME) ) {
                        int LA36_1 = input.LA(2);

                        if ( (LA36_1==18) ) {
                            alt36=2;
                        }
                        else if ( (LA36_1==EOF) ) {
                            alt36=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 36, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;

                    }
                    switch (alt36) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:51:131: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_allocation_expr897); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:51:140: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:51:140: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:51:141: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:51:141: ( HOSTNAME ',' )+
                            int cnt35=0;
                            loop35:
                            do {
                                int alt35=2;
                                int LA35_0 = input.LA(1);

                                if ( (LA35_0==HOSTNAME) ) {
                                    int LA35_1 = input.LA(2);

                                    if ( (LA35_1==18) ) {
                                        alt35=1;
                                    }


                                }


                                switch (alt35) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:51:142: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_allocation_expr901); 

                            	    match(input,18,FOLLOW_18_in_allocation_expr902); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt35 >= 1 ) break loop35;
                                        EarlyExitException eee =
                                            new EarlyExitException(35, input);
                                        throw eee;
                                }
                                cnt35++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_allocation_expr906); 

                            }


                            }
                            break;

                    }

                    //'SET' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.SET_FILTERS_VARNAME_ON_PROTOCOLS_PSPRINGS_P_ON_HOST;//Case 21
                    }
                    break;
                case 2 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:52:4: 'SET' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'NRPT' ( DIGIT | NUMBER )
                    {
                    match(input,52,FOLLOW_52_in_allocation_expr914); 

                    match(input,28,FOLLOW_28_in_allocation_expr915); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:52:18: ( VARNAME | ( VARNAME ',' )+ VARNAME )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==VARNAME) ) {
                        int LA38_1 = input.LA(2);

                        if ( (LA38_1==18) ) {
                            alt38=2;
                        }
                        else if ( (LA38_1==43) ) {
                            alt38=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 38, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;

                    }
                    switch (alt38) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:52:19: VARNAME
                            {
                            match(input,VARNAME,FOLLOW_VARNAME_in_allocation_expr917); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:52:27: ( VARNAME ',' )+ VARNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:52:27: ( VARNAME ',' )+
                            int cnt37=0;
                            loop37:
                            do {
                                int alt37=2;
                                int LA37_0 = input.LA(1);

                                if ( (LA37_0==VARNAME) ) {
                                    int LA37_1 = input.LA(2);

                                    if ( (LA37_1==18) ) {
                                        alt37=1;
                                    }


                                }


                                switch (alt37) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:52:28: VARNAME ','
                            	    {
                            	    match(input,VARNAME,FOLLOW_VARNAME_in_allocation_expr920); 

                            	    match(input,18,FOLLOW_18_in_allocation_expr921); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt37 >= 1 ) break loop37;
                                        EarlyExitException eee =
                                            new EarlyExitException(37, input);
                                        throw eee;
                                }
                                cnt37++;
                            } while (true);


                            match(input,VARNAME,FOLLOW_VARNAME_in_allocation_expr924); 

                            }
                            break;

                    }


                    match(input,43,FOLLOW_43_in_allocation_expr926); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_allocation_expr927); 

                    match(input,46,FOLLOW_46_in_allocation_expr929); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:52:72: ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==DIGIT||LA40_0==NUMBER) ) {
                        int LA40_1 = input.LA(2);

                        if ( (LA40_1==18) ) {
                            alt40=2;
                        }
                        else if ( (LA40_1==43) ) {
                            alt40=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 40, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;

                    }
                    switch (alt40) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:52:73: ( DIGIT | NUMBER )
                            {
                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:52:88: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:52:88: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:52:89: ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:52:89: ( ( DIGIT | NUMBER ) ',' )+
                            int cnt39=0;
                            loop39:
                            do {
                                int alt39=2;
                                int LA39_0 = input.LA(1);

                                if ( (LA39_0==DIGIT||LA39_0==NUMBER) ) {
                                    int LA39_1 = input.LA(2);

                                    if ( (LA39_1==18) ) {
                                        alt39=1;
                                    }


                                }


                                switch (alt39) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:52:90: ( DIGIT | NUMBER ) ','
                            	    {
                            	    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                            	        input.consume();
                            	        state.errorRecovery=false;
                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        throw mse;
                            	    }


                            	    match(input,18,FOLLOW_18_in_allocation_expr944); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt39 >= 1 ) break loop39;
                                        EarlyExitException eee =
                                            new EarlyExitException(39, input);
                                        throw eee;
                                }
                                cnt39++;
                            } while (true);


                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }


                            }
                            break;

                    }


                    match(input,43,FOLLOW_43_in_allocation_expr955); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:52:130: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==HOSTNAME) ) {
                        int LA42_1 = input.LA(2);

                        if ( (LA42_1==18) ) {
                            alt42=2;
                        }
                        else if ( (LA42_1==41) ) {
                            alt42=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 42, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;

                    }
                    switch (alt42) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:52:131: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_allocation_expr957); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:52:140: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:52:140: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:52:141: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:52:141: ( HOSTNAME ',' )+
                            int cnt41=0;
                            loop41:
                            do {
                                int alt41=2;
                                int LA41_0 = input.LA(1);

                                if ( (LA41_0==HOSTNAME) ) {
                                    int LA41_1 = input.LA(2);

                                    if ( (LA41_1==18) ) {
                                        alt41=1;
                                    }


                                }


                                switch (alt41) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:52:142: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_allocation_expr961); 

                            	    match(input,18,FOLLOW_18_in_allocation_expr962); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt41 >= 1 ) break loop41;
                                        EarlyExitException eee =
                                            new EarlyExitException(41, input);
                                        throw eee;
                                }
                                cnt41++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_allocation_expr966); 

                            }


                            }
                            break;

                    }


                    match(input,41,FOLLOW_41_in_allocation_expr969); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    //'SET' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'NRPT' ( DIGIT | NUMBER )
                    result = QueryResults.SET_FILTERS_VARNAME_ON_PROTOCOLS_PSPRINGS_P_ON_HOST_NRPT_N;//Case 22
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "allocation_expr"



    // $ANTLR start "deallocation_expr"
    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:54:1: deallocation_expr : ( 'REMOVE' 'FILTERS' '*' 'ON' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'REMOVE' 'FILTERS' '*' 'ON' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'REMOVE' 'FILTERS' '*' 'ON' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' ( VARNAME | ( VARNAME ',' )+ VARNAME ) | 'REMOVE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' ( VARNAME | ( VARNAME ',' )+ VARNAME ) | 'REMOVE' 'FILTERS' '*' 'ON' 'PSPRINGS' '*' 'OF' ( VARNAME | ( VARNAME ',' )+ VARNAME ) | 'REMOVE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'REMOVE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'REMOVE' 'FILTERS' '*' 'ON' 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'REMOVE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) );
    public final QueryResults deallocation_expr() throws RecognitionException {
    	QueryResults result = null;
        try {
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:55:2: ( 'REMOVE' 'FILTERS' '*' 'ON' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'REMOVE' 'FILTERS' '*' 'ON' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'REMOVE' 'FILTERS' '*' 'ON' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' ( VARNAME | ( VARNAME ',' )+ VARNAME ) | 'REMOVE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' ( VARNAME | ( VARNAME ',' )+ VARNAME ) | 'REMOVE' 'FILTERS' '*' 'ON' 'PSPRINGS' '*' 'OF' ( VARNAME | ( VARNAME ',' )+ VARNAME ) | 'REMOVE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'REMOVE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'REMOVE' 'FILTERS' '*' 'ON' 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'REMOVE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) )
            int alt82=9;
            alt82 = dfa82.predict(input);
            switch (alt82) {
                case 1 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:55:4: 'REMOVE' 'FILTERS' '*' 'ON' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,48,FOLLOW_48_in_deallocation_expr985); 

                    match(input,28,FOLLOW_28_in_deallocation_expr986); 

                    match(input,17,FOLLOW_17_in_deallocation_expr987); 

                    match(input,43,FOLLOW_43_in_deallocation_expr988); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_deallocation_expr989); 

                    match(input,46,FOLLOW_46_in_deallocation_expr990); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:55:47: ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==DIGIT||LA45_0==NUMBER) ) {
                        int LA45_1 = input.LA(2);

                        if ( (LA45_1==18) ) {
                            alt45=2;
                        }
                        else if ( (LA45_1==43) ) {
                            alt45=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 45, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;

                    }
                    switch (alt45) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:55:48: ( DIGIT | NUMBER )
                            {
                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:55:63: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:55:63: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:55:64: ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:55:64: ( ( DIGIT | NUMBER ) ',' )+
                            int cnt44=0;
                            loop44:
                            do {
                                int alt44=2;
                                int LA44_0 = input.LA(1);

                                if ( (LA44_0==DIGIT||LA44_0==NUMBER) ) {
                                    int LA44_1 = input.LA(2);

                                    if ( (LA44_1==18) ) {
                                        alt44=1;
                                    }


                                }


                                switch (alt44) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:55:65: ( DIGIT | NUMBER ) ','
                            	    {
                            	    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                            	        input.consume();
                            	        state.errorRecovery=false;
                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        throw mse;
                            	    }


                            	    match(input,18,FOLLOW_18_in_deallocation_expr1005); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt44 >= 1 ) break loop44;
                                        EarlyExitException eee =
                                            new EarlyExitException(44, input);
                                        throw eee;
                                }
                                cnt44++;
                            } while (true);


                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }


                            }
                            break;

                    }


                    match(input,43,FOLLOW_43_in_deallocation_expr1016); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:55:105: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==HOSTNAME) ) {
                        int LA47_1 = input.LA(2);

                        if ( (LA47_1==18) ) {
                            alt47=2;
                        }
                        else if ( (LA47_1==EOF) ) {
                            alt47=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 47, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;

                    }
                    switch (alt47) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:55:106: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_deallocation_expr1018); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:55:115: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:55:115: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:55:116: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:55:116: ( HOSTNAME ',' )+
                            int cnt46=0;
                            loop46:
                            do {
                                int alt46=2;
                                int LA46_0 = input.LA(1);

                                if ( (LA46_0==HOSTNAME) ) {
                                    int LA46_1 = input.LA(2);

                                    if ( (LA46_1==18) ) {
                                        alt46=1;
                                    }


                                }


                                switch (alt46) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:55:117: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_deallocation_expr1022); 

                            	    match(input,18,FOLLOW_18_in_deallocation_expr1023); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt46 >= 1 ) break loop46;
                                        EarlyExitException eee =
                                            new EarlyExitException(46, input);
                                        throw eee;
                                }
                                cnt46++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_deallocation_expr1027); 

                            }


                            }
                            break;

                    }


                    //'REMOVE' 'FILTERS' '*' 'ON' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.REMOVE_FILTERS_AST_ON_PROTOCOL_PSPRINGS_N_ON_HOST;//Case 23
                    }
                    break;
                case 2 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:56:6: 'REMOVE' 'FILTERS' '*' 'ON' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,48,FOLLOW_48_in_deallocation_expr1037); 

                    match(input,28,FOLLOW_28_in_deallocation_expr1038); 

                    match(input,17,FOLLOW_17_in_deallocation_expr1039); 

                    match(input,43,FOLLOW_43_in_deallocation_expr1040); 

                    match(input,46,FOLLOW_46_in_deallocation_expr1041); 

                    match(input,17,FOLLOW_17_in_deallocation_expr1042); 

                    match(input,43,FOLLOW_43_in_deallocation_expr1043); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:56:47: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==HOSTNAME) ) {
                        int LA49_1 = input.LA(2);

                        if ( (LA49_1==18) ) {
                            alt49=2;
                        }
                        else if ( (LA49_1==EOF) ) {
                            alt49=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 49, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 0, input);

                        throw nvae;

                    }
                    switch (alt49) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:56:48: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_deallocation_expr1045); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:56:57: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:56:57: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:56:58: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:56:58: ( HOSTNAME ',' )+
                            int cnt48=0;
                            loop48:
                            do {
                                int alt48=2;
                                int LA48_0 = input.LA(1);

                                if ( (LA48_0==HOSTNAME) ) {
                                    int LA48_1 = input.LA(2);

                                    if ( (LA48_1==18) ) {
                                        alt48=1;
                                    }


                                }


                                switch (alt48) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:56:59: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_deallocation_expr1049); 

                            	    match(input,18,FOLLOW_18_in_deallocation_expr1050); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt48 >= 1 ) break loop48;
                                        EarlyExitException eee =
                                            new EarlyExitException(48, input);
                                        throw eee;
                                }
                                cnt48++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_deallocation_expr1054); 

                            }


                            }
                            break;

                    }

                    //'REMOVE' 'FILTERS' '*' 'ON' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.REMOVE_FILTERS_AST_ON_PSPRINGS_AST_ON_HOST;//Case24
                    }
                    break;
                case 3 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:57:8: 'REMOVE' 'FILTERS' '*' 'ON' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' ( VARNAME | ( VARNAME ',' )+ VARNAME )
                    {
                    match(input,48,FOLLOW_48_in_deallocation_expr1066); 

                    match(input,28,FOLLOW_28_in_deallocation_expr1067); 

                    match(input,17,FOLLOW_17_in_deallocation_expr1068); 

                    match(input,43,FOLLOW_43_in_deallocation_expr1069); 

                    match(input,46,FOLLOW_46_in_deallocation_expr1070); 

                    match(input,17,FOLLOW_17_in_deallocation_expr1071); 

                    match(input,43,FOLLOW_43_in_deallocation_expr1072); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:57:49: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==HOSTNAME) ) {
                        int LA51_1 = input.LA(2);

                        if ( (LA51_1==18) ) {
                            alt51=2;
                        }
                        else if ( (LA51_1==42) ) {
                            alt51=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 51, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;

                    }
                    switch (alt51) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:57:50: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_deallocation_expr1074); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:57:59: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:57:59: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:57:60: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:57:60: ( HOSTNAME ',' )+
                            int cnt50=0;
                            loop50:
                            do {
                                int alt50=2;
                                int LA50_0 = input.LA(1);

                                if ( (LA50_0==HOSTNAME) ) {
                                    int LA50_1 = input.LA(2);

                                    if ( (LA50_1==18) ) {
                                        alt50=1;
                                    }


                                }


                                switch (alt50) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:57:61: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_deallocation_expr1078); 

                            	    match(input,18,FOLLOW_18_in_deallocation_expr1079); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt50 >= 1 ) break loop50;
                                        EarlyExitException eee =
                                            new EarlyExitException(50, input);
                                        throw eee;
                                }
                                cnt50++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_deallocation_expr1083); 

                            }


                            }
                            break;

                    }


                    match(input,42,FOLLOW_42_in_deallocation_expr1086); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:57:89: ( VARNAME | ( VARNAME ',' )+ VARNAME )
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==VARNAME) ) {
                        int LA53_1 = input.LA(2);

                        if ( (LA53_1==18) ) {
                            alt53=2;
                        }
                        else if ( (LA53_1==EOF) ) {
                            alt53=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 53, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;

                    }
                    switch (alt53) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:57:90: VARNAME
                            {
                            match(input,VARNAME,FOLLOW_VARNAME_in_deallocation_expr1088); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:57:98: ( VARNAME ',' )+ VARNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:57:98: ( VARNAME ',' )+
                            int cnt52=0;
                            loop52:
                            do {
                                int alt52=2;
                                int LA52_0 = input.LA(1);

                                if ( (LA52_0==VARNAME) ) {
                                    int LA52_1 = input.LA(2);

                                    if ( (LA52_1==18) ) {
                                        alt52=1;
                                    }


                                }


                                switch (alt52) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:57:99: VARNAME ','
                            	    {
                            	    match(input,VARNAME,FOLLOW_VARNAME_in_deallocation_expr1091); 

                            	    match(input,18,FOLLOW_18_in_deallocation_expr1092); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt52 >= 1 ) break loop52;
                                        EarlyExitException eee =
                                            new EarlyExitException(52, input);
                                        throw eee;
                                }
                                cnt52++;
                            } while (true);


                            match(input,VARNAME,FOLLOW_VARNAME_in_deallocation_expr1095); 

                            }
                            break;

                    }

//                    /'REMOVE' 'FILTERS' '*' 'ON' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' ( VARNAME | ( VARNAME ',' )+ VARNAME )
                    result = QueryResults.REMOVE_FILTERS_AST_ON_PSPRINGS_AST_ON_HOST_OF_VARNAME;//Case 25
                    }
                    break;
                case 4 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:58:8: 'REMOVE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' ( VARNAME | ( VARNAME ',' )+ VARNAME )
                    {
                    match(input,48,FOLLOW_48_in_deallocation_expr1106); 

                    match(input,28,FOLLOW_28_in_deallocation_expr1107); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:58:25: ( VARNAME | ( VARNAME ',' )+ VARNAME )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==VARNAME) ) {
                        int LA55_1 = input.LA(2);

                        if ( (LA55_1==18) ) {
                            alt55=2;
                        }
                        else if ( (LA55_1==43) ) {
                            alt55=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 55, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;

                    }
                    switch (alt55) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:58:26: VARNAME
                            {
                            match(input,VARNAME,FOLLOW_VARNAME_in_deallocation_expr1109); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:58:34: ( VARNAME ',' )+ VARNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:58:34: ( VARNAME ',' )+
                            int cnt54=0;
                            loop54:
                            do {
                                int alt54=2;
                                int LA54_0 = input.LA(1);

                                if ( (LA54_0==VARNAME) ) {
                                    int LA54_1 = input.LA(2);

                                    if ( (LA54_1==18) ) {
                                        alt54=1;
                                    }


                                }


                                switch (alt54) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:58:35: VARNAME ','
                            	    {
                            	    match(input,VARNAME,FOLLOW_VARNAME_in_deallocation_expr1112); 

                            	    match(input,18,FOLLOW_18_in_deallocation_expr1113); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt54 >= 1 ) break loop54;
                                        EarlyExitException eee =
                                            new EarlyExitException(54, input);
                                        throw eee;
                                }
                                cnt54++;
                            } while (true);


                            match(input,VARNAME,FOLLOW_VARNAME_in_deallocation_expr1116); 

                            }
                            break;

                    }


                    match(input,43,FOLLOW_43_in_deallocation_expr1118); 

                    match(input,46,FOLLOW_46_in_deallocation_expr1119); 

                    match(input,17,FOLLOW_17_in_deallocation_expr1120); 

                    match(input,43,FOLLOW_43_in_deallocation_expr1121); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:58:76: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==HOSTNAME) ) {
                        int LA57_1 = input.LA(2);

                        if ( (LA57_1==18) ) {
                            alt57=2;
                        }
                        else if ( (LA57_1==42) ) {
                            alt57=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 57, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 0, input);

                        throw nvae;

                    }
                    switch (alt57) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:58:77: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_deallocation_expr1123); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:58:86: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:58:86: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:58:87: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:58:87: ( HOSTNAME ',' )+
                            int cnt56=0;
                            loop56:
                            do {
                                int alt56=2;
                                int LA56_0 = input.LA(1);

                                if ( (LA56_0==HOSTNAME) ) {
                                    int LA56_1 = input.LA(2);

                                    if ( (LA56_1==18) ) {
                                        alt56=1;
                                    }


                                }


                                switch (alt56) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:58:88: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_deallocation_expr1127); 

                            	    match(input,18,FOLLOW_18_in_deallocation_expr1128); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt56 >= 1 ) break loop56;
                                        EarlyExitException eee =
                                            new EarlyExitException(56, input);
                                        throw eee;
                                }
                                cnt56++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_deallocation_expr1132); 

                            }


                            }
                            break;

                    }


                    match(input,42,FOLLOW_42_in_deallocation_expr1135); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:58:116: ( VARNAME | ( VARNAME ',' )+ VARNAME )
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==VARNAME) ) {
                        int LA59_1 = input.LA(2);

                        if ( (LA59_1==18) ) {
                            alt59=2;
                        }
                        else if ( (LA59_1==EOF) ) {
                            alt59=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 59, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 0, input);

                        throw nvae;

                    }
                    switch (alt59) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:58:117: VARNAME
                            {
                            match(input,VARNAME,FOLLOW_VARNAME_in_deallocation_expr1137); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:58:125: ( VARNAME ',' )+ VARNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:58:125: ( VARNAME ',' )+
                            int cnt58=0;
                            loop58:
                            do {
                                int alt58=2;
                                int LA58_0 = input.LA(1);

                                if ( (LA58_0==VARNAME) ) {
                                    int LA58_1 = input.LA(2);

                                    if ( (LA58_1==18) ) {
                                        alt58=1;
                                    }


                                }


                                switch (alt58) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:58:126: VARNAME ','
                            	    {
                            	    match(input,VARNAME,FOLLOW_VARNAME_in_deallocation_expr1140); 

                            	    match(input,18,FOLLOW_18_in_deallocation_expr1141); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt58 >= 1 ) break loop58;
                                        EarlyExitException eee =
                                            new EarlyExitException(58, input);
                                        throw eee;
                                }
                                cnt58++;
                            } while (true);


                            match(input,VARNAME,FOLLOW_VARNAME_in_deallocation_expr1144); 

                            }
                            break;

                    }

                    //'REMOVE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' ( VARNAME | ( VARNAME ',' )+ VARNAME )
                    result = QueryResults.REMOVE_FILTERS_VARNAME_ON_PSPRINGS_AST_ON_HOST_OF_VARNAME; //Case 26
                    }
                    break;
                case 5 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:59:10: 'REMOVE' 'FILTERS' '*' 'ON' 'PSPRINGS' '*' 'OF' ( VARNAME | ( VARNAME ',' )+ VARNAME )
                    {
                    match(input,48,FOLLOW_48_in_deallocation_expr1164); 

                    match(input,28,FOLLOW_28_in_deallocation_expr1165); 

                    match(input,17,FOLLOW_17_in_deallocation_expr1166); 

                    match(input,43,FOLLOW_43_in_deallocation_expr1167); 

                    match(input,46,FOLLOW_46_in_deallocation_expr1168); 

                    match(input,17,FOLLOW_17_in_deallocation_expr1169); 

                    match(input,42,FOLLOW_42_in_deallocation_expr1170); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:59:51: ( VARNAME | ( VARNAME ',' )+ VARNAME )
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==VARNAME) ) {
                        int LA61_1 = input.LA(2);

                        if ( (LA61_1==18) ) {
                            alt61=2;
                        }
                        else if ( (LA61_1==EOF) ) {
                            alt61=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 61, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 0, input);

                        throw nvae;

                    }
                    switch (alt61) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:59:52: VARNAME
                            {
                            match(input,VARNAME,FOLLOW_VARNAME_in_deallocation_expr1172); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:59:60: ( VARNAME ',' )+ VARNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:59:60: ( VARNAME ',' )+
                            int cnt60=0;
                            loop60:
                            do {
                                int alt60=2;
                                int LA60_0 = input.LA(1);

                                if ( (LA60_0==VARNAME) ) {
                                    int LA60_1 = input.LA(2);

                                    if ( (LA60_1==18) ) {
                                        alt60=1;
                                    }


                                }


                                switch (alt60) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:59:61: VARNAME ','
                            	    {
                            	    match(input,VARNAME,FOLLOW_VARNAME_in_deallocation_expr1175); 

                            	    match(input,18,FOLLOW_18_in_deallocation_expr1176); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt60 >= 1 ) break loop60;
                                        EarlyExitException eee =
                                            new EarlyExitException(60, input);
                                        throw eee;
                                }
                                cnt60++;
                            } while (true);


                            match(input,VARNAME,FOLLOW_VARNAME_in_deallocation_expr1179); 

                            }
                            break;

                    }

                    //'REMOVE' 'FILTERS' '*' 'ON' 'PSPRINGS' '*' 'OF' ( VARNAME | ( VARNAME ',' )+ VARNAME )
                    result = QueryResults.REMOVE_FILTERS_AST_ON_PSPRINGS_AST_OF_VARNAME;//Case 27
                    }
                    break;
                case 6 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:60:8: 'REMOVE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,48,FOLLOW_48_in_deallocation_expr1190); 

                    match(input,28,FOLLOW_28_in_deallocation_expr1191); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:60:25: ( VARNAME | ( VARNAME ',' )+ VARNAME )
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==VARNAME) ) {
                        int LA63_1 = input.LA(2);

                        if ( (LA63_1==18) ) {
                            alt63=2;
                        }
                        else if ( (LA63_1==43) ) {
                            alt63=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 63, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 63, 0, input);

                        throw nvae;

                    }
                    switch (alt63) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:60:26: VARNAME
                            {
                            match(input,VARNAME,FOLLOW_VARNAME_in_deallocation_expr1193); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:60:34: ( VARNAME ',' )+ VARNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:60:34: ( VARNAME ',' )+
                            int cnt62=0;
                            loop62:
                            do {
                                int alt62=2;
                                int LA62_0 = input.LA(1);

                                if ( (LA62_0==VARNAME) ) {
                                    int LA62_1 = input.LA(2);

                                    if ( (LA62_1==18) ) {
                                        alt62=1;
                                    }


                                }


                                switch (alt62) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:60:35: VARNAME ','
                            	    {
                            	    match(input,VARNAME,FOLLOW_VARNAME_in_deallocation_expr1196); 

                            	    match(input,18,FOLLOW_18_in_deallocation_expr1197); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt62 >= 1 ) break loop62;
                                        EarlyExitException eee =
                                            new EarlyExitException(62, input);
                                        throw eee;
                                }
                                cnt62++;
                            } while (true);


                            match(input,VARNAME,FOLLOW_VARNAME_in_deallocation_expr1200); 

                            }
                            break;

                    }


                    match(input,43,FOLLOW_43_in_deallocation_expr1202); 

                    match(input,46,FOLLOW_46_in_deallocation_expr1203); 

                    match(input,17,FOLLOW_17_in_deallocation_expr1204); 

                    match(input,43,FOLLOW_43_in_deallocation_expr1205); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:60:76: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==HOSTNAME) ) {
                        int LA65_1 = input.LA(2);

                        if ( (LA65_1==18) ) {
                            alt65=2;
                        }
                        else if ( (LA65_1==EOF) ) {
                            alt65=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 65, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 0, input);

                        throw nvae;

                    }
                    switch (alt65) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:60:77: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_deallocation_expr1207); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:60:86: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:60:86: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:60:87: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:60:87: ( HOSTNAME ',' )+
                            int cnt64=0;
                            loop64:
                            do {
                                int alt64=2;
                                int LA64_0 = input.LA(1);

                                if ( (LA64_0==HOSTNAME) ) {
                                    int LA64_1 = input.LA(2);

                                    if ( (LA64_1==18) ) {
                                        alt64=1;
                                    }


                                }


                                switch (alt64) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:60:88: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_deallocation_expr1211); 

                            	    match(input,18,FOLLOW_18_in_deallocation_expr1212); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt64 >= 1 ) break loop64;
                                        EarlyExitException eee =
                                            new EarlyExitException(64, input);
                                        throw eee;
                                }
                                cnt64++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_deallocation_expr1216); 

                            }


                            }
                            break;

                    }

                    //'REMOVE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.REMOVE_FILTERS_VARNAME_ON_PSPRINGS_AST_ON_HOST;//Case 28
                    }
                    break;
                case 7 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:61:10: 'REMOVE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,48,FOLLOW_48_in_deallocation_expr1230); 

                    match(input,28,FOLLOW_28_in_deallocation_expr1231); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:61:27: ( VARNAME | ( VARNAME ',' )+ VARNAME )
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==VARNAME) ) {
                        int LA67_1 = input.LA(2);

                        if ( (LA67_1==18) ) {
                            alt67=2;
                        }
                        else if ( (LA67_1==43) ) {
                            alt67=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 67, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;

                    }
                    switch (alt67) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:61:28: VARNAME
                            {
                            match(input,VARNAME,FOLLOW_VARNAME_in_deallocation_expr1233); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:61:36: ( VARNAME ',' )+ VARNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:61:36: ( VARNAME ',' )+
                            int cnt66=0;
                            loop66:
                            do {
                                int alt66=2;
                                int LA66_0 = input.LA(1);

                                if ( (LA66_0==VARNAME) ) {
                                    int LA66_1 = input.LA(2);

                                    if ( (LA66_1==18) ) {
                                        alt66=1;
                                    }


                                }


                                switch (alt66) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:61:37: VARNAME ','
                            	    {
                            	    match(input,VARNAME,FOLLOW_VARNAME_in_deallocation_expr1236); 

                            	    match(input,18,FOLLOW_18_in_deallocation_expr1237); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt66 >= 1 ) break loop66;
                                        EarlyExitException eee =
                                            new EarlyExitException(66, input);
                                        throw eee;
                                }
                                cnt66++;
                            } while (true);


                            match(input,VARNAME,FOLLOW_VARNAME_in_deallocation_expr1240); 

                            }
                            break;

                    }


                    match(input,43,FOLLOW_43_in_deallocation_expr1242); 

                    match(input,46,FOLLOW_46_in_deallocation_expr1243); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:61:71: ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) )
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==DIGIT||LA69_0==NUMBER) ) {
                        int LA69_1 = input.LA(2);

                        if ( (LA69_1==18) ) {
                            alt69=2;
                        }
                        else if ( (LA69_1==43) ) {
                            alt69=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 69, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 0, input);

                        throw nvae;

                    }
                    switch (alt69) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:61:72: ( DIGIT | NUMBER )
                            {
                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:61:87: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:61:87: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:61:88: ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:61:88: ( ( DIGIT | NUMBER ) ',' )+
                            int cnt68=0;
                            loop68:
                            do {
                                int alt68=2;
                                int LA68_0 = input.LA(1);

                                if ( (LA68_0==DIGIT||LA68_0==NUMBER) ) {
                                    int LA68_1 = input.LA(2);

                                    if ( (LA68_1==18) ) {
                                        alt68=1;
                                    }


                                }


                                switch (alt68) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:61:89: ( DIGIT | NUMBER ) ','
                            	    {
                            	    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                            	        input.consume();
                            	        state.errorRecovery=false;
                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        throw mse;
                            	    }


                            	    match(input,18,FOLLOW_18_in_deallocation_expr1258); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt68 >= 1 ) break loop68;
                                        EarlyExitException eee =
                                            new EarlyExitException(68, input);
                                        throw eee;
                                }
                                cnt68++;
                            } while (true);


                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }


                            }
                            break;

                    }


                    match(input,43,FOLLOW_43_in_deallocation_expr1269); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:61:129: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==HOSTNAME) ) {
                        int LA71_1 = input.LA(2);

                        if ( (LA71_1==18) ) {
                            alt71=2;
                        }
                        else if ( (LA71_1==EOF) ) {
                            alt71=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 71, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 0, input);

                        throw nvae;

                    }
                    switch (alt71) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:61:130: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_deallocation_expr1271); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:61:139: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:61:139: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:61:140: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:61:140: ( HOSTNAME ',' )+
                            int cnt70=0;
                            loop70:
                            do {
                                int alt70=2;
                                int LA70_0 = input.LA(1);

                                if ( (LA70_0==HOSTNAME) ) {
                                    int LA70_1 = input.LA(2);

                                    if ( (LA70_1==18) ) {
                                        alt70=1;
                                    }


                                }


                                switch (alt70) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:61:141: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_deallocation_expr1275); 

                            	    match(input,18,FOLLOW_18_in_deallocation_expr1276); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt70 >= 1 ) break loop70;
                                        EarlyExitException eee =
                                            new EarlyExitException(70, input);
                                        throw eee;
                                }
                                cnt70++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_deallocation_expr1280); 

                            }


                            }
                            break;

                    }

                    //'REMOVE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.REMOVE_FILTERS_VARNAME_ON_PSPRINGS_N_ON_HOST;//Case 29
                    }
                    break;
                case 8 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:62:11: 'REMOVE' 'FILTERS' '*' 'ON' 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,48,FOLLOW_48_in_deallocation_expr1295); 

                    match(input,28,FOLLOW_28_in_deallocation_expr1296); 

                    match(input,17,FOLLOW_17_in_deallocation_expr1297); 

                    match(input,43,FOLLOW_43_in_deallocation_expr1298); 

                    match(input,46,FOLLOW_46_in_deallocation_expr1299); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:62:45: ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) )
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==DIGIT||LA73_0==NUMBER) ) {
                        int LA73_1 = input.LA(2);

                        if ( (LA73_1==18) ) {
                            alt73=2;
                        }
                        else if ( (LA73_1==43) ) {
                            alt73=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 73, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 0, input);

                        throw nvae;

                    }
                    switch (alt73) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:62:46: ( DIGIT | NUMBER )
                            {
                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:62:61: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:62:61: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:62:62: ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:62:62: ( ( DIGIT | NUMBER ) ',' )+
                            int cnt72=0;
                            loop72:
                            do {
                                int alt72=2;
                                int LA72_0 = input.LA(1);

                                if ( (LA72_0==DIGIT||LA72_0==NUMBER) ) {
                                    int LA72_1 = input.LA(2);

                                    if ( (LA72_1==18) ) {
                                        alt72=1;
                                    }


                                }


                                switch (alt72) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:62:63: ( DIGIT | NUMBER ) ','
                            	    {
                            	    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                            	        input.consume();
                            	        state.errorRecovery=false;
                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        throw mse;
                            	    }


                            	    match(input,18,FOLLOW_18_in_deallocation_expr1314); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt72 >= 1 ) break loop72;
                                        EarlyExitException eee =
                                            new EarlyExitException(72, input);
                                        throw eee;
                                }
                                cnt72++;
                            } while (true);


                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }


                            }
                            break;

                    }


                    match(input,43,FOLLOW_43_in_deallocation_expr1325); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:62:103: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==HOSTNAME) ) {
                        int LA75_1 = input.LA(2);

                        if ( (LA75_1==18) ) {
                            alt75=2;
                        }
                        else if ( (LA75_1==EOF) ) {
                            alt75=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 75, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 75, 0, input);

                        throw nvae;

                    }
                    switch (alt75) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:62:104: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_deallocation_expr1327); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:62:113: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:62:113: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:62:114: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:62:114: ( HOSTNAME ',' )+
                            int cnt74=0;
                            loop74:
                            do {
                                int alt74=2;
                                int LA74_0 = input.LA(1);

                                if ( (LA74_0==HOSTNAME) ) {
                                    int LA74_1 = input.LA(2);

                                    if ( (LA74_1==18) ) {
                                        alt74=1;
                                    }


                                }


                                switch (alt74) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:62:115: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_deallocation_expr1331); 

                            	    match(input,18,FOLLOW_18_in_deallocation_expr1332); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt74 >= 1 ) break loop74;
                                        EarlyExitException eee =
                                            new EarlyExitException(74, input);
                                        throw eee;
                                }
                                cnt74++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_deallocation_expr1336); 

                            }


                            }
                            break;

                    }

                    //'REMOVE' 'FILTERS' '*' 'ON' 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.REMOVE_FILTERS_AST_ON_PSPRINGS_N_ON_HOST;//Case 30
                    }
                    break;
                case 9 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:63:11: 'REMOVE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,48,FOLLOW_48_in_deallocation_expr1351); 

                    match(input,28,FOLLOW_28_in_deallocation_expr1352); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:63:28: ( VARNAME | ( VARNAME ',' )+ VARNAME )
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==VARNAME) ) {
                        int LA77_1 = input.LA(2);

                        if ( (LA77_1==18) ) {
                            alt77=2;
                        }
                        else if ( (LA77_1==43) ) {
                            alt77=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 77, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 77, 0, input);

                        throw nvae;

                    }
                    switch (alt77) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:63:29: VARNAME
                            {
                            match(input,VARNAME,FOLLOW_VARNAME_in_deallocation_expr1354); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:63:37: ( VARNAME ',' )+ VARNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:63:37: ( VARNAME ',' )+
                            int cnt76=0;
                            loop76:
                            do {
                                int alt76=2;
                                int LA76_0 = input.LA(1);

                                if ( (LA76_0==VARNAME) ) {
                                    int LA76_1 = input.LA(2);

                                    if ( (LA76_1==18) ) {
                                        alt76=1;
                                    }


                                }


                                switch (alt76) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:63:38: VARNAME ','
                            	    {
                            	    match(input,VARNAME,FOLLOW_VARNAME_in_deallocation_expr1357); 

                            	    match(input,18,FOLLOW_18_in_deallocation_expr1358); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt76 >= 1 ) break loop76;
                                        EarlyExitException eee =
                                            new EarlyExitException(76, input);
                                        throw eee;
                                }
                                cnt76++;
                            } while (true);


                            match(input,VARNAME,FOLLOW_VARNAME_in_deallocation_expr1361); 

                            }
                            break;

                    }


                    match(input,43,FOLLOW_43_in_deallocation_expr1363); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_deallocation_expr1364); 

                    match(input,46,FOLLOW_46_in_deallocation_expr1366); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:63:82: ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) )
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==DIGIT||LA79_0==NUMBER) ) {
                        int LA79_1 = input.LA(2);

                        if ( (LA79_1==18) ) {
                            alt79=2;
                        }
                        else if ( (LA79_1==43) ) {
                            alt79=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 79, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 79, 0, input);

                        throw nvae;

                    }
                    switch (alt79) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:63:83: ( DIGIT | NUMBER )
                            {
                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:63:98: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:63:98: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:63:99: ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:63:99: ( ( DIGIT | NUMBER ) ',' )+
                            int cnt78=0;
                            loop78:
                            do {
                                int alt78=2;
                                int LA78_0 = input.LA(1);

                                if ( (LA78_0==DIGIT||LA78_0==NUMBER) ) {
                                    int LA78_1 = input.LA(2);

                                    if ( (LA78_1==18) ) {
                                        alt78=1;
                                    }


                                }


                                switch (alt78) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:63:100: ( DIGIT | NUMBER ) ','
                            	    {
                            	    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                            	        input.consume();
                            	        state.errorRecovery=false;
                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        throw mse;
                            	    }


                            	    match(input,18,FOLLOW_18_in_deallocation_expr1381); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt78 >= 1 ) break loop78;
                                        EarlyExitException eee =
                                            new EarlyExitException(78, input);
                                        throw eee;
                                }
                                cnt78++;
                            } while (true);


                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }


                            }
                            break;

                    }


                    match(input,43,FOLLOW_43_in_deallocation_expr1392); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:63:140: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==HOSTNAME) ) {
                        int LA81_1 = input.LA(2);

                        if ( (LA81_1==18) ) {
                            alt81=2;
                        }
                        else if ( (LA81_1==EOF) ) {
                            alt81=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 81, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 81, 0, input);

                        throw nvae;

                    }
                    switch (alt81) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:63:141: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_deallocation_expr1394); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:63:150: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:63:150: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:63:151: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:63:151: ( HOSTNAME ',' )+
                            int cnt80=0;
                            loop80:
                            do {
                                int alt80=2;
                                int LA80_0 = input.LA(1);

                                if ( (LA80_0==HOSTNAME) ) {
                                    int LA80_1 = input.LA(2);

                                    if ( (LA80_1==18) ) {
                                        alt80=1;
                                    }


                                }


                                switch (alt80) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:63:152: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_deallocation_expr1398); 

                            	    match(input,18,FOLLOW_18_in_deallocation_expr1399); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt80 >= 1 ) break loop80;
                                        EarlyExitException eee =
                                            new EarlyExitException(80, input);
                                        throw eee;
                                }
                                cnt80++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_deallocation_expr1403); 

                            }


                            }
                            break;

                    }

                    //'REMOVE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.REMOVE_FILTERS_VARNAME_ON_PROTOCOL_PSPRINGS_N_ON_HOST;//Case 31
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "deallocation_expr"



    // $ANTLR start "delete_expr"
    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:65:1: delete_expr : ( 'DELETE' 'PSPRINGS' '*' 'OF' VARNAME | 'DELETE' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME | 'DELETE' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME | 'DELETE' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' 'ESPRINGS' '*' 'OF' VARNAME | 'DELETE' 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME | 'DELETE' 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME | 'DELETE' PROTOCOLS 'ESPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' 'ASPRINGS' '*' 'OF' VARNAME | 'DELETE' 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME | 'DELETE' 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME | 'DELETE' PROTOCOLS 'ASPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' 'GSPRINGS' '*' 'OF' VARNAME | 'DELETE' 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME | 'DELETE' 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME | 'DELETE' PROTOCOLS 'GSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' 'SPRINGS' '*' 'OF' VARNAME | 'DELETE' 'SPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'SPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' 'SINKHOLES' '*' 'OF' VARNAME | 'DELETE' 'SINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'SINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' 'PSINKHOLES' '*' 'OF' VARNAME | 'DELETE' 'PSINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'PSINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'PSINKHOLES' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' 'FILTERS' '*' | 'DELETE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) | 'DELETE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' 'FILTERS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' 'FILTERS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME | 'DELETE' 'FILTERS' '*' 'OF' VARNAME | 'DELETE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'OF' VARNAME );
    public final QueryResults delete_expr() throws RecognitionException {
    	QueryResults result = null;
        try {
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:66:2: ( 'DELETE' 'PSPRINGS' '*' 'OF' VARNAME | 'DELETE' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME | 'DELETE' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME | 'DELETE' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' 'ESPRINGS' '*' 'OF' VARNAME | 'DELETE' 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME | 'DELETE' 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME | 'DELETE' PROTOCOLS 'ESPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' 'ASPRINGS' '*' 'OF' VARNAME | 'DELETE' 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME | 'DELETE' 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME | 'DELETE' PROTOCOLS 'ASPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' 'GSPRINGS' '*' 'OF' VARNAME | 'DELETE' 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME | 'DELETE' 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME | 'DELETE' PROTOCOLS 'GSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' 'SPRINGS' '*' 'OF' VARNAME | 'DELETE' 'SPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'SPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' 'SINKHOLES' '*' 'OF' VARNAME | 'DELETE' 'SINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'SINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' 'PSINKHOLES' '*' 'OF' VARNAME | 'DELETE' 'PSINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'PSINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'PSINKHOLES' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' 'FILTERS' '*' | 'DELETE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) | 'DELETE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' 'FILTERS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' 'FILTERS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME | 'DELETE' 'FILTERS' '*' 'OF' VARNAME | 'DELETE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'OF' VARNAME )
            int alt159=41;
            alt159 = dfa159.predict(input);
            switch (alt159) {
                case 1 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:68:11: 'DELETE' 'PSPRINGS' '*' 'OF' VARNAME
                    {
                    match(input,24,FOLLOW_24_in_delete_expr1430); 

                    match(input,46,FOLLOW_46_in_delete_expr1431); 

                    match(input,17,FOLLOW_17_in_delete_expr1432); 

                    match(input,42,FOLLOW_42_in_delete_expr1433); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_delete_expr1434); 

                    //'DELETE' 'PSPRINGS' '*' 'OF' VARNAME
                    result = QueryResults.DELETE_PSPRINGS_AST_OF_VARNAME;//Case 32
                    }
                    break;
                case 2 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:69:11: 'DELETE' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,24,FOLLOW_24_in_delete_expr1447); 

                    match(input,46,FOLLOW_46_in_delete_expr1448); 

                    match(input,17,FOLLOW_17_in_delete_expr1449); 

                    match(input,43,FOLLOW_43_in_delete_expr1450); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:69:36: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==HOSTNAME) ) {
                        int LA84_1 = input.LA(2);

                        if ( (LA84_1==18) ) {
                            alt84=2;
                        }
                        else if ( (LA84_1==EOF) ) {
                            alt84=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 84, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 84, 0, input);

                        throw nvae;

                    }
                    switch (alt84) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:69:37: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1452); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:69:46: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:69:46: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:69:47: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:69:47: ( HOSTNAME ',' )+
                            int cnt83=0;
                            loop83:
                            do {
                                int alt83=2;
                                int LA83_0 = input.LA(1);

                                if ( (LA83_0==HOSTNAME) ) {
                                    int LA83_1 = input.LA(2);

                                    if ( (LA83_1==18) ) {
                                        alt83=1;
                                    }


                                }


                                switch (alt83) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:69:48: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1456); 

                            	    match(input,18,FOLLOW_18_in_delete_expr1457); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt83 >= 1 ) break loop83;
                                        EarlyExitException eee =
                                            new EarlyExitException(83, input);
                                        throw eee;
                                }
                                cnt83++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1461); 

                            }


                            }
                            break;

                    }

                    //'DELETE' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.DELETE_PSPRINGS_AST_ON_HOST; //Case 33
                    }
                    break;
                case 3 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:70:11: 'DELETE' PROTOCOLS 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,24,FOLLOW_24_in_delete_expr1476); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_delete_expr1477); 

                    match(input,46,FOLLOW_46_in_delete_expr1479); 

                    match(input,17,FOLLOW_17_in_delete_expr1480); 

                    match(input,43,FOLLOW_43_in_delete_expr1481); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:70:46: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==HOSTNAME) ) {
                        int LA86_1 = input.LA(2);

                        if ( (LA86_1==18) ) {
                            alt86=2;
                        }
                        else if ( (LA86_1==EOF) ) {
                            alt86=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 86, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 86, 0, input);

                        throw nvae;

                    }
                    switch (alt86) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:70:47: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1483); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:70:56: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:70:56: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:70:57: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:70:57: ( HOSTNAME ',' )+
                            int cnt85=0;
                            loop85:
                            do {
                                int alt85=2;
                                int LA85_0 = input.LA(1);

                                if ( (LA85_0==HOSTNAME) ) {
                                    int LA85_1 = input.LA(2);

                                    if ( (LA85_1==18) ) {
                                        alt85=1;
                                    }


                                }


                                switch (alt85) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:70:58: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1487); 

                            	    match(input,18,FOLLOW_18_in_delete_expr1488); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt85 >= 1 ) break loop85;
                                        EarlyExitException eee =
                                            new EarlyExitException(85, input);
                                        throw eee;
                                }
                                cnt85++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1492); 

                            }


                            }
                            break;

                    }

                    //'DELETE' PROTOCOLS 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.DELETE_PROTOCOL_PSPRINGS_AST_ON_HOST; //Case 34
                    }
                    break;
                case 4 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:71:11: 'DELETE' PROTOCOLS 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME
                    {
                    match(input,24,FOLLOW_24_in_delete_expr1507); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_delete_expr1508); 

                    match(input,46,FOLLOW_46_in_delete_expr1510); 

                    match(input,17,FOLLOW_17_in_delete_expr1511); 

                    match(input,43,FOLLOW_43_in_delete_expr1512); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:71:46: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==HOSTNAME) ) {
                        int LA88_1 = input.LA(2);

                        if ( (LA88_1==18) ) {
                            alt88=2;
                        }
                        else if ( (LA88_1==42) ) {
                            alt88=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 88, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 88, 0, input);

                        throw nvae;

                    }
                    switch (alt88) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:71:47: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1514); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:71:56: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:71:56: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:71:57: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:71:57: ( HOSTNAME ',' )+
                            int cnt87=0;
                            loop87:
                            do {
                                int alt87=2;
                                int LA87_0 = input.LA(1);

                                if ( (LA87_0==HOSTNAME) ) {
                                    int LA87_1 = input.LA(2);

                                    if ( (LA87_1==18) ) {
                                        alt87=1;
                                    }


                                }


                                switch (alt87) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:71:58: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1518); 

                            	    match(input,18,FOLLOW_18_in_delete_expr1519); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt87 >= 1 ) break loop87;
                                        EarlyExitException eee =
                                            new EarlyExitException(87, input);
                                        throw eee;
                                }
                                cnt87++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1523); 

                            }


                            }
                            break;

                    }


                    match(input,42,FOLLOW_42_in_delete_expr1526); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_delete_expr1527); 

                    //'DELETE' PROTOCOLS 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME
                    result = QueryResults.DELETE_PROTCOL_PSPRINGS_AST_ON_HOST_OF_VARNAME;//Case 35
                    }
                    break;
                case 5 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:72:11: 'DELETE' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME
                    {
                    match(input,24,FOLLOW_24_in_delete_expr1540); 

                    match(input,46,FOLLOW_46_in_delete_expr1541); 

                    match(input,17,FOLLOW_17_in_delete_expr1542); 

                    match(input,43,FOLLOW_43_in_delete_expr1543); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:72:36: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==HOSTNAME) ) {
                        int LA90_1 = input.LA(2);

                        if ( (LA90_1==18) ) {
                            alt90=2;
                        }
                        else if ( (LA90_1==42) ) {
                            alt90=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 90, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 90, 0, input);

                        throw nvae;

                    }
                    switch (alt90) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:72:37: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1545); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:72:46: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:72:46: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:72:47: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:72:47: ( HOSTNAME ',' )+
                            int cnt89=0;
                            loop89:
                            do {
                                int alt89=2;
                                int LA89_0 = input.LA(1);

                                if ( (LA89_0==HOSTNAME) ) {
                                    int LA89_1 = input.LA(2);

                                    if ( (LA89_1==18) ) {
                                        alt89=1;
                                    }


                                }


                                switch (alt89) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:72:48: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1549); 

                            	    match(input,18,FOLLOW_18_in_delete_expr1550); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt89 >= 1 ) break loop89;
                                        EarlyExitException eee =
                                            new EarlyExitException(89, input);
                                        throw eee;
                                }
                                cnt89++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1554); 

                            }


                            }
                            break;

                    }


                    match(input,42,FOLLOW_42_in_delete_expr1557); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_delete_expr1558); 

                    //'DELETE' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME
                    result = QueryResults.DELETE_PSPRINGS_AST_ON_HOST_OF_VARNAME;//Case 36
                    }
                    break;
                case 6 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:73:4: 'DELETE' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,24,FOLLOW_24_in_delete_expr1564); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_delete_expr1565); 

                    match(input,46,FOLLOW_46_in_delete_expr1567); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:73:32: ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) )
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==DIGIT||LA92_0==NUMBER) ) {
                        int LA92_1 = input.LA(2);

                        if ( (LA92_1==18) ) {
                            alt92=2;
                        }
                        else if ( (LA92_1==43) ) {
                            alt92=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 92, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 92, 0, input);

                        throw nvae;

                    }
                    switch (alt92) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:73:33: ( DIGIT | NUMBER )
                            {
                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:73:48: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:73:48: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:73:49: ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:73:49: ( ( DIGIT | NUMBER ) ',' )+
                            int cnt91=0;
                            loop91:
                            do {
                                int alt91=2;
                                int LA91_0 = input.LA(1);

                                if ( (LA91_0==DIGIT||LA91_0==NUMBER) ) {
                                    int LA91_1 = input.LA(2);

                                    if ( (LA91_1==18) ) {
                                        alt91=1;
                                    }


                                }


                                switch (alt91) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:73:50: ( DIGIT | NUMBER ) ','
                            	    {
                            	    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                            	        input.consume();
                            	        state.errorRecovery=false;
                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        throw mse;
                            	    }


                            	    match(input,18,FOLLOW_18_in_delete_expr1582); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt91 >= 1 ) break loop91;
                                        EarlyExitException eee =
                                            new EarlyExitException(91, input);
                                        throw eee;
                                }
                                cnt91++;
                            } while (true);


                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }


                            }
                            break;

                    }


                    match(input,43,FOLLOW_43_in_delete_expr1593); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:73:90: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==HOSTNAME) ) {
                        int LA94_1 = input.LA(2);

                        if ( (LA94_1==18) ) {
                            alt94=2;
                        }
                        else if ( (LA94_1==EOF) ) {
                            alt94=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 94, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 94, 0, input);

                        throw nvae;

                    }
                    switch (alt94) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:73:91: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1595); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:73:100: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:73:100: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:73:101: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:73:101: ( HOSTNAME ',' )+
                            int cnt93=0;
                            loop93:
                            do {
                                int alt93=2;
                                int LA93_0 = input.LA(1);

                                if ( (LA93_0==HOSTNAME) ) {
                                    int LA93_1 = input.LA(2);

                                    if ( (LA93_1==18) ) {
                                        alt93=1;
                                    }


                                }


                                switch (alt93) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:73:102: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1599); 

                            	    match(input,18,FOLLOW_18_in_delete_expr1600); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt93 >= 1 ) break loop93;
                                        EarlyExitException eee =
                                            new EarlyExitException(93, input);
                                        throw eee;
                                }
                                cnt93++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1604); 

                            }


                            }
                            break;

                    }

                    //'DELETE' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.DELETE_PROTCOL_PSPRINGS_N_ON_HOST;//Case 37
                    }
                    break;
                case 7 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:75:11: 'DELETE' 'ESPRINGS' '*' 'OF' VARNAME
                    {
                    match(input,24,FOLLOW_24_in_delete_expr1625); 

                    match(input,26,FOLLOW_26_in_delete_expr1626); 

                    match(input,17,FOLLOW_17_in_delete_expr1627); 

                    match(input,42,FOLLOW_42_in_delete_expr1628); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_delete_expr1629); 
                    
                    
                    //'DELETE' 'ESPRINGS' '*' 'OF' VARNAME
                    result = QueryResults.DELETE_ESPRINGS_AST_ON_HOST;//Case 38
                    }
                    break;
                case 8 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:76:11: 'DELETE' 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,24,FOLLOW_24_in_delete_expr1642); 

                    match(input,26,FOLLOW_26_in_delete_expr1643); 

                    match(input,17,FOLLOW_17_in_delete_expr1644); 

                    match(input,43,FOLLOW_43_in_delete_expr1645); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:76:36: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==HOSTNAME) ) {
                        int LA96_1 = input.LA(2);

                        if ( (LA96_1==18) ) {
                            alt96=2;
                        }
                        else if ( (LA96_1==EOF) ) {
                            alt96=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 96, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 96, 0, input);

                        throw nvae;

                    }
                    switch (alt96) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:76:37: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1647); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:76:46: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:76:46: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:76:47: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:76:47: ( HOSTNAME ',' )+
                            int cnt95=0;
                            loop95:
                            do {
                                int alt95=2;
                                int LA95_0 = input.LA(1);

                                if ( (LA95_0==HOSTNAME) ) {
                                    int LA95_1 = input.LA(2);

                                    if ( (LA95_1==18) ) {
                                        alt95=1;
                                    }


                                }


                                switch (alt95) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:76:48: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1651); 

                            	    match(input,18,FOLLOW_18_in_delete_expr1652); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt95 >= 1 ) break loop95;
                                        EarlyExitException eee =
                                            new EarlyExitException(95, input);
                                        throw eee;
                                }
                                cnt95++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1656); 

                            }


                            }
                            break;

                    }

                    //'DELETE' 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.DELETE_PROTOCOL_ESPRINGS_AST_ON_HOST;//Case 39
                    }
                    break;
                case 9 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:77:11: 'DELETE' PROTOCOLS 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,24,FOLLOW_24_in_delete_expr1671); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_delete_expr1672); 

                    match(input,26,FOLLOW_26_in_delete_expr1674); 

                    match(input,17,FOLLOW_17_in_delete_expr1675); 

                    match(input,43,FOLLOW_43_in_delete_expr1676); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:77:46: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==HOSTNAME) ) {
                        int LA98_1 = input.LA(2);

                        if ( (LA98_1==18) ) {
                            alt98=2;
                        }
                        else if ( (LA98_1==EOF) ) {
                            alt98=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 98, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 98, 0, input);

                        throw nvae;

                    }
                    switch (alt98) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:77:47: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1678); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:77:56: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:77:56: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:77:57: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:77:57: ( HOSTNAME ',' )+
                            int cnt97=0;
                            loop97:
                            do {
                                int alt97=2;
                                int LA97_0 = input.LA(1);

                                if ( (LA97_0==HOSTNAME) ) {
                                    int LA97_1 = input.LA(2);

                                    if ( (LA97_1==18) ) {
                                        alt97=1;
                                    }


                                }


                                switch (alt97) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:77:58: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1682); 

                            	    match(input,18,FOLLOW_18_in_delete_expr1683); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt97 >= 1 ) break loop97;
                                        EarlyExitException eee =
                                            new EarlyExitException(97, input);
                                        throw eee;
                                }
                                cnt97++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1687); 

                            }


                            }
                            break;

                    }

                    //'DELETE' PROTOCOLS 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.DELETE_PROTCOL_ESPRINGS_AST_ON_HOST;//Case 40
                    }
                    break;
                case 10 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:78:11: 'DELETE' PROTOCOLS 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME
                    {
                    match(input,24,FOLLOW_24_in_delete_expr1702); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_delete_expr1703); 

                    match(input,26,FOLLOW_26_in_delete_expr1705); 

                    match(input,17,FOLLOW_17_in_delete_expr1706); 

                    match(input,43,FOLLOW_43_in_delete_expr1707); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:78:46: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==HOSTNAME) ) {
                        int LA100_1 = input.LA(2);

                        if ( (LA100_1==18) ) {
                            alt100=2;
                        }
                        else if ( (LA100_1==42) ) {
                            alt100=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 100, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 100, 0, input);

                        throw nvae;

                    }
                    switch (alt100) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:78:47: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1709); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:78:56: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:78:56: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:78:57: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:78:57: ( HOSTNAME ',' )+
                            int cnt99=0;
                            loop99:
                            do {
                                int alt99=2;
                                int LA99_0 = input.LA(1);

                                if ( (LA99_0==HOSTNAME) ) {
                                    int LA99_1 = input.LA(2);

                                    if ( (LA99_1==18) ) {
                                        alt99=1;
                                    }


                                }


                                switch (alt99) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:78:58: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1713); 

                            	    match(input,18,FOLLOW_18_in_delete_expr1714); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt99 >= 1 ) break loop99;
                                        EarlyExitException eee =
                                            new EarlyExitException(99, input);
                                        throw eee;
                                }
                                cnt99++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1718); 

                            }


                            }
                            break;

                    }


                    match(input,42,FOLLOW_42_in_delete_expr1721); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_delete_expr1722); 

                    //'DELETE' PROTOCOLS 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME
                    result = QueryResults.DELETE_ESPRINGS_AST_ON_HOST_OF_VARNAME;//Case 41
                    }
                    break;
                case 11 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:79:11: 'DELETE' 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME
                    {
                    match(input,24,FOLLOW_24_in_delete_expr1735); 

                    match(input,26,FOLLOW_26_in_delete_expr1736); 

                    match(input,17,FOLLOW_17_in_delete_expr1737); 

                    match(input,43,FOLLOW_43_in_delete_expr1738); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:79:36: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==HOSTNAME) ) {
                        int LA102_1 = input.LA(2);

                        if ( (LA102_1==18) ) {
                            alt102=2;
                        }
                        else if ( (LA102_1==42) ) {
                            alt102=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 102, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 102, 0, input);

                        throw nvae;

                    }
                    switch (alt102) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:79:37: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1740); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:79:46: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:79:46: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:79:47: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:79:47: ( HOSTNAME ',' )+
                            int cnt101=0;
                            loop101:
                            do {
                                int alt101=2;
                                int LA101_0 = input.LA(1);

                                if ( (LA101_0==HOSTNAME) ) {
                                    int LA101_1 = input.LA(2);

                                    if ( (LA101_1==18) ) {
                                        alt101=1;
                                    }


                                }


                                switch (alt101) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:79:48: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1744); 

                            	    match(input,18,FOLLOW_18_in_delete_expr1745); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt101 >= 1 ) break loop101;
                                        EarlyExitException eee =
                                            new EarlyExitException(101, input);
                                        throw eee;
                                }
                                cnt101++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1749); 

                            }


                            }
                            break;

                    }


                    match(input,42,FOLLOW_42_in_delete_expr1752); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_delete_expr1753); 

                    //'DELETE' 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME
                    result = QueryResults.DELETE_ESPRINGS_AST_ON_HOST_OF_VARNAME; //Case 42
                    }
                    break;
                case 12 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:80:4: 'DELETE' PROTOCOLS 'ESPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,24,FOLLOW_24_in_delete_expr1759); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_delete_expr1760); 

                    match(input,26,FOLLOW_26_in_delete_expr1762); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:80:32: ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) )
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==DIGIT||LA104_0==NUMBER) ) {
                        int LA104_1 = input.LA(2);

                        if ( (LA104_1==18) ) {
                            alt104=2;
                        }
                        else if ( (LA104_1==43) ) {
                            alt104=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 104, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 104, 0, input);

                        throw nvae;

                    }
                    switch (alt104) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:80:33: ( DIGIT | NUMBER )
                            {
                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:80:48: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:80:48: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:80:49: ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:80:49: ( ( DIGIT | NUMBER ) ',' )+
                            int cnt103=0;
                            loop103:
                            do {
                                int alt103=2;
                                int LA103_0 = input.LA(1);

                                if ( (LA103_0==DIGIT||LA103_0==NUMBER) ) {
                                    int LA103_1 = input.LA(2);

                                    if ( (LA103_1==18) ) {
                                        alt103=1;
                                    }


                                }


                                switch (alt103) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:80:50: ( DIGIT | NUMBER ) ','
                            	    {
                            	    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                            	        input.consume();
                            	        state.errorRecovery=false;
                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        throw mse;
                            	    }


                            	    match(input,18,FOLLOW_18_in_delete_expr1777); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt103 >= 1 ) break loop103;
                                        EarlyExitException eee =
                                            new EarlyExitException(103, input);
                                        throw eee;
                                }
                                cnt103++;
                            } while (true);


                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }


                            }
                            break;

                    }


                    match(input,43,FOLLOW_43_in_delete_expr1788); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:80:90: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==HOSTNAME) ) {
                        int LA106_1 = input.LA(2);

                        if ( (LA106_1==18) ) {
                            alt106=2;
                        }
                        else if ( (LA106_1==EOF) ) {
                            alt106=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 106, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 106, 0, input);

                        throw nvae;

                    }
                    switch (alt106) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:80:91: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1790); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:80:100: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:80:100: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:80:101: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:80:101: ( HOSTNAME ',' )+
                            int cnt105=0;
                            loop105:
                            do {
                                int alt105=2;
                                int LA105_0 = input.LA(1);

                                if ( (LA105_0==HOSTNAME) ) {
                                    int LA105_1 = input.LA(2);

                                    if ( (LA105_1==18) ) {
                                        alt105=1;
                                    }


                                }


                                switch (alt105) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:80:102: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1794); 

                            	    match(input,18,FOLLOW_18_in_delete_expr1795); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt105 >= 1 ) break loop105;
                                        EarlyExitException eee =
                                            new EarlyExitException(105, input);
                                        throw eee;
                                }
                                cnt105++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1799); 

                            }


                            }
                            break;

                    }

                    //'DELETE' PROTOCOLS 'ESPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.DELETE_PROTCOL_ESPRINGS_N_ON_HOST;//Case 43
                    }
                    break;
                case 13 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:82:4: 'DELETE' 'ASPRINGS' '*' 'OF' VARNAME
                    {
                    match(input,24,FOLLOW_24_in_delete_expr1811); 

                    match(input,21,FOLLOW_21_in_delete_expr1812); 

                    match(input,17,FOLLOW_17_in_delete_expr1813); 

                    match(input,42,FOLLOW_42_in_delete_expr1814); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_delete_expr1815); 

                    //'DELETE' 'ASPRINGS' '*' 'OF' VARNAME
                    result = QueryResults.DELETE_ASPRINGS_AST_ON_VARNAME;//Case 44
                    }
                    break;
                case 14 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:83:11: 'DELETE' 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,24,FOLLOW_24_in_delete_expr1828); 

                    match(input,21,FOLLOW_21_in_delete_expr1829); 

                    match(input,17,FOLLOW_17_in_delete_expr1830); 

                    match(input,43,FOLLOW_43_in_delete_expr1831); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:83:36: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==HOSTNAME) ) {
                        int LA108_1 = input.LA(2);

                        if ( (LA108_1==18) ) {
                            alt108=2;
                        }
                        else if ( (LA108_1==EOF) ) {
                            alt108=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 108, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 108, 0, input);

                        throw nvae;

                    }
                    switch (alt108) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:83:37: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1833); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:83:46: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:83:46: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:83:47: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:83:47: ( HOSTNAME ',' )+
                            int cnt107=0;
                            loop107:
                            do {
                                int alt107=2;
                                int LA107_0 = input.LA(1);

                                if ( (LA107_0==HOSTNAME) ) {
                                    int LA107_1 = input.LA(2);

                                    if ( (LA107_1==18) ) {
                                        alt107=1;
                                    }


                                }


                                switch (alt107) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:83:48: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1837); 

                            	    match(input,18,FOLLOW_18_in_delete_expr1838); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt107 >= 1 ) break loop107;
                                        EarlyExitException eee =
                                            new EarlyExitException(107, input);
                                        throw eee;
                                }
                                cnt107++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1842); 

                            }


                            }
                            break;

                    }

                    //'DELETE' 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.DELETE_ASPRINGS_AST_ON_HOST; //Case 45
                    }
                    break;
                case 15 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:84:11: 'DELETE' PROTOCOLS 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,24,FOLLOW_24_in_delete_expr1857); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_delete_expr1858); 

                    match(input,21,FOLLOW_21_in_delete_expr1860); 

                    match(input,17,FOLLOW_17_in_delete_expr1861); 

                    match(input,43,FOLLOW_43_in_delete_expr1862); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:84:46: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==HOSTNAME) ) {
                        int LA110_1 = input.LA(2);

                        if ( (LA110_1==18) ) {
                            alt110=2;
                        }
                        else if ( (LA110_1==EOF) ) {
                            alt110=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 110, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 110, 0, input);

                        throw nvae;

                    }
                    switch (alt110) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:84:47: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1864); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:84:56: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:84:56: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:84:57: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:84:57: ( HOSTNAME ',' )+
                            int cnt109=0;
                            loop109:
                            do {
                                int alt109=2;
                                int LA109_0 = input.LA(1);

                                if ( (LA109_0==HOSTNAME) ) {
                                    int LA109_1 = input.LA(2);

                                    if ( (LA109_1==18) ) {
                                        alt109=1;
                                    }


                                }


                                switch (alt109) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:84:58: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1868); 

                            	    match(input,18,FOLLOW_18_in_delete_expr1869); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt109 >= 1 ) break loop109;
                                        EarlyExitException eee =
                                            new EarlyExitException(109, input);
                                        throw eee;
                                }
                                cnt109++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1873); 

                            }


                            }
                            break;

                    }

                    //'DELETE' PROTOCOLS 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.DELETE_PROTCOL_ASPRINGS_AST_ON_HOST;//Case 46
                    }
                    break;
                case 16 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:85:11: 'DELETE' PROTOCOLS 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME
                    {
                    match(input,24,FOLLOW_24_in_delete_expr1888); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_delete_expr1889); 

                    match(input,21,FOLLOW_21_in_delete_expr1891); 

                    match(input,17,FOLLOW_17_in_delete_expr1892); 

                    match(input,43,FOLLOW_43_in_delete_expr1893); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:85:46: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==HOSTNAME) ) {
                        int LA112_1 = input.LA(2);

                        if ( (LA112_1==18) ) {
                            alt112=2;
                        }
                        else if ( (LA112_1==42) ) {
                            alt112=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 112, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 112, 0, input);

                        throw nvae;

                    }
                    switch (alt112) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:85:47: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1895); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:85:56: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:85:56: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:85:57: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:85:57: ( HOSTNAME ',' )+
                            int cnt111=0;
                            loop111:
                            do {
                                int alt111=2;
                                int LA111_0 = input.LA(1);

                                if ( (LA111_0==HOSTNAME) ) {
                                    int LA111_1 = input.LA(2);

                                    if ( (LA111_1==18) ) {
                                        alt111=1;
                                    }


                                }


                                switch (alt111) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:85:58: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1899); 

                            	    match(input,18,FOLLOW_18_in_delete_expr1900); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt111 >= 1 ) break loop111;
                                        EarlyExitException eee =
                                            new EarlyExitException(111, input);
                                        throw eee;
                                }
                                cnt111++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1904); 

                            }


                            }
                            break;

                    }


                    match(input,42,FOLLOW_42_in_delete_expr1907); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_delete_expr1908); 

                    //'DELETE' PROTOCOLS 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME
                    result = QueryResults.DELETE_PROTCOL_ASPRINGS_AST_ON_HOST_OF_VARNAME;//Case 47
                    }
                    break;
                case 17 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:86:11: 'DELETE' 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME
                    {
                    match(input,24,FOLLOW_24_in_delete_expr1921); 

                    match(input,21,FOLLOW_21_in_delete_expr1922); 

                    match(input,17,FOLLOW_17_in_delete_expr1923); 

                    match(input,43,FOLLOW_43_in_delete_expr1924); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:86:36: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt114=2;
                    int LA114_0 = input.LA(1);

                    if ( (LA114_0==HOSTNAME) ) {
                        int LA114_1 = input.LA(2);

                        if ( (LA114_1==18) ) {
                            alt114=2;
                        }
                        else if ( (LA114_1==42) ) {
                            alt114=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 114, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 114, 0, input);

                        throw nvae;

                    }
                    switch (alt114) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:86:37: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1926); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:86:46: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:86:46: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:86:47: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:86:47: ( HOSTNAME ',' )+
                            int cnt113=0;
                            loop113:
                            do {
                                int alt113=2;
                                int LA113_0 = input.LA(1);

                                if ( (LA113_0==HOSTNAME) ) {
                                    int LA113_1 = input.LA(2);

                                    if ( (LA113_1==18) ) {
                                        alt113=1;
                                    }


                                }


                                switch (alt113) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:86:48: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1930); 

                            	    match(input,18,FOLLOW_18_in_delete_expr1931); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt113 >= 1 ) break loop113;
                                        EarlyExitException eee =
                                            new EarlyExitException(113, input);
                                        throw eee;
                                }
                                cnt113++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1935); 

                            }


                            }
                            break;

                    }


                    match(input,42,FOLLOW_42_in_delete_expr1938); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_delete_expr1939); 

                    //'DELETE' 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME
                    result = QueryResults.DELETE_ASPRINGS_AST_ON_HOST_OF_VARNAME;//Case 48
                    }
                    break;
                case 18 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:87:4: 'DELETE' PROTOCOLS 'ASPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,24,FOLLOW_24_in_delete_expr1945); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_delete_expr1946); 

                    match(input,21,FOLLOW_21_in_delete_expr1948); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:87:32: ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) )
                    int alt116=2;
                    int LA116_0 = input.LA(1);

                    if ( (LA116_0==DIGIT||LA116_0==NUMBER) ) {
                        int LA116_1 = input.LA(2);

                        if ( (LA116_1==18) ) {
                            alt116=2;
                        }
                        else if ( (LA116_1==43) ) {
                            alt116=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 116, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 116, 0, input);

                        throw nvae;

                    }
                    switch (alt116) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:87:33: ( DIGIT | NUMBER )
                            {
                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:87:48: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:87:48: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:87:49: ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:87:49: ( ( DIGIT | NUMBER ) ',' )+
                            int cnt115=0;
                            loop115:
                            do {
                                int alt115=2;
                                int LA115_0 = input.LA(1);

                                if ( (LA115_0==DIGIT||LA115_0==NUMBER) ) {
                                    int LA115_1 = input.LA(2);

                                    if ( (LA115_1==18) ) {
                                        alt115=1;
                                    }


                                }


                                switch (alt115) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:87:50: ( DIGIT | NUMBER ) ','
                            	    {
                            	    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                            	        input.consume();
                            	        state.errorRecovery=false;
                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        throw mse;
                            	    }


                            	    match(input,18,FOLLOW_18_in_delete_expr1963); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt115 >= 1 ) break loop115;
                                        EarlyExitException eee =
                                            new EarlyExitException(115, input);
                                        throw eee;
                                }
                                cnt115++;
                            } while (true);


                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }


                            }
                            break;

                    }


                    match(input,43,FOLLOW_43_in_delete_expr1974); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:87:90: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt118=2;
                    int LA118_0 = input.LA(1);

                    if ( (LA118_0==HOSTNAME) ) {
                        int LA118_1 = input.LA(2);

                        if ( (LA118_1==18) ) {
                            alt118=2;
                        }
                        else if ( (LA118_1==EOF) ) {
                            alt118=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 118, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 118, 0, input);

                        throw nvae;

                    }
                    switch (alt118) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:87:91: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1976); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:87:100: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:87:100: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:87:101: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:87:101: ( HOSTNAME ',' )+
                            int cnt117=0;
                            loop117:
                            do {
                                int alt117=2;
                                int LA117_0 = input.LA(1);

                                if ( (LA117_0==HOSTNAME) ) {
                                    int LA117_1 = input.LA(2);

                                    if ( (LA117_1==18) ) {
                                        alt117=1;
                                    }


                                }


                                switch (alt117) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:87:102: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1980); 

                            	    match(input,18,FOLLOW_18_in_delete_expr1981); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt117 >= 1 ) break loop117;
                                        EarlyExitException eee =
                                            new EarlyExitException(117, input);
                                        throw eee;
                                }
                                cnt117++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr1985); 

                            }


                            }
                            break;

                    }

                    //'DELETE' PROTOCOLS 'ASPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.DELETE_PROTOCOL_ASPRINGS_N_ON_HOST;//Case 49
                    }
                    break;
                case 19 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:89:6: 'DELETE' 'GSPRINGS' '*' 'OF' VARNAME
                    {
                    match(input,24,FOLLOW_24_in_delete_expr2001); 

                    match(input,31,FOLLOW_31_in_delete_expr2002); 

                    match(input,17,FOLLOW_17_in_delete_expr2003); 

                    match(input,42,FOLLOW_42_in_delete_expr2004); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_delete_expr2005); 

                    //'DELETE' 'GSPRINGS' '*' 'OF' VARNAME
                    result = QueryResults.DELETE_GSPRINGS_AST_ON_VARNAME;//Case 50
                    }
                    break;
                case 20 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:90:11: 'DELETE' 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,24,FOLLOW_24_in_delete_expr2018); 

                    match(input,31,FOLLOW_31_in_delete_expr2019); 

                    match(input,17,FOLLOW_17_in_delete_expr2020); 

                    match(input,43,FOLLOW_43_in_delete_expr2021); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:90:36: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt120=2;
                    int LA120_0 = input.LA(1);

                    if ( (LA120_0==HOSTNAME) ) {
                        int LA120_1 = input.LA(2);

                        if ( (LA120_1==18) ) {
                            alt120=2;
                        }
                        else if ( (LA120_1==EOF) ) {
                            alt120=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 120, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 120, 0, input);

                        throw nvae;

                    }
                    switch (alt120) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:90:37: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2023); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:90:46: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:90:46: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:90:47: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:90:47: ( HOSTNAME ',' )+
                            int cnt119=0;
                            loop119:
                            do {
                                int alt119=2;
                                int LA119_0 = input.LA(1);

                                if ( (LA119_0==HOSTNAME) ) {
                                    int LA119_1 = input.LA(2);

                                    if ( (LA119_1==18) ) {
                                        alt119=1;
                                    }


                                }


                                switch (alt119) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:90:48: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2027); 

                            	    match(input,18,FOLLOW_18_in_delete_expr2028); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt119 >= 1 ) break loop119;
                                        EarlyExitException eee =
                                            new EarlyExitException(119, input);
                                        throw eee;
                                }
                                cnt119++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2032); 

                            }


                            }
                            break;

                    }

                    //'DELETE' 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.DELETE_GSPRINGS_AST_ON_HOST; //Case 51
                    }
                    break;
                case 21 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:91:11: 'DELETE' PROTOCOLS 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,24,FOLLOW_24_in_delete_expr2047); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_delete_expr2048); 

                    match(input,31,FOLLOW_31_in_delete_expr2050); 

                    match(input,17,FOLLOW_17_in_delete_expr2051); 

                    match(input,43,FOLLOW_43_in_delete_expr2052); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:91:46: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt122=2;
                    int LA122_0 = input.LA(1);

                    if ( (LA122_0==HOSTNAME) ) {
                        int LA122_1 = input.LA(2);

                        if ( (LA122_1==18) ) {
                            alt122=2;
                        }
                        else if ( (LA122_1==EOF) ) {
                            alt122=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 122, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 122, 0, input);

                        throw nvae;

                    }
                    switch (alt122) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:91:47: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2054); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:91:56: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:91:56: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:91:57: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:91:57: ( HOSTNAME ',' )+
                            int cnt121=0;
                            loop121:
                            do {
                                int alt121=2;
                                int LA121_0 = input.LA(1);

                                if ( (LA121_0==HOSTNAME) ) {
                                    int LA121_1 = input.LA(2);

                                    if ( (LA121_1==18) ) {
                                        alt121=1;
                                    }


                                }


                                switch (alt121) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:91:58: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2058); 

                            	    match(input,18,FOLLOW_18_in_delete_expr2059); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt121 >= 1 ) break loop121;
                                        EarlyExitException eee =
                                            new EarlyExitException(121, input);
                                        throw eee;
                                }
                                cnt121++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2063); 

                            }


                            }
                            break;

                    }

                    //'DELETE' PROTOCOLS 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.DELETE_PROTOCOL_GSPRINGS_AST_ON_HOST;//Case 52
                    }
                    break;
                case 22 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:92:11: 'DELETE' PROTOCOLS 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME
                    {
                    match(input,24,FOLLOW_24_in_delete_expr2078); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_delete_expr2079); 

                    match(input,31,FOLLOW_31_in_delete_expr2081); 

                    match(input,17,FOLLOW_17_in_delete_expr2082); 

                    match(input,43,FOLLOW_43_in_delete_expr2083); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:92:46: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt124=2;
                    int LA124_0 = input.LA(1);

                    if ( (LA124_0==HOSTNAME) ) {
                        int LA124_1 = input.LA(2);

                        if ( (LA124_1==18) ) {
                            alt124=2;
                        }
                        else if ( (LA124_1==42) ) {
                            alt124=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 124, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 124, 0, input);

                        throw nvae;

                    }
                    switch (alt124) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:92:47: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2085); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:92:56: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:92:56: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:92:57: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:92:57: ( HOSTNAME ',' )+
                            int cnt123=0;
                            loop123:
                            do {
                                int alt123=2;
                                int LA123_0 = input.LA(1);

                                if ( (LA123_0==HOSTNAME) ) {
                                    int LA123_1 = input.LA(2);

                                    if ( (LA123_1==18) ) {
                                        alt123=1;
                                    }


                                }


                                switch (alt123) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:92:58: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2089); 

                            	    match(input,18,FOLLOW_18_in_delete_expr2090); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt123 >= 1 ) break loop123;
                                        EarlyExitException eee =
                                            new EarlyExitException(123, input);
                                        throw eee;
                                }
                                cnt123++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2094); 

                            }


                            }
                            break;

                    }


                    match(input,42,FOLLOW_42_in_delete_expr2097); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_delete_expr2098); 

                    //'DELETE' PROTOCOLS 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME
                    result = QueryResults.DELETE_PROTCOL_GSPRINGS_AST_ON_HOST_OF_VARNAME; //Case 53
                    }
                    break;
                case 23 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:93:11: 'DELETE' 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME
                    {
                    match(input,24,FOLLOW_24_in_delete_expr2111); 

                    match(input,31,FOLLOW_31_in_delete_expr2112); 

                    match(input,17,FOLLOW_17_in_delete_expr2113); 

                    match(input,43,FOLLOW_43_in_delete_expr2114); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:93:36: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt126=2;
                    int LA126_0 = input.LA(1);

                    if ( (LA126_0==HOSTNAME) ) {
                        int LA126_1 = input.LA(2);

                        if ( (LA126_1==18) ) {
                            alt126=2;
                        }
                        else if ( (LA126_1==42) ) {
                            alt126=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 126, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 126, 0, input);

                        throw nvae;

                    }
                    switch (alt126) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:93:37: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2116); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:93:46: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:93:46: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:93:47: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:93:47: ( HOSTNAME ',' )+
                            int cnt125=0;
                            loop125:
                            do {
                                int alt125=2;
                                int LA125_0 = input.LA(1);

                                if ( (LA125_0==HOSTNAME) ) {
                                    int LA125_1 = input.LA(2);

                                    if ( (LA125_1==18) ) {
                                        alt125=1;
                                    }


                                }


                                switch (alt125) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:93:48: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2120); 

                            	    match(input,18,FOLLOW_18_in_delete_expr2121); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt125 >= 1 ) break loop125;
                                        EarlyExitException eee =
                                            new EarlyExitException(125, input);
                                        throw eee;
                                }
                                cnt125++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2125); 

                            }


                            }
                            break;

                    }


                    match(input,42,FOLLOW_42_in_delete_expr2128); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_delete_expr2129); 

                    //'DELETE' 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME
                    result = QueryResults.DELETE_GSPRINGS_AST_ON_HOST_OF_VARNAME;//Case 54
                    }
                    break;
                case 24 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:94:4: 'DELETE' PROTOCOLS 'GSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,24,FOLLOW_24_in_delete_expr2135); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_delete_expr2136); 

                    match(input,31,FOLLOW_31_in_delete_expr2138); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:94:32: ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) )
                    int alt128=2;
                    int LA128_0 = input.LA(1);

                    if ( (LA128_0==DIGIT||LA128_0==NUMBER) ) {
                        int LA128_1 = input.LA(2);

                        if ( (LA128_1==18) ) {
                            alt128=2;
                        }
                        else if ( (LA128_1==43) ) {
                            alt128=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 128, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 128, 0, input);

                        throw nvae;

                    }
                    switch (alt128) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:94:33: ( DIGIT | NUMBER )
                            {
                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:94:48: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:94:48: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:94:49: ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:94:49: ( ( DIGIT | NUMBER ) ',' )+
                            int cnt127=0;
                            loop127:
                            do {
                                int alt127=2;
                                int LA127_0 = input.LA(1);

                                if ( (LA127_0==DIGIT||LA127_0==NUMBER) ) {
                                    int LA127_1 = input.LA(2);

                                    if ( (LA127_1==18) ) {
                                        alt127=1;
                                    }


                                }


                                switch (alt127) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:94:50: ( DIGIT | NUMBER ) ','
                            	    {
                            	    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                            	        input.consume();
                            	        state.errorRecovery=false;
                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        throw mse;
                            	    }


                            	    match(input,18,FOLLOW_18_in_delete_expr2153); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt127 >= 1 ) break loop127;
                                        EarlyExitException eee =
                                            new EarlyExitException(127, input);
                                        throw eee;
                                }
                                cnt127++;
                            } while (true);


                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }


                            }
                            break;

                    }


                    match(input,43,FOLLOW_43_in_delete_expr2164); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:94:90: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt130=2;
                    int LA130_0 = input.LA(1);

                    if ( (LA130_0==HOSTNAME) ) {
                        int LA130_1 = input.LA(2);

                        if ( (LA130_1==18) ) {
                            alt130=2;
                        }
                        else if ( (LA130_1==EOF) ) {
                            alt130=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 130, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 130, 0, input);

                        throw nvae;

                    }
                    switch (alt130) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:94:91: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2166); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:94:100: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:94:100: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:94:101: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:94:101: ( HOSTNAME ',' )+
                            int cnt129=0;
                            loop129:
                            do {
                                int alt129=2;
                                int LA129_0 = input.LA(1);

                                if ( (LA129_0==HOSTNAME) ) {
                                    int LA129_1 = input.LA(2);

                                    if ( (LA129_1==18) ) {
                                        alt129=1;
                                    }


                                }


                                switch (alt129) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:94:102: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2170); 

                            	    match(input,18,FOLLOW_18_in_delete_expr2171); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt129 >= 1 ) break loop129;
                                        EarlyExitException eee =
                                            new EarlyExitException(129, input);
                                        throw eee;
                                }
                                cnt129++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2175); 

                            }


                            }
                            break;

                    }

                    //'DELETE' PROTOCOLS 'GSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.DELETE_PROTCOL_GSPRINGS_N_ON_HOST;//Case 55
                    }
                    break;
                case 25 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:96:11: 'DELETE' 'SPRINGS' '*' 'OF' VARNAME
                    {
                    match(input,24,FOLLOW_24_in_delete_expr2194); 

                    match(input,54,FOLLOW_54_in_delete_expr2195); 

                    match(input,17,FOLLOW_17_in_delete_expr2196); 

                    match(input,42,FOLLOW_42_in_delete_expr2197); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_delete_expr2198); 

                    //'DELETE' 'SPRINGS' '*' 'OF' VARNAME
                    result = QueryResults.DELETE_SPRINGS_AST_OF_VARNAME;//Case 56
                    }
                    break;
                case 26 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:97:11: 'DELETE' 'SPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,24,FOLLOW_24_in_delete_expr2211); 

                    match(input,54,FOLLOW_54_in_delete_expr2212); 

                    match(input,17,FOLLOW_17_in_delete_expr2213); 

                    match(input,43,FOLLOW_43_in_delete_expr2214); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:97:35: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt132=2;
                    int LA132_0 = input.LA(1);

                    if ( (LA132_0==HOSTNAME) ) {
                        int LA132_1 = input.LA(2);

                        if ( (LA132_1==18) ) {
                            alt132=2;
                        }
                        else if ( (LA132_1==EOF) ) {
                            alt132=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 132, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 132, 0, input);

                        throw nvae;

                    }
                    switch (alt132) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:97:36: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2216); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:97:45: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:97:45: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:97:46: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:97:46: ( HOSTNAME ',' )+
                            int cnt131=0;
                            loop131:
                            do {
                                int alt131=2;
                                int LA131_0 = input.LA(1);

                                if ( (LA131_0==HOSTNAME) ) {
                                    int LA131_1 = input.LA(2);

                                    if ( (LA131_1==18) ) {
                                        alt131=1;
                                    }


                                }


                                switch (alt131) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:97:47: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2220); 

                            	    match(input,18,FOLLOW_18_in_delete_expr2221); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt131 >= 1 ) break loop131;
                                        EarlyExitException eee =
                                            new EarlyExitException(131, input);
                                        throw eee;
                                }
                                cnt131++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2225); 

                            }


                            }
                            break;

                    }

                    //'DELETE' 'SPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.DELETE_SPRINGS_AST_ON_HOST; //Case 57
                    }
                    break;
                case 27 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:98:11: 'DELETE' PROTOCOLS 'SPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,24,FOLLOW_24_in_delete_expr2240); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_delete_expr2241); 

                    match(input,54,FOLLOW_54_in_delete_expr2243); 

                    match(input,17,FOLLOW_17_in_delete_expr2244); 

                    match(input,43,FOLLOW_43_in_delete_expr2245); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:98:45: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt134=2;
                    int LA134_0 = input.LA(1);

                    if ( (LA134_0==HOSTNAME) ) {
                        int LA134_1 = input.LA(2);

                        if ( (LA134_1==18) ) {
                            alt134=2;
                        }
                        else if ( (LA134_1==EOF) ) {
                            alt134=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 134, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 134, 0, input);

                        throw nvae;

                    }
                    switch (alt134) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:98:46: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2247); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:98:55: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:98:55: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:98:56: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:98:56: ( HOSTNAME ',' )+
                            int cnt133=0;
                            loop133:
                            do {
                                int alt133=2;
                                int LA133_0 = input.LA(1);

                                if ( (LA133_0==HOSTNAME) ) {
                                    int LA133_1 = input.LA(2);

                                    if ( (LA133_1==18) ) {
                                        alt133=1;
                                    }


                                }


                                switch (alt133) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:98:57: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2251); 

                            	    match(input,18,FOLLOW_18_in_delete_expr2252); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt133 >= 1 ) break loop133;
                                        EarlyExitException eee =
                                            new EarlyExitException(133, input);
                                        throw eee;
                                }
                                cnt133++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2256); 

                            }


                            }
                            break;

                    }

                    //'DELETE' PROTOCOLS 'SPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.DELETE_PROTOCOL_SPRINGS_AST_ON_HOST;//case 58
                    }
                    break;
                case 28 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:100:4: 'DELETE' 'SINKHOLES' '*' 'OF' VARNAME
                    {
                    match(input,24,FOLLOW_24_in_delete_expr2271); 

                    match(input,53,FOLLOW_53_in_delete_expr2272); 

                    match(input,17,FOLLOW_17_in_delete_expr2273); 

                    match(input,42,FOLLOW_42_in_delete_expr2274); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_delete_expr2275); 

                    //'DELETE' 'SINKHOLES' '*' 'OF' VARNAME
                    result = QueryResults.DELETE_SINKHOLES_AST_ON_HOST;//Case 59
                    }
                    break;
                case 29 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:101:11: 'DELETE' 'SINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,24,FOLLOW_24_in_delete_expr2288); 

                    match(input,53,FOLLOW_53_in_delete_expr2289); 

                    match(input,17,FOLLOW_17_in_delete_expr2290); 

                    match(input,43,FOLLOW_43_in_delete_expr2291); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:101:37: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt136=2;
                    int LA136_0 = input.LA(1);

                    if ( (LA136_0==HOSTNAME) ) {
                        int LA136_1 = input.LA(2);

                        if ( (LA136_1==18) ) {
                            alt136=2;
                        }
                        else if ( (LA136_1==EOF) ) {
                            alt136=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 136, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 136, 0, input);

                        throw nvae;

                    }
                    switch (alt136) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:101:38: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2293); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:101:47: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:101:47: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:101:48: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:101:48: ( HOSTNAME ',' )+
                            int cnt135=0;
                            loop135:
                            do {
                                int alt135=2;
                                int LA135_0 = input.LA(1);

                                if ( (LA135_0==HOSTNAME) ) {
                                    int LA135_1 = input.LA(2);

                                    if ( (LA135_1==18) ) {
                                        alt135=1;
                                    }


                                }


                                switch (alt135) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:101:49: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2297); 

                            	    match(input,18,FOLLOW_18_in_delete_expr2298); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt135 >= 1 ) break loop135;
                                        EarlyExitException eee =
                                            new EarlyExitException(135, input);
                                        throw eee;
                                }
                                cnt135++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2302); 

                            }


                            }
                            break;

                    }

                    //'DELETE' 'SINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.DELETE_SINKHOLES_AST_ON_HOST;//Case 60
                    }
                    break;
                case 30 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:102:11: 'DELETE' PROTOCOLS 'SINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,24,FOLLOW_24_in_delete_expr2317); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_delete_expr2318); 

                    match(input,53,FOLLOW_53_in_delete_expr2320); 

                    match(input,17,FOLLOW_17_in_delete_expr2321); 

                    match(input,43,FOLLOW_43_in_delete_expr2322); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:102:47: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt138=2;
                    int LA138_0 = input.LA(1);

                    if ( (LA138_0==HOSTNAME) ) {
                        int LA138_1 = input.LA(2);

                        if ( (LA138_1==18) ) {
                            alt138=2;
                        }
                        else if ( (LA138_1==EOF) ) {
                            alt138=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 138, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 138, 0, input);

                        throw nvae;

                    }
                    switch (alt138) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:102:48: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2324); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:102:57: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:102:57: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:102:58: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:102:58: ( HOSTNAME ',' )+
                            int cnt137=0;
                            loop137:
                            do {
                                int alt137=2;
                                int LA137_0 = input.LA(1);

                                if ( (LA137_0==HOSTNAME) ) {
                                    int LA137_1 = input.LA(2);

                                    if ( (LA137_1==18) ) {
                                        alt137=1;
                                    }


                                }


                                switch (alt137) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:102:59: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2328); 

                            	    match(input,18,FOLLOW_18_in_delete_expr2329); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt137 >= 1 ) break loop137;
                                        EarlyExitException eee =
                                            new EarlyExitException(137, input);
                                        throw eee;
                                }
                                cnt137++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2333); 

                            }


                            }
                            break;

                    }
                    
                    //'DELETE' PROTOCOLS 'SINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.DELETE_PROT_SINKHOLES_AST_ON_HOST; //Case 61
                    }
                    break;
                case 31 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:104:4: 'DELETE' 'PSINKHOLES' '*' 'OF' VARNAME
                    {
                    match(input,24,FOLLOW_24_in_delete_expr2345); 

                    match(input,45,FOLLOW_45_in_delete_expr2346); 

                    match(input,17,FOLLOW_17_in_delete_expr2347); 

                    match(input,42,FOLLOW_42_in_delete_expr2348); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_delete_expr2349); 

                    //'DELETE' 'PSINKHOLES' '*' 'OF' VARNAME
                    result = QueryResults.DELETE_PSINKHOLES_AST_OF_VARNAME;//Case 62
                    }
                    break;
                case 32 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:105:11: 'DELETE' 'PSINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,24,FOLLOW_24_in_delete_expr2362); 

                    match(input,45,FOLLOW_45_in_delete_expr2363); 

                    match(input,17,FOLLOW_17_in_delete_expr2364); 

                    match(input,43,FOLLOW_43_in_delete_expr2365); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:105:38: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt140=2;
                    int LA140_0 = input.LA(1);

                    if ( (LA140_0==HOSTNAME) ) {
                        int LA140_1 = input.LA(2);

                        if ( (LA140_1==18) ) {
                            alt140=2;
                        }
                        else if ( (LA140_1==EOF) ) {
                            alt140=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 140, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 140, 0, input);

                        throw nvae;

                    }
                    switch (alt140) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:105:39: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2367); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:105:48: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:105:48: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:105:49: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:105:49: ( HOSTNAME ',' )+
                            int cnt139=0;
                            loop139:
                            do {
                                int alt139=2;
                                int LA139_0 = input.LA(1);

                                if ( (LA139_0==HOSTNAME) ) {
                                    int LA139_1 = input.LA(2);

                                    if ( (LA139_1==18) ) {
                                        alt139=1;
                                    }


                                }


                                switch (alt139) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:105:50: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2371); 

                            	    match(input,18,FOLLOW_18_in_delete_expr2372); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt139 >= 1 ) break loop139;
                                        EarlyExitException eee =
                                            new EarlyExitException(139, input);
                                        throw eee;
                                }
                                cnt139++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2376); 

                            }


                            }
                            break;

                    }

                    //'DELETE' 'PSINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.DELETE_PSINKHOLES_AST_ON_HOST; //Case 63
                    }
                    break;
                case 33 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:106:11: 'DELETE' PROTOCOLS 'PSINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,24,FOLLOW_24_in_delete_expr2391); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_delete_expr2392); 

                    match(input,45,FOLLOW_45_in_delete_expr2394); 

                    match(input,17,FOLLOW_17_in_delete_expr2395); 

                    match(input,43,FOLLOW_43_in_delete_expr2396); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:106:48: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt142=2;
                    int LA142_0 = input.LA(1);

                    if ( (LA142_0==HOSTNAME) ) {
                        int LA142_1 = input.LA(2);

                        if ( (LA142_1==18) ) {
                            alt142=2;
                        }
                        else if ( (LA142_1==EOF) ) {
                            alt142=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 142, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 142, 0, input);

                        throw nvae;

                    }
                    switch (alt142) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:106:49: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2398); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:106:58: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:106:58: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:106:59: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:106:59: ( HOSTNAME ',' )+
                            int cnt141=0;
                            loop141:
                            do {
                                int alt141=2;
                                int LA141_0 = input.LA(1);

                                if ( (LA141_0==HOSTNAME) ) {
                                    int LA141_1 = input.LA(2);

                                    if ( (LA141_1==18) ) {
                                        alt141=1;
                                    }


                                }


                                switch (alt141) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:106:60: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2402); 

                            	    match(input,18,FOLLOW_18_in_delete_expr2403); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt141 >= 1 ) break loop141;
                                        EarlyExitException eee =
                                            new EarlyExitException(141, input);
                                        throw eee;
                                }
                                cnt141++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2407); 

                            }


                            }
                            break;

                    }

                    //'DELETE' PROTOCOLS 'PSINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.DELETE_PROTOCOL_PSINKHOLES_AST_ON_HOST; //Case 64
                    }
                    break;
                case 34 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:107:4: 'DELETE' PROTOCOLS 'PSINKHOLES' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,24,FOLLOW_24_in_delete_expr2415); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_delete_expr2416); 

                    match(input,45,FOLLOW_45_in_delete_expr2418); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:107:34: ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) )
                    int alt144=2;
                    int LA144_0 = input.LA(1);

                    if ( (LA144_0==DIGIT||LA144_0==NUMBER) ) {
                        int LA144_1 = input.LA(2);

                        if ( (LA144_1==18) ) {
                            alt144=2;
                        }
                        else if ( (LA144_1==43) ) {
                            alt144=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 144, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 144, 0, input);

                        throw nvae;

                    }
                    switch (alt144) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:107:35: ( DIGIT | NUMBER )
                            {
                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:107:50: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:107:50: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:107:51: ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:107:51: ( ( DIGIT | NUMBER ) ',' )+
                            int cnt143=0;
                            loop143:
                            do {
                                int alt143=2;
                                int LA143_0 = input.LA(1);

                                if ( (LA143_0==DIGIT||LA143_0==NUMBER) ) {
                                    int LA143_1 = input.LA(2);

                                    if ( (LA143_1==18) ) {
                                        alt143=1;
                                    }


                                }


                                switch (alt143) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:107:52: ( DIGIT | NUMBER ) ','
                            	    {
                            	    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                            	        input.consume();
                            	        state.errorRecovery=false;
                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        throw mse;
                            	    }


                            	    match(input,18,FOLLOW_18_in_delete_expr2433); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt143 >= 1 ) break loop143;
                                        EarlyExitException eee =
                                            new EarlyExitException(143, input);
                                        throw eee;
                                }
                                cnt143++;
                            } while (true);


                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }


                            }
                            break;

                    }


                    match(input,43,FOLLOW_43_in_delete_expr2444); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:107:92: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt146=2;
                    int LA146_0 = input.LA(1);

                    if ( (LA146_0==HOSTNAME) ) {
                        int LA146_1 = input.LA(2);

                        if ( (LA146_1==18) ) {
                            alt146=2;
                        }
                        else if ( (LA146_1==EOF) ) {
                            alt146=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 146, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 146, 0, input);

                        throw nvae;

                    }
                    switch (alt146) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:107:93: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2446); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:107:102: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:107:102: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:107:103: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:107:103: ( HOSTNAME ',' )+
                            int cnt145=0;
                            loop145:
                            do {
                                int alt145=2;
                                int LA145_0 = input.LA(1);

                                if ( (LA145_0==HOSTNAME) ) {
                                    int LA145_1 = input.LA(2);

                                    if ( (LA145_1==18) ) {
                                        alt145=1;
                                    }


                                }


                                switch (alt145) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:107:104: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2450); 

                            	    match(input,18,FOLLOW_18_in_delete_expr2451); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt145 >= 1 ) break loop145;
                                        EarlyExitException eee =
                                            new EarlyExitException(145, input);
                                        throw eee;
                                }
                                cnt145++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2455); 

                            }


                            }
                            break;

                    }

                    //'DELETE' PROTOCOLS 'PSINKHOLES' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.DELETE_PROTOCOL_PSINKHOLES_N_ON_HOST; //case 65
                    }
                    break;
                case 35 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:109:4: 'DELETE' 'FILTERS' '*'
                    {
                    match(input,24,FOLLOW_24_in_delete_expr2467); 

                    match(input,28,FOLLOW_28_in_delete_expr2468); 

                    match(input,17,FOLLOW_17_in_delete_expr2469); 

                    //'DELETE' 'FILTERS' '*'
                    result = QueryResults.DELETE_FILTERS_AST; //Case 66
                    }
                    break;
                case 36 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:110:4: 'DELETE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME )
                    {
                    match(input,24,FOLLOW_24_in_delete_expr2475); 

                    match(input,28,FOLLOW_28_in_delete_expr2476); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:110:21: ( VARNAME | ( VARNAME ',' )+ VARNAME )
                    int alt148=2;
                    int LA148_0 = input.LA(1);

                    if ( (LA148_0==VARNAME) ) {
                        int LA148_1 = input.LA(2);

                        if ( (LA148_1==18) ) {
                            alt148=2;
                        }
                        else if ( (LA148_1==EOF) ) {
                            alt148=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 148, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 148, 0, input);

                        throw nvae;

                    }
                    switch (alt148) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:110:22: VARNAME
                            {
                            match(input,VARNAME,FOLLOW_VARNAME_in_delete_expr2478); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:110:30: ( VARNAME ',' )+ VARNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:110:30: ( VARNAME ',' )+
                            int cnt147=0;
                            loop147:
                            do {
                                int alt147=2;
                                int LA147_0 = input.LA(1);

                                if ( (LA147_0==VARNAME) ) {
                                    int LA147_1 = input.LA(2);

                                    if ( (LA147_1==18) ) {
                                        alt147=1;
                                    }


                                }


                                switch (alt147) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:110:31: VARNAME ','
                            	    {
                            	    match(input,VARNAME,FOLLOW_VARNAME_in_delete_expr2481); 

                            	    match(input,18,FOLLOW_18_in_delete_expr2482); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt147 >= 1 ) break loop147;
                                        EarlyExitException eee =
                                            new EarlyExitException(147, input);
                                        throw eee;
                                }
                                cnt147++;
                            } while (true);


                            match(input,VARNAME,FOLLOW_VARNAME_in_delete_expr2485); 

                            }
                            break;

                    }

                    //'DELETE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME )
                    result = QueryResults.DELETE_FILTERS_VARNAME;//Case 67
                    }
                    break;
                case 37 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:111:4: 'DELETE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,24,FOLLOW_24_in_delete_expr2492); 

                    match(input,28,FOLLOW_28_in_delete_expr2493); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:111:21: ( VARNAME | ( VARNAME ',' )+ VARNAME )
                    int alt150=2;
                    int LA150_0 = input.LA(1);

                    if ( (LA150_0==VARNAME) ) {
                        int LA150_1 = input.LA(2);

                        if ( (LA150_1==18) ) {
                            alt150=2;
                        }
                        else if ( (LA150_1==43) ) {
                            alt150=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 150, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 150, 0, input);

                        throw nvae;

                    }
                    switch (alt150) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:111:22: VARNAME
                            {
                            match(input,VARNAME,FOLLOW_VARNAME_in_delete_expr2495); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:111:30: ( VARNAME ',' )+ VARNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:111:30: ( VARNAME ',' )+
                            int cnt149=0;
                            loop149:
                            do {
                                int alt149=2;
                                int LA149_0 = input.LA(1);

                                if ( (LA149_0==VARNAME) ) {
                                    int LA149_1 = input.LA(2);

                                    if ( (LA149_1==18) ) {
                                        alt149=1;
                                    }


                                }


                                switch (alt149) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:111:31: VARNAME ','
                            	    {
                            	    match(input,VARNAME,FOLLOW_VARNAME_in_delete_expr2498); 

                            	    match(input,18,FOLLOW_18_in_delete_expr2499); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt149 >= 1 ) break loop149;
                                        EarlyExitException eee =
                                            new EarlyExitException(149, input);
                                        throw eee;
                                }
                                cnt149++;
                            } while (true);


                            match(input,VARNAME,FOLLOW_VARNAME_in_delete_expr2502); 

                            }
                            break;

                    }


                    match(input,43,FOLLOW_43_in_delete_expr2504); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:111:55: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt152=2;
                    int LA152_0 = input.LA(1);

                    if ( (LA152_0==HOSTNAME) ) {
                        int LA152_1 = input.LA(2);

                        if ( (LA152_1==18) ) {
                            alt152=2;
                        }
                        else if ( (LA152_1==EOF) ) {
                            alt152=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 152, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 152, 0, input);

                        throw nvae;

                    }
                    switch (alt152) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:111:56: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2506); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:111:65: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:111:65: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:111:66: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:111:66: ( HOSTNAME ',' )+
                            int cnt151=0;
                            loop151:
                            do {
                                int alt151=2;
                                int LA151_0 = input.LA(1);

                                if ( (LA151_0==HOSTNAME) ) {
                                    int LA151_1 = input.LA(2);

                                    if ( (LA151_1==18) ) {
                                        alt151=1;
                                    }


                                }


                                switch (alt151) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:111:67: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2510); 

                            	    match(input,18,FOLLOW_18_in_delete_expr2511); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt151 >= 1 ) break loop151;
                                        EarlyExitException eee =
                                            new EarlyExitException(151, input);
                                        throw eee;
                                }
                                cnt151++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2515); 

                            }


                            }
                            break;

                    }

                    //'DELETE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.DELETE_FILTERS_VARNAME_ON_HOST; //case 68
                    }
                    break;
                case 38 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:112:4: 'DELETE' 'FILTERS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,24,FOLLOW_24_in_delete_expr2523); 

                    match(input,28,FOLLOW_28_in_delete_expr2524); 

                    match(input,17,FOLLOW_17_in_delete_expr2525); 

                    match(input,43,FOLLOW_43_in_delete_expr2526); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:112:28: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt154=2;
                    int LA154_0 = input.LA(1);

                    if ( (LA154_0==HOSTNAME) ) {
                        int LA154_1 = input.LA(2);

                        if ( (LA154_1==18) ) {
                            alt154=2;
                        }
                        else if ( (LA154_1==EOF) ) {
                            alt154=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 154, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 154, 0, input);

                        throw nvae;

                    }
                    switch (alt154) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:112:29: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2528); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:112:38: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:112:38: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:112:39: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:112:39: ( HOSTNAME ',' )+
                            int cnt153=0;
                            loop153:
                            do {
                                int alt153=2;
                                int LA153_0 = input.LA(1);

                                if ( (LA153_0==HOSTNAME) ) {
                                    int LA153_1 = input.LA(2);

                                    if ( (LA153_1==18) ) {
                                        alt153=1;
                                    }


                                }


                                switch (alt153) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:112:40: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2532); 

                            	    match(input,18,FOLLOW_18_in_delete_expr2533); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt153 >= 1 ) break loop153;
                                        EarlyExitException eee =
                                            new EarlyExitException(153, input);
                                        throw eee;
                                }
                                cnt153++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2537); 

                            }


                            }
                            break;

                    }

                    //'DELETE' 'FILTERS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.DELETE_FILTERS_AST_ON_HOST; //Case 69
                    }
                    break;
                case 39 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:113:6: 'DELETE' 'FILTERS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME
                    {
                    match(input,24,FOLLOW_24_in_delete_expr2547); 

                    match(input,28,FOLLOW_28_in_delete_expr2548); 

                    match(input,17,FOLLOW_17_in_delete_expr2549); 

                    match(input,43,FOLLOW_43_in_delete_expr2550); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:113:30: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt156=2;
                    int LA156_0 = input.LA(1);

                    if ( (LA156_0==HOSTNAME) ) {
                        int LA156_1 = input.LA(2);

                        if ( (LA156_1==18) ) {
                            alt156=2;
                        }
                        else if ( (LA156_1==42) ) {
                            alt156=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 156, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 156, 0, input);

                        throw nvae;

                    }
                    switch (alt156) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:113:31: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2552); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:113:40: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:113:40: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:113:41: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:113:41: ( HOSTNAME ',' )+
                            int cnt155=0;
                            loop155:
                            do {
                                int alt155=2;
                                int LA155_0 = input.LA(1);

                                if ( (LA155_0==HOSTNAME) ) {
                                    int LA155_1 = input.LA(2);

                                    if ( (LA155_1==18) ) {
                                        alt155=1;
                                    }


                                }


                                switch (alt155) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:113:42: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2556); 

                            	    match(input,18,FOLLOW_18_in_delete_expr2557); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt155 >= 1 ) break loop155;
                                        EarlyExitException eee =
                                            new EarlyExitException(155, input);
                                        throw eee;
                                }
                                cnt155++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_delete_expr2561); 

                            }


                            }
                            break;

                    }


                    match(input,42,FOLLOW_42_in_delete_expr2564); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_delete_expr2565); 

                    //'DELETE' 'FILTERS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME
                    result = QueryResults.DELETE_FILTERS_AST_ON_HOST_OF_VARNAME; //Case 70
                    }
                    break;
                case 40 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:114:6: 'DELETE' 'FILTERS' '*' 'OF' VARNAME
                    {
                    match(input,24,FOLLOW_24_in_delete_expr2573); 

                    match(input,28,FOLLOW_28_in_delete_expr2574); 

                    match(input,17,FOLLOW_17_in_delete_expr2575); 

                    match(input,42,FOLLOW_42_in_delete_expr2576); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_delete_expr2577); 

                    //'DELETE' 'FILTERS' '*' 'OF' VARNAME
                    result = QueryResults.DELETE_FILTERS_AST_OF_VARNAME; //Case 71
                    }
                    break;
                case 41 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:115:6: 'DELETE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'OF' VARNAME
                    {
                    match(input,24,FOLLOW_24_in_delete_expr2585); 

                    match(input,28,FOLLOW_28_in_delete_expr2586); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:115:23: ( VARNAME | ( VARNAME ',' )+ VARNAME )
                    int alt158=2;
                    int LA158_0 = input.LA(1);

                    if ( (LA158_0==VARNAME) ) {
                        int LA158_1 = input.LA(2);

                        if ( (LA158_1==18) ) {
                            alt158=2;
                        }
                        else if ( (LA158_1==42) ) {
                            alt158=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 158, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 158, 0, input);

                        throw nvae;

                    }
                    switch (alt158) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:115:24: VARNAME
                            {
                            match(input,VARNAME,FOLLOW_VARNAME_in_delete_expr2588); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:115:32: ( VARNAME ',' )+ VARNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:115:32: ( VARNAME ',' )+
                            int cnt157=0;
                            loop157:
                            do {
                                int alt157=2;
                                int LA157_0 = input.LA(1);

                                if ( (LA157_0==VARNAME) ) {
                                    int LA157_1 = input.LA(2);

                                    if ( (LA157_1==18) ) {
                                        alt157=1;
                                    }


                                }


                                switch (alt157) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:115:33: VARNAME ','
                            	    {
                            	    match(input,VARNAME,FOLLOW_VARNAME_in_delete_expr2591); 

                            	    match(input,18,FOLLOW_18_in_delete_expr2592); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt157 >= 1 ) break loop157;
                                        EarlyExitException eee =
                                            new EarlyExitException(157, input);
                                        throw eee;
                                }
                                cnt157++;
                            } while (true);


                            match(input,VARNAME,FOLLOW_VARNAME_in_delete_expr2595); 

                            }
                            break;

                    }


                    match(input,42,FOLLOW_42_in_delete_expr2597); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_delete_expr2598); 

                    //'DELETE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'OF' VARNAME
                    result = QueryResults.DELETE_FILTERS_VARNAME_OF_VARNAME;//Case 72
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "delete_expr"



    // $ANTLR start "select_expr"
    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:117:1: select_expr : ( 'SELECT' '*' PROTOCOLS 'SPRINGS' | 'SELECT' ( DIGIT | NUMBER ) PROTOCOLS 'SPRINGS' | 'SELECT' '*' PROTOCOLS 'SINKHOLES' | 'SELECT' ( DIGIT | NUMBER ) PROTOCOLS 'SINKHOLES' | 'SELECT' 'DATARATE' 'FROM' 'SPRINGS' | 'SELECT' 'DATARATE' 'FROM' 'SPRINGS' '*' 'OF' VARNAME | 'SELECT' 'DATARATE' 'FROM' 'SPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' 'SPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'SPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'SPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' 'SINKHOLES' | 'SELECT' 'DATARATE' 'FROM' 'SINKHOLES' '*' 'OF' VARNAME | 'SELECT' 'DATARATE' 'FROM' 'SINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' 'SINKHOLES' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'SINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'SINKHOLES' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SPRINGS' | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SPRINGS' '*' 'OF' VARNAME | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'SPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'SPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SINKHOLES' | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SINKHOLES' '*' 'OF' VARNAME | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SINKHOLES' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'SINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'SINKHOLES' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' '*' PROTOCOLS 'PSPRINGS' | 'SELECT' ( DIGIT | NUMBER ) PROTOCOLS 'PSPRINGS' | 'SELECT' '*' PROTOCOLS 'PSINKHOLES' | 'SELECT' ( DIGIT | NUMBER ) PROTOCOLS 'PSINKHOLES' | 'SELECT' 'DATARATE' 'FROM' 'PSPRINGS' | 'SELECT' 'DATARATE' 'FROM' 'PSPRINGS' '*' 'OF' VARNAME | 'SELECT' 'DATARATE' 'FROM' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' 'PSPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' 'PSINKHOLES' | 'SELECT' 'DATARATE' 'FROM' 'PSINKHOLES' '*' 'OF' VARNAME | 'SELECT' 'DATARATE' 'FROM' 'PSINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' 'PSINKHOLES' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'PSINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'PSINKHOLES' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSPRINGS' | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSPRINGS' '*' 'OF' VARNAME | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSINKHOLES' | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSINKHOLES' '*' 'OF' VARNAME | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSINKHOLES' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'PSINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'PSINKHOLES' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' '*' PROTOCOLS 'ESPRINGS' | 'SELECT' ( DIGIT | NUMBER ) PROTOCOLS 'ESPRINGS' | 'SELECT' 'DATARATE' 'FROM' 'ESPRINGS' | 'SELECT' 'DATARATE' 'FROM' 'ESPRINGS' '*' 'OF' VARNAME | 'SELECT' 'DATARATE' 'FROM' 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' 'ESPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'ESPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'ESPRINGS' | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'ESPRINGS' '*' 'OF' VARNAME | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'ESPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'ESPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' '*' PROTOCOLS 'GSPRINGS' | 'SELECT' ( DIGIT | NUMBER ) PROTOCOLS 'GSPRINGS' | 'SELECT' 'DATARATE' 'FROM' 'GSPRINGS' | 'SELECT' 'DATARATE' 'FROM' 'GSPRINGS' '*' 'OF' VARNAME | 'SELECT' 'DATARATE' 'FROM' 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' 'GSPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'GSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'GSPRINGS' | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'GSPRINGS' '*' 'OF' VARNAME | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'GSPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'GSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' '*' PROTOCOLS 'ASPRINGS' | 'SELECT' ( DIGIT | NUMBER ) PROTOCOLS 'ASPRINGS' | 'SELECT' 'DATARATE' 'FROM' 'ASPRINGS' | 'SELECT' 'DATARATE' 'FROM' 'ASPRINGS' '*' 'OF' VARNAME | 'SELECT' 'DATARATE' 'FROM' 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' 'ASPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'ASPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'ASPRINGS' | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'ASPRINGS' '*' 'OF' VARNAME | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'ASPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'ASPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) );
    public final QueryResults select_expr() throws RecognitionException {
    	QueryResults result = null;
        try {
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:118:2: ( 'SELECT' '*' PROTOCOLS 'SPRINGS' | 'SELECT' ( DIGIT | NUMBER ) PROTOCOLS 'SPRINGS' | 'SELECT' '*' PROTOCOLS 'SINKHOLES' | 'SELECT' ( DIGIT | NUMBER ) PROTOCOLS 'SINKHOLES' | 'SELECT' 'DATARATE' 'FROM' 'SPRINGS' | 'SELECT' 'DATARATE' 'FROM' 'SPRINGS' '*' 'OF' VARNAME | 'SELECT' 'DATARATE' 'FROM' 'SPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' 'SPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'SPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'SPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' 'SINKHOLES' | 'SELECT' 'DATARATE' 'FROM' 'SINKHOLES' '*' 'OF' VARNAME | 'SELECT' 'DATARATE' 'FROM' 'SINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' 'SINKHOLES' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'SINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'SINKHOLES' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SPRINGS' | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SPRINGS' '*' 'OF' VARNAME | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'SPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'SPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SINKHOLES' | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SINKHOLES' '*' 'OF' VARNAME | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SINKHOLES' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'SINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'SINKHOLES' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' '*' PROTOCOLS 'PSPRINGS' | 'SELECT' ( DIGIT | NUMBER ) PROTOCOLS 'PSPRINGS' | 'SELECT' '*' PROTOCOLS 'PSINKHOLES' | 'SELECT' ( DIGIT | NUMBER ) PROTOCOLS 'PSINKHOLES' | 'SELECT' 'DATARATE' 'FROM' 'PSPRINGS' | 'SELECT' 'DATARATE' 'FROM' 'PSPRINGS' '*' 'OF' VARNAME | 'SELECT' 'DATARATE' 'FROM' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' 'PSPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' 'PSINKHOLES' | 'SELECT' 'DATARATE' 'FROM' 'PSINKHOLES' '*' 'OF' VARNAME | 'SELECT' 'DATARATE' 'FROM' 'PSINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' 'PSINKHOLES' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'PSINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'PSINKHOLES' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSPRINGS' | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSPRINGS' '*' 'OF' VARNAME | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSINKHOLES' | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSINKHOLES' '*' 'OF' VARNAME | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSINKHOLES' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'PSINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'PSINKHOLES' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' '*' PROTOCOLS 'ESPRINGS' | 'SELECT' ( DIGIT | NUMBER ) PROTOCOLS 'ESPRINGS' | 'SELECT' 'DATARATE' 'FROM' 'ESPRINGS' | 'SELECT' 'DATARATE' 'FROM' 'ESPRINGS' '*' 'OF' VARNAME | 'SELECT' 'DATARATE' 'FROM' 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' 'ESPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'ESPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'ESPRINGS' | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'ESPRINGS' '*' 'OF' VARNAME | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'ESPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'ESPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' '*' PROTOCOLS 'GSPRINGS' | 'SELECT' ( DIGIT | NUMBER ) PROTOCOLS 'GSPRINGS' | 'SELECT' 'DATARATE' 'FROM' 'GSPRINGS' | 'SELECT' 'DATARATE' 'FROM' 'GSPRINGS' '*' 'OF' VARNAME | 'SELECT' 'DATARATE' 'FROM' 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' 'GSPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'GSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'GSPRINGS' | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'GSPRINGS' '*' 'OF' VARNAME | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'GSPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'GSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' '*' PROTOCOLS 'ASPRINGS' | 'SELECT' ( DIGIT | NUMBER ) PROTOCOLS 'ASPRINGS' | 'SELECT' 'DATARATE' 'FROM' 'ASPRINGS' | 'SELECT' 'DATARATE' 'FROM' 'ASPRINGS' '*' 'OF' VARNAME | 'SELECT' 'DATARATE' 'FROM' 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' 'ASPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'ASPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'ASPRINGS' | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'ASPRINGS' '*' 'OF' VARNAME | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'ASPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'ASPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) )
            int alt300=98;
            alt300 = dfa300.predict(input);
            switch (alt300) {
                case 1 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:121:4: 'SELECT' '*' PROTOCOLS 'SPRINGS'
                    {
                    match(input,50,FOLLOW_50_in_select_expr2617); 

                    match(input,17,FOLLOW_17_in_select_expr2618); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr2620); 

                    match(input,54,FOLLOW_54_in_select_expr2622); 

                    //'SELECT' '*' PROTOCOLS 'SPRINGS'
                    result = QueryResults.SELECT_AST_PROT_SPRINGS; //Case 73
                    }
                    break;
                case 2 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:122:4: 'SELECT' ( DIGIT | NUMBER ) PROTOCOLS 'SPRINGS'
                    {
                    match(input,50,FOLLOW_50_in_select_expr2628); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr2635); 

                    match(input,54,FOLLOW_54_in_select_expr2637); 

                    //'SELECT' ( DIGIT | NUMBER ) PROTOCOLS 'SPRINGS'
                    result = QueryResults.SELECT_N_PROT_SPRINGS; //Case 74
                    }
                    break;
                case 3 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:123:4: 'SELECT' '*' PROTOCOLS 'SINKHOLES'
                    {
                    match(input,50,FOLLOW_50_in_select_expr2643); 

                    match(input,17,FOLLOW_17_in_select_expr2644); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr2646); 

                    match(input,53,FOLLOW_53_in_select_expr2648); 

                    //'SELECT' '*' PROTOCOLS 'SINKHOLES'
                    result = QueryResults.SELECT_AST_PROT_SINKHOLES;//Case 75
                    }
                    break;
                case 4 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:124:4: 'SELECT' ( DIGIT | NUMBER ) PROTOCOLS 'SINKHOLES'
                    {
                    match(input,50,FOLLOW_50_in_select_expr2654); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr2661); 

                    match(input,53,FOLLOW_53_in_select_expr2663); 

                    //'SELECT' ( DIGIT | NUMBER ) PROTOCOLS 'SINKHOLES'
                    result = QueryResults.SELECT_N_PROT_SINKHOLES; //Case 76
                    }
                    break;
                case 5 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:127:4: 'SELECT' 'DATARATE' 'FROM' 'SPRINGS'
                    {
                    match(input,50,FOLLOW_50_in_select_expr2678); 

                    match(input,23,FOLLOW_23_in_select_expr2679); 

                    match(input,30,FOLLOW_30_in_select_expr2680); 

                    match(input,54,FOLLOW_54_in_select_expr2681); 

                    //'SELECT' 'DATARATE' 'FROM' 'SPRINGS'
                    result = QueryResults.SELECT_DATARATE_FROM_SPRINGS; //Case 77
                    }
                    break;
                case 6 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:128:4: 'SELECT' 'DATARATE' 'FROM' 'SPRINGS' '*' 'OF' VARNAME
                    {
                    match(input,50,FOLLOW_50_in_select_expr2690); 

                    match(input,23,FOLLOW_23_in_select_expr2691); 

                    match(input,30,FOLLOW_30_in_select_expr2692); 

                    match(input,54,FOLLOW_54_in_select_expr2693); 

                    match(input,17,FOLLOW_17_in_select_expr2694); 

                    match(input,42,FOLLOW_42_in_select_expr2695); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_select_expr2696); 
                    
                    //'SELECT' 'DATARATE' 'FROM' 'SPRINGS' '*' 'OF' VARNAME
                    result = QueryResults.SELECT_DATARATE_FROM_SPRINGS_AST_OF_VARNAME; //Case 78
                    }
                    break;
                case 7 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:129:6: 'SELECT' 'DATARATE' 'FROM' 'SPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr2704); 

                    match(input,23,FOLLOW_23_in_select_expr2705); 

                    match(input,30,FOLLOW_30_in_select_expr2706); 

                    match(input,54,FOLLOW_54_in_select_expr2707); 

                    match(input,17,FOLLOW_17_in_select_expr2708); 

                    match(input,43,FOLLOW_43_in_select_expr2709); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:129:46: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt161=2;
                    int LA161_0 = input.LA(1);

                    if ( (LA161_0==HOSTNAME) ) {
                        int LA161_1 = input.LA(2);

                        if ( (LA161_1==18) ) {
                            alt161=2;
                        }
                        else if ( (LA161_1==EOF) ) {
                            alt161=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 161, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 161, 0, input);

                        throw nvae;

                    }
                    switch (alt161) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:129:47: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr2711); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:129:56: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:129:56: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:129:57: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:129:57: ( HOSTNAME ',' )+
                            int cnt160=0;
                            loop160:
                            do {
                                int alt160=2;
                                int LA160_0 = input.LA(1);

                                if ( (LA160_0==HOSTNAME) ) {
                                    int LA160_1 = input.LA(2);

                                    if ( (LA160_1==18) ) {
                                        alt160=1;
                                    }


                                }


                                switch (alt160) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:129:58: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr2715); 

                            	    match(input,18,FOLLOW_18_in_select_expr2716); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt160 >= 1 ) break loop160;
                                        EarlyExitException eee =
                                            new EarlyExitException(160, input);
                                        throw eee;
                                }
                                cnt160++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr2720); 

                            }


                            }
                            break;

                    }

                    //'SELECT' 'DATARATE' 'FROM' 'SPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.SELECT_DATARATE_FROM_SPRINGS_AST_ON_HOST;
                    }
                    break;
                case 8 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:130:4: 'SELECT' 'DATARATE' 'FROM' 'SPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr2728); 

                    match(input,23,FOLLOW_23_in_select_expr2729); 

                    match(input,30,FOLLOW_30_in_select_expr2730); 

                    match(input,54,FOLLOW_54_in_select_expr2731); 

                    match(input,17,FOLLOW_17_in_select_expr2732); 

                    match(input,42,FOLLOW_42_in_select_expr2733); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_select_expr2734); 

                    match(input,43,FOLLOW_43_in_select_expr2735); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:130:55: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt163=2;
                    int LA163_0 = input.LA(1);

                    if ( (LA163_0==HOSTNAME) ) {
                        int LA163_1 = input.LA(2);

                        if ( (LA163_1==18) ) {
                            alt163=2;
                        }
                        else if ( (LA163_1==EOF) ) {
                            alt163=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 163, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 163, 0, input);

                        throw nvae;

                    }
                    switch (alt163) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:130:56: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr2737); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:130:65: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:130:65: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:130:66: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:130:66: ( HOSTNAME ',' )+
                            int cnt162=0;
                            loop162:
                            do {
                                int alt162=2;
                                int LA162_0 = input.LA(1);

                                if ( (LA162_0==HOSTNAME) ) {
                                    int LA162_1 = input.LA(2);

                                    if ( (LA162_1==18) ) {
                                        alt162=1;
                                    }


                                }


                                switch (alt162) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:130:67: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr2741); 

                            	    match(input,18,FOLLOW_18_in_select_expr2742); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt162 >= 1 ) break loop162;
                                        EarlyExitException eee =
                                            new EarlyExitException(162, input);
                                        throw eee;
                                }
                                cnt162++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr2746); 

                            }


                            }
                            break;

                    }

                    //'SELECT' 'DATARATE' 'FROM' 'SPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.SELECT_DATARATE_FROM_SPRINGS_AST_OF_VARNAME_ON_HOST; //Case 80
                    }
                    break;
                case 9 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:131:4: 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'SPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr2754); 

                    match(input,23,FOLLOW_23_in_select_expr2755); 

                    match(input,30,FOLLOW_30_in_select_expr2756); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr2757); 

                    match(input,54,FOLLOW_54_in_select_expr2759); 

                    match(input,17,FOLLOW_17_in_select_expr2760); 

                    match(input,43,FOLLOW_43_in_select_expr2761); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:131:54: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt165=2;
                    int LA165_0 = input.LA(1);

                    if ( (LA165_0==HOSTNAME) ) {
                        int LA165_1 = input.LA(2);

                        if ( (LA165_1==18) ) {
                            alt165=2;
                        }
                        else if ( (LA165_1==EOF) ) {
                            alt165=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 165, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 165, 0, input);

                        throw nvae;

                    }
                    switch (alt165) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:131:55: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr2763); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:131:64: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:131:64: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:131:65: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:131:65: ( HOSTNAME ',' )+
                            int cnt164=0;
                            loop164:
                            do {
                                int alt164=2;
                                int LA164_0 = input.LA(1);

                                if ( (LA164_0==HOSTNAME) ) {
                                    int LA164_1 = input.LA(2);

                                    if ( (LA164_1==18) ) {
                                        alt164=1;
                                    }


                                }


                                switch (alt164) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:131:66: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr2767); 

                            	    match(input,18,FOLLOW_18_in_select_expr2768); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt164 >= 1 ) break loop164;
                                        EarlyExitException eee =
                                            new EarlyExitException(164, input);
                                        throw eee;
                                }
                                cnt164++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr2772); 

                            }


                            }
                            break;

                    }

                    //'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'SPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.SELECT_DATARATE_FROM_PROT_SPRINGS_AST_ON_HOST; //Case 81
                    }
                    break;
                case 10 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:132:4: 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'SPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr2780); 

                    match(input,23,FOLLOW_23_in_select_expr2781); 

                    match(input,30,FOLLOW_30_in_select_expr2782); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr2783); 

                    match(input,54,FOLLOW_54_in_select_expr2785); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:132:47: ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) )
                    int alt167=2;
                    int LA167_0 = input.LA(1);

                    if ( (LA167_0==DIGIT||LA167_0==NUMBER) ) {
                        int LA167_1 = input.LA(2);

                        if ( (LA167_1==18) ) {
                            alt167=2;
                        }
                        else if ( (LA167_1==43) ) {
                            alt167=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 167, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 167, 0, input);

                        throw nvae;

                    }
                    switch (alt167) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:132:48: ( DIGIT | NUMBER )
                            {
                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:132:63: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:132:63: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:132:64: ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:132:64: ( ( DIGIT | NUMBER ) ',' )+
                            int cnt166=0;
                            loop166:
                            do {
                                int alt166=2;
                                int LA166_0 = input.LA(1);

                                if ( (LA166_0==DIGIT||LA166_0==NUMBER) ) {
                                    int LA166_1 = input.LA(2);

                                    if ( (LA166_1==18) ) {
                                        alt166=1;
                                    }


                                }


                                switch (alt166) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:132:65: ( DIGIT | NUMBER ) ','
                            	    {
                            	    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                            	        input.consume();
                            	        state.errorRecovery=false;
                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        throw mse;
                            	    }


                            	    match(input,18,FOLLOW_18_in_select_expr2800); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt166 >= 1 ) break loop166;
                                        EarlyExitException eee =
                                            new EarlyExitException(166, input);
                                        throw eee;
                                }
                                cnt166++;
                            } while (true);


                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }


                            }
                            break;

                    }


                    match(input,43,FOLLOW_43_in_select_expr2811); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:132:105: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt169=2;
                    int LA169_0 = input.LA(1);

                    if ( (LA169_0==HOSTNAME) ) {
                        int LA169_1 = input.LA(2);

                        if ( (LA169_1==18) ) {
                            alt169=2;
                        }
                        else if ( (LA169_1==EOF) ) {
                            alt169=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 169, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 169, 0, input);

                        throw nvae;

                    }
                    switch (alt169) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:132:106: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr2813); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:132:115: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:132:115: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:132:116: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:132:116: ( HOSTNAME ',' )+
                            int cnt168=0;
                            loop168:
                            do {
                                int alt168=2;
                                int LA168_0 = input.LA(1);

                                if ( (LA168_0==HOSTNAME) ) {
                                    int LA168_1 = input.LA(2);

                                    if ( (LA168_1==18) ) {
                                        alt168=1;
                                    }


                                }


                                switch (alt168) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:132:117: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr2817); 

                            	    match(input,18,FOLLOW_18_in_select_expr2818); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt168 >= 1 ) break loop168;
                                        EarlyExitException eee =
                                            new EarlyExitException(168, input);
                                        throw eee;
                                }
                                cnt168++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr2822); 

                            }


                            }
                            break;

                    }

                    //'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'SPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.SELECT_DATARATE_FROM_PROT_SPRINGS_N_ON_HOST;//Case 82
                    }
                    break;
                case 11 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:135:4: 'SELECT' 'DATARATE' 'FROM' 'SINKHOLES'
                    {
                    match(input,50,FOLLOW_50_in_select_expr2842); 

                    match(input,23,FOLLOW_23_in_select_expr2843); 

                    match(input,30,FOLLOW_30_in_select_expr2844); 

                    match(input,53,FOLLOW_53_in_select_expr2845); 

                    //'SELECT' 'DATARATE' 'FROM' 'SINKHOLES'
                    result = QueryResults.SELECT_DATARATE_FROM_SINKHOLES;//Case 83
                    }
                    break;
                case 12 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:136:4: 'SELECT' 'DATARATE' 'FROM' 'SINKHOLES' '*' 'OF' VARNAME
                    {
                    match(input,50,FOLLOW_50_in_select_expr2854); 

                    match(input,23,FOLLOW_23_in_select_expr2855); 

                    match(input,30,FOLLOW_30_in_select_expr2856); 

                    match(input,53,FOLLOW_53_in_select_expr2857); 

                    match(input,17,FOLLOW_17_in_select_expr2858); 

                    match(input,42,FOLLOW_42_in_select_expr2859); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_select_expr2860); 

                    //'SELECT' 'DATARATE' 'FROM' 'SINKHOLES' '*' 'OF' VARNAME
                    result = QueryResults.SELECT_DATARATE_FROM_SINKHOLES_AST_OF_VARNAME; //Case 84
                    }
                    break;
                case 13 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:137:6: 'SELECT' 'DATARATE' 'FROM' 'SINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr2868); 

                    match(input,23,FOLLOW_23_in_select_expr2869); 

                    match(input,30,FOLLOW_30_in_select_expr2870); 

                    match(input,53,FOLLOW_53_in_select_expr2871); 

                    match(input,17,FOLLOW_17_in_select_expr2872); 

                    match(input,43,FOLLOW_43_in_select_expr2873); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:137:48: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt171=2;
                    int LA171_0 = input.LA(1);

                    if ( (LA171_0==HOSTNAME) ) {
                        int LA171_1 = input.LA(2);

                        if ( (LA171_1==18) ) {
                            alt171=2;
                        }
                        else if ( (LA171_1==EOF) ) {
                            alt171=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 171, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 171, 0, input);

                        throw nvae;

                    }
                    switch (alt171) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:137:49: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr2875); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:137:58: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:137:58: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:137:59: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:137:59: ( HOSTNAME ',' )+
                            int cnt170=0;
                            loop170:
                            do {
                                int alt170=2;
                                int LA170_0 = input.LA(1);

                                if ( (LA170_0==HOSTNAME) ) {
                                    int LA170_1 = input.LA(2);

                                    if ( (LA170_1==18) ) {
                                        alt170=1;
                                    }


                                }


                                switch (alt170) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:137:60: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr2879); 

                            	    match(input,18,FOLLOW_18_in_select_expr2880); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt170 >= 1 ) break loop170;
                                        EarlyExitException eee =
                                            new EarlyExitException(170, input);
                                        throw eee;
                                }
                                cnt170++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr2884); 

                            }


                            }
                            break;

                    }

                    //'SELECT' 'DATARATE' 'FROM' 'SINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.SELECT_DATARATE_FROM_SINKHOLES_AST_ON_HOST;//Case 85
                    }
                    break;
                case 14 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:138:4: 'SELECT' 'DATARATE' 'FROM' 'SINKHOLES' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr2892); 

                    match(input,23,FOLLOW_23_in_select_expr2893); 

                    match(input,30,FOLLOW_30_in_select_expr2894); 

                    match(input,53,FOLLOW_53_in_select_expr2895); 

                    match(input,17,FOLLOW_17_in_select_expr2896); 

                    match(input,42,FOLLOW_42_in_select_expr2897); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_select_expr2898); 

                    match(input,43,FOLLOW_43_in_select_expr2899); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:138:57: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt173=2;
                    int LA173_0 = input.LA(1);

                    if ( (LA173_0==HOSTNAME) ) {
                        int LA173_1 = input.LA(2);

                        if ( (LA173_1==18) ) {
                            alt173=2;
                        }
                        else if ( (LA173_1==EOF) ) {
                            alt173=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 173, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 173, 0, input);

                        throw nvae;

                    }
                    switch (alt173) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:138:58: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr2901); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:138:67: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:138:67: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:138:68: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:138:68: ( HOSTNAME ',' )+
                            int cnt172=0;
                            loop172:
                            do {
                                int alt172=2;
                                int LA172_0 = input.LA(1);

                                if ( (LA172_0==HOSTNAME) ) {
                                    int LA172_1 = input.LA(2);

                                    if ( (LA172_1==18) ) {
                                        alt172=1;
                                    }


                                }


                                switch (alt172) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:138:69: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr2905); 

                            	    match(input,18,FOLLOW_18_in_select_expr2906); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt172 >= 1 ) break loop172;
                                        EarlyExitException eee =
                                            new EarlyExitException(172, input);
                                        throw eee;
                                }
                                cnt172++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr2910); 

                            }


                            }
                            break;

                    }

                    //'SELECT' 'DATARATE' 'FROM' 'SINKHOLES' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.SELECT_DATARATE_FROM_SINKHOLES_AST_OF_VARNAME_ON_HOST;//Case 86
                    }
                    break;
                case 15 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:139:4: 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'SINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr2918); 

                    match(input,23,FOLLOW_23_in_select_expr2919); 

                    match(input,30,FOLLOW_30_in_select_expr2920); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr2921); 

                    match(input,53,FOLLOW_53_in_select_expr2923); 

                    match(input,17,FOLLOW_17_in_select_expr2924); 

                    match(input,43,FOLLOW_43_in_select_expr2925); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:139:56: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt175=2;
                    int LA175_0 = input.LA(1);

                    if ( (LA175_0==HOSTNAME) ) {
                        int LA175_1 = input.LA(2);

                        if ( (LA175_1==18) ) {
                            alt175=2;
                        }
                        else if ( (LA175_1==EOF) ) {
                            alt175=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 175, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 175, 0, input);

                        throw nvae;

                    }
                    switch (alt175) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:139:57: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr2927); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:139:66: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:139:66: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:139:67: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:139:67: ( HOSTNAME ',' )+
                            int cnt174=0;
                            loop174:
                            do {
                                int alt174=2;
                                int LA174_0 = input.LA(1);

                                if ( (LA174_0==HOSTNAME) ) {
                                    int LA174_1 = input.LA(2);

                                    if ( (LA174_1==18) ) {
                                        alt174=1;
                                    }


                                }


                                switch (alt174) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:139:68: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr2931); 

                            	    match(input,18,FOLLOW_18_in_select_expr2932); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt174 >= 1 ) break loop174;
                                        EarlyExitException eee =
                                            new EarlyExitException(174, input);
                                        throw eee;
                                }
                                cnt174++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr2936); 

                            }


                            }
                            break;

                    }

                    //'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'SINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.SELECT_DATARATE_FROM_PROT_SINKHOLES_AST_ON_HOST; //Case 87
                    }
                    break;
                case 16 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:140:4: 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'SINKHOLES' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr2944); 

                    match(input,23,FOLLOW_23_in_select_expr2945); 

                    match(input,30,FOLLOW_30_in_select_expr2946); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr2947); 

                    match(input,53,FOLLOW_53_in_select_expr2949); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:140:49: ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) )
                    int alt177=2;
                    int LA177_0 = input.LA(1);

                    if ( (LA177_0==DIGIT||LA177_0==NUMBER) ) {
                        int LA177_1 = input.LA(2);

                        if ( (LA177_1==18) ) {
                            alt177=2;
                        }
                        else if ( (LA177_1==43) ) {
                            alt177=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 177, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 177, 0, input);

                        throw nvae;

                    }
                    switch (alt177) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:140:50: ( DIGIT | NUMBER )
                            {
                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:140:65: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:140:65: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:140:66: ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:140:66: ( ( DIGIT | NUMBER ) ',' )+
                            int cnt176=0;
                            loop176:
                            do {
                                int alt176=2;
                                int LA176_0 = input.LA(1);

                                if ( (LA176_0==DIGIT||LA176_0==NUMBER) ) {
                                    int LA176_1 = input.LA(2);

                                    if ( (LA176_1==18) ) {
                                        alt176=1;
                                    }


                                }


                                switch (alt176) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:140:67: ( DIGIT | NUMBER ) ','
                            	    {
                            	    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                            	        input.consume();
                            	        state.errorRecovery=false;
                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        throw mse;
                            	    }


                            	    match(input,18,FOLLOW_18_in_select_expr2964); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt176 >= 1 ) break loop176;
                                        EarlyExitException eee =
                                            new EarlyExitException(176, input);
                                        throw eee;
                                }
                                cnt176++;
                            } while (true);


                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }


                            }
                            break;

                    }


                    match(input,43,FOLLOW_43_in_select_expr2975); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:140:107: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt179=2;
                    int LA179_0 = input.LA(1);

                    if ( (LA179_0==HOSTNAME) ) {
                        int LA179_1 = input.LA(2);

                        if ( (LA179_1==18) ) {
                            alt179=2;
                        }
                        else if ( (LA179_1==EOF) ) {
                            alt179=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 179, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 179, 0, input);

                        throw nvae;

                    }
                    switch (alt179) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:140:108: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr2977); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:140:117: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:140:117: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:140:118: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:140:118: ( HOSTNAME ',' )+
                            int cnt178=0;
                            loop178:
                            do {
                                int alt178=2;
                                int LA178_0 = input.LA(1);

                                if ( (LA178_0==HOSTNAME) ) {
                                    int LA178_1 = input.LA(2);

                                    if ( (LA178_1==18) ) {
                                        alt178=1;
                                    }


                                }


                                switch (alt178) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:140:119: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr2981); 

                            	    match(input,18,FOLLOW_18_in_select_expr2982); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt178 >= 1 ) break loop178;
                                        EarlyExitException eee =
                                            new EarlyExitException(178, input);
                                        throw eee;
                                }
                                cnt178++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr2986); 

                            }


                            }
                            break;

                    }

                    //'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'SINKHOLES' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.SELECT_DATARATE_FROM_PROT_SINKHOLES_N_ON_HOST; //Case 88
                    }
                    break;
                case 17 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:143:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SPRINGS'
                    {
                    match(input,50,FOLLOW_50_in_select_expr3002); 

                    match(input,56,FOLLOW_56_in_select_expr3003); 

                    match(input,15,FOLLOW_15_in_select_expr3004); 

                    match(input,23,FOLLOW_23_in_select_expr3005); 

                    match(input,16,FOLLOW_16_in_select_expr3006); 

                    match(input,30,FOLLOW_30_in_select_expr3007); 

                    match(input,54,FOLLOW_54_in_select_expr3008); 

                    //'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SPRINGS'
                    result = QueryResults.SELECT_SUM_DATARATE_FROM_SPRINGS; //Case 89
                    }
                    break;
                case 18 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:144:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SPRINGS' '*' 'OF' VARNAME
                    {
                    match(input,50,FOLLOW_50_in_select_expr3017); 

                    match(input,56,FOLLOW_56_in_select_expr3018); 

                    match(input,15,FOLLOW_15_in_select_expr3019); 

                    match(input,23,FOLLOW_23_in_select_expr3020); 

                    match(input,16,FOLLOW_16_in_select_expr3021); 

                    match(input,30,FOLLOW_30_in_select_expr3022); 

                    match(input,54,FOLLOW_54_in_select_expr3023); 

                    match(input,17,FOLLOW_17_in_select_expr3024); 

                    match(input,42,FOLLOW_42_in_select_expr3025); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_select_expr3026); 

                    //'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SPRINGS' '*' 'OF' VARNAME
                    result = QueryResults.SELECT_SUM_DATARATE_FROM_SPRINGS_AST_OF_VARNAME;//Case 90
                    }
                    break;
                case 19 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:145:6: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr3034); 

                    match(input,56,FOLLOW_56_in_select_expr3035); 

                    match(input,15,FOLLOW_15_in_select_expr3036); 

                    match(input,23,FOLLOW_23_in_select_expr3037); 

                    match(input,16,FOLLOW_16_in_select_expr3038); 

                    match(input,30,FOLLOW_30_in_select_expr3039); 

                    match(input,54,FOLLOW_54_in_select_expr3040); 

                    match(input,17,FOLLOW_17_in_select_expr3041); 

                    match(input,43,FOLLOW_43_in_select_expr3042); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:145:57: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt181=2;
                    int LA181_0 = input.LA(1);

                    if ( (LA181_0==HOSTNAME) ) {
                        int LA181_1 = input.LA(2);

                        if ( (LA181_1==18) ) {
                            alt181=2;
                        }
                        else if ( (LA181_1==EOF) ) {
                            alt181=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 181, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 181, 0, input);

                        throw nvae;

                    }
                    switch (alt181) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:145:58: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3044); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:145:67: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:145:67: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:145:68: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:145:68: ( HOSTNAME ',' )+
                            int cnt180=0;
                            loop180:
                            do {
                                int alt180=2;
                                int LA180_0 = input.LA(1);

                                if ( (LA180_0==HOSTNAME) ) {
                                    int LA180_1 = input.LA(2);

                                    if ( (LA180_1==18) ) {
                                        alt180=1;
                                    }


                                }


                                switch (alt180) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:145:69: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3048); 

                            	    match(input,18,FOLLOW_18_in_select_expr3049); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt180 >= 1 ) break loop180;
                                        EarlyExitException eee =
                                            new EarlyExitException(180, input);
                                        throw eee;
                                }
                                cnt180++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3053); 

                            }


                            }
                            break;

                    }

                    //'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.SELECT_SUM_DATARATE_FROM_SPRINGS_AST_ON_HOST;//Case 91
                    }
                    break;
                case 20 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:146:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr3061); 

                    match(input,56,FOLLOW_56_in_select_expr3062); 

                    match(input,15,FOLLOW_15_in_select_expr3063); 

                    match(input,23,FOLLOW_23_in_select_expr3064); 

                    match(input,16,FOLLOW_16_in_select_expr3065); 

                    match(input,30,FOLLOW_30_in_select_expr3066); 

                    match(input,54,FOLLOW_54_in_select_expr3067); 

                    match(input,17,FOLLOW_17_in_select_expr3068); 

                    match(input,42,FOLLOW_42_in_select_expr3069); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_select_expr3070); 

                    match(input,43,FOLLOW_43_in_select_expr3071); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:146:66: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt183=2;
                    int LA183_0 = input.LA(1);

                    if ( (LA183_0==HOSTNAME) ) {
                        int LA183_1 = input.LA(2);

                        if ( (LA183_1==18) ) {
                            alt183=2;
                        }
                        else if ( (LA183_1==EOF) ) {
                            alt183=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 183, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 183, 0, input);

                        throw nvae;

                    }
                    switch (alt183) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:146:67: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3073); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:146:76: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:146:76: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:146:77: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:146:77: ( HOSTNAME ',' )+
                            int cnt182=0;
                            loop182:
                            do {
                                int alt182=2;
                                int LA182_0 = input.LA(1);

                                if ( (LA182_0==HOSTNAME) ) {
                                    int LA182_1 = input.LA(2);

                                    if ( (LA182_1==18) ) {
                                        alt182=1;
                                    }


                                }


                                switch (alt182) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:146:78: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3077); 

                            	    match(input,18,FOLLOW_18_in_select_expr3078); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt182 >= 1 ) break loop182;
                                        EarlyExitException eee =
                                            new EarlyExitException(182, input);
                                        throw eee;
                                }
                                cnt182++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3082); 

                            }


                            }
                            break;

                    }

                    //'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.SELECT_SUM_DATARATE_FROM_SPRINGS_AST_OF_VARNAME_ON_HOST;//Case 92
                    }
                    break;
                case 21 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:147:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'SPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr3090); 

                    match(input,56,FOLLOW_56_in_select_expr3091); 

                    match(input,15,FOLLOW_15_in_select_expr3092); 

                    match(input,23,FOLLOW_23_in_select_expr3093); 

                    match(input,16,FOLLOW_16_in_select_expr3094); 

                    match(input,30,FOLLOW_30_in_select_expr3095); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr3096); 

                    match(input,54,FOLLOW_54_in_select_expr3098); 

                    match(input,17,FOLLOW_17_in_select_expr3099); 

                    match(input,43,FOLLOW_43_in_select_expr3100); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:147:65: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt185=2;
                    int LA185_0 = input.LA(1);

                    if ( (LA185_0==HOSTNAME) ) {
                        int LA185_1 = input.LA(2);

                        if ( (LA185_1==18) ) {
                            alt185=2;
                        }
                        else if ( (LA185_1==EOF) ) {
                            alt185=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 185, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 185, 0, input);

                        throw nvae;

                    }
                    switch (alt185) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:147:66: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3102); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:147:75: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:147:75: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:147:76: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:147:76: ( HOSTNAME ',' )+
                            int cnt184=0;
                            loop184:
                            do {
                                int alt184=2;
                                int LA184_0 = input.LA(1);

                                if ( (LA184_0==HOSTNAME) ) {
                                    int LA184_1 = input.LA(2);

                                    if ( (LA184_1==18) ) {
                                        alt184=1;
                                    }


                                }


                                switch (alt184) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:147:77: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3106); 

                            	    match(input,18,FOLLOW_18_in_select_expr3107); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt184 >= 1 ) break loop184;
                                        EarlyExitException eee =
                                            new EarlyExitException(184, input);
                                        throw eee;
                                }
                                cnt184++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3111); 

                            }


                            }
                            break;

                    }

                    //'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'SPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.SELECT_SUM_DATARATE_FROM_PROT_SPRINGS_AST_ON_HOST; //Case 93
                    }
                    break;
                case 22 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:148:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'SPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr3119); 

                    match(input,56,FOLLOW_56_in_select_expr3120); 

                    match(input,15,FOLLOW_15_in_select_expr3121); 

                    match(input,23,FOLLOW_23_in_select_expr3122); 

                    match(input,16,FOLLOW_16_in_select_expr3123); 

                    match(input,30,FOLLOW_30_in_select_expr3124); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr3125); 

                    match(input,54,FOLLOW_54_in_select_expr3127); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:148:58: ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) )
                    int alt187=2;
                    int LA187_0 = input.LA(1);

                    if ( (LA187_0==DIGIT||LA187_0==NUMBER) ) {
                        int LA187_1 = input.LA(2);

                        if ( (LA187_1==18) ) {
                            alt187=2;
                        }
                        else if ( (LA187_1==43) ) {
                            alt187=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 187, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 187, 0, input);

                        throw nvae;

                    }
                    switch (alt187) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:148:59: ( DIGIT | NUMBER )
                            {
                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:148:74: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:148:74: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:148:75: ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:148:75: ( ( DIGIT | NUMBER ) ',' )+
                            int cnt186=0;
                            loop186:
                            do {
                                int alt186=2;
                                int LA186_0 = input.LA(1);

                                if ( (LA186_0==DIGIT||LA186_0==NUMBER) ) {
                                    int LA186_1 = input.LA(2);

                                    if ( (LA186_1==18) ) {
                                        alt186=1;
                                    }


                                }


                                switch (alt186) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:148:76: ( DIGIT | NUMBER ) ','
                            	    {
                            	    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                            	        input.consume();
                            	        state.errorRecovery=false;
                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        throw mse;
                            	    }


                            	    match(input,18,FOLLOW_18_in_select_expr3142); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt186 >= 1 ) break loop186;
                                        EarlyExitException eee =
                                            new EarlyExitException(186, input);
                                        throw eee;
                                }
                                cnt186++;
                            } while (true);


                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }


                            }
                            break;

                    }


                    match(input,43,FOLLOW_43_in_select_expr3153); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:148:116: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt189=2;
                    int LA189_0 = input.LA(1);

                    if ( (LA189_0==HOSTNAME) ) {
                        int LA189_1 = input.LA(2);

                        if ( (LA189_1==18) ) {
                            alt189=2;
                        }
                        else if ( (LA189_1==EOF) ) {
                            alt189=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 189, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 189, 0, input);

                        throw nvae;

                    }
                    switch (alt189) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:148:117: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3155); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:148:126: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:148:126: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:148:127: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:148:127: ( HOSTNAME ',' )+
                            int cnt188=0;
                            loop188:
                            do {
                                int alt188=2;
                                int LA188_0 = input.LA(1);

                                if ( (LA188_0==HOSTNAME) ) {
                                    int LA188_1 = input.LA(2);

                                    if ( (LA188_1==18) ) {
                                        alt188=1;
                                    }


                                }


                                switch (alt188) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:148:128: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3159); 

                            	    match(input,18,FOLLOW_18_in_select_expr3160); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt188 >= 1 ) break loop188;
                                        EarlyExitException eee =
                                            new EarlyExitException(188, input);
                                        throw eee;
                                }
                                cnt188++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3164); 

                            }


                            }
                            break;

                    }

                    //'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'SPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.SELECT_SUM_DATARATE_FROM_PROT_SPRINGS_N_ON_HOST;//Case 94                    
                    }
                    break;
                case 23 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:151:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SINKHOLES'
                    {
                    match(input,50,FOLLOW_50_in_select_expr3184); 

                    match(input,56,FOLLOW_56_in_select_expr3185); 

                    match(input,15,FOLLOW_15_in_select_expr3186); 

                    match(input,23,FOLLOW_23_in_select_expr3187); 

                    match(input,16,FOLLOW_16_in_select_expr3188); 

                    match(input,30,FOLLOW_30_in_select_expr3189); 

                    match(input,53,FOLLOW_53_in_select_expr3190); 

                    //'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SINKHOLES'
                    result = QueryResults.SELECT_SUM_DATARATE_FROM_SINKHOLES; //Case 95
                    }
                    break;
                case 24 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:152:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SINKHOLES' '*' 'OF' VARNAME
                    {
                    match(input,50,FOLLOW_50_in_select_expr3199); 

                    match(input,56,FOLLOW_56_in_select_expr3200); 

                    match(input,15,FOLLOW_15_in_select_expr3201); 

                    match(input,23,FOLLOW_23_in_select_expr3202); 

                    match(input,16,FOLLOW_16_in_select_expr3203); 

                    match(input,30,FOLLOW_30_in_select_expr3204); 

                    match(input,53,FOLLOW_53_in_select_expr3205); 

                    match(input,17,FOLLOW_17_in_select_expr3206); 

                    match(input,42,FOLLOW_42_in_select_expr3207); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_select_expr3208); 

                    //'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SINKHOLES' '*' 'OF' VARNAME
                    result = QueryResults.SELECT_SUM_DATARATE_FROM_SINKHOLES_AST_OF_VARNAME; //Case 96
                    }
                    break;
                case 25 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:153:6: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr3216); 

                    match(input,56,FOLLOW_56_in_select_expr3217); 

                    match(input,15,FOLLOW_15_in_select_expr3218); 

                    match(input,23,FOLLOW_23_in_select_expr3219); 

                    match(input,16,FOLLOW_16_in_select_expr3220); 

                    match(input,30,FOLLOW_30_in_select_expr3221); 

                    match(input,53,FOLLOW_53_in_select_expr3222); 

                    match(input,17,FOLLOW_17_in_select_expr3223); 

                    match(input,43,FOLLOW_43_in_select_expr3224); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:153:59: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt191=2;
                    int LA191_0 = input.LA(1);

                    if ( (LA191_0==HOSTNAME) ) {
                        int LA191_1 = input.LA(2);

                        if ( (LA191_1==18) ) {
                            alt191=2;
                        }
                        else if ( (LA191_1==EOF) ) {
                            alt191=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 191, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 191, 0, input);

                        throw nvae;

                    }
                    switch (alt191) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:153:60: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3226); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:153:69: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:153:69: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:153:70: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:153:70: ( HOSTNAME ',' )+
                            int cnt190=0;
                            loop190:
                            do {
                                int alt190=2;
                                int LA190_0 = input.LA(1);

                                if ( (LA190_0==HOSTNAME) ) {
                                    int LA190_1 = input.LA(2);

                                    if ( (LA190_1==18) ) {
                                        alt190=1;
                                    }


                                }


                                switch (alt190) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:153:71: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3230); 

                            	    match(input,18,FOLLOW_18_in_select_expr3231); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt190 >= 1 ) break loop190;
                                        EarlyExitException eee =
                                            new EarlyExitException(190, input);
                                        throw eee;
                                }
                                cnt190++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3235); 

                            }


                            }
                            break;

                    }

                    //'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.SELECT_SUM_DATARATE_FROM_SINKHOLES_AST_ON_HOST;//Case 97
                    }
                    break;
                case 26 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:154:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SINKHOLES' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr3243); 

                    match(input,56,FOLLOW_56_in_select_expr3244); 

                    match(input,15,FOLLOW_15_in_select_expr3245); 

                    match(input,23,FOLLOW_23_in_select_expr3246); 

                    match(input,16,FOLLOW_16_in_select_expr3247); 

                    match(input,30,FOLLOW_30_in_select_expr3248); 

                    match(input,53,FOLLOW_53_in_select_expr3249); 

                    match(input,17,FOLLOW_17_in_select_expr3250); 

                    match(input,42,FOLLOW_42_in_select_expr3251); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_select_expr3252); 

                    match(input,43,FOLLOW_43_in_select_expr3253); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:154:68: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt193=2;
                    int LA193_0 = input.LA(1);

                    if ( (LA193_0==HOSTNAME) ) {
                        int LA193_1 = input.LA(2);

                        if ( (LA193_1==18) ) {
                            alt193=2;
                        }
                        else if ( (LA193_1==EOF) ) {
                            alt193=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 193, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 193, 0, input);

                        throw nvae;

                    }
                    switch (alt193) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:154:69: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3255); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:154:78: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:154:78: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:154:79: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:154:79: ( HOSTNAME ',' )+
                            int cnt192=0;
                            loop192:
                            do {
                                int alt192=2;
                                int LA192_0 = input.LA(1);

                                if ( (LA192_0==HOSTNAME) ) {
                                    int LA192_1 = input.LA(2);

                                    if ( (LA192_1==18) ) {
                                        alt192=1;
                                    }


                                }


                                switch (alt192) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:154:80: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3259); 

                            	    match(input,18,FOLLOW_18_in_select_expr3260); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt192 >= 1 ) break loop192;
                                        EarlyExitException eee =
                                            new EarlyExitException(192, input);
                                        throw eee;
                                }
                                cnt192++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3264); 

                            }


                            }
                            break;

                    }

                    //'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SINKHOLES' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.SELECT_SUM_DATARATE_FROM_SINKHOLES_AST_OF_VARNAME_ON_HOST;//Case 98
                    }
                    break;
                case 27 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:155:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'SINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr3272); 

                    match(input,56,FOLLOW_56_in_select_expr3273); 

                    match(input,15,FOLLOW_15_in_select_expr3274); 

                    match(input,23,FOLLOW_23_in_select_expr3275); 

                    match(input,16,FOLLOW_16_in_select_expr3276); 

                    match(input,30,FOLLOW_30_in_select_expr3277); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr3278); 

                    match(input,53,FOLLOW_53_in_select_expr3280); 

                    match(input,17,FOLLOW_17_in_select_expr3281); 

                    match(input,43,FOLLOW_43_in_select_expr3282); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:155:67: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt195=2;
                    int LA195_0 = input.LA(1);

                    if ( (LA195_0==HOSTNAME) ) {
                        int LA195_1 = input.LA(2);

                        if ( (LA195_1==18) ) {
                            alt195=2;
                        }
                        else if ( (LA195_1==EOF) ) {
                            alt195=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 195, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 195, 0, input);

                        throw nvae;

                    }
                    switch (alt195) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:155:68: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3284); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:155:77: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:155:77: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:155:78: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:155:78: ( HOSTNAME ',' )+
                            int cnt194=0;
                            loop194:
                            do {
                                int alt194=2;
                                int LA194_0 = input.LA(1);

                                if ( (LA194_0==HOSTNAME) ) {
                                    int LA194_1 = input.LA(2);

                                    if ( (LA194_1==18) ) {
                                        alt194=1;
                                    }


                                }


                                switch (alt194) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:155:79: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3288); 

                            	    match(input,18,FOLLOW_18_in_select_expr3289); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt194 >= 1 ) break loop194;
                                        EarlyExitException eee =
                                            new EarlyExitException(194, input);
                                        throw eee;
                                }
                                cnt194++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3293); 

                            }


                            }
                            break;

                    }

                    //'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'SINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.SELECT_SUM_DATARATE_FROM_PROT_SINKHOLES_AST_ON_HOST;//Case 99
                    }
                    break;
                case 28 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:156:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'SINKHOLES' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr3301); 

                    match(input,56,FOLLOW_56_in_select_expr3302); 

                    match(input,15,FOLLOW_15_in_select_expr3303); 

                    match(input,23,FOLLOW_23_in_select_expr3304); 

                    match(input,16,FOLLOW_16_in_select_expr3305); 

                    match(input,30,FOLLOW_30_in_select_expr3306); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr3307); 

                    match(input,53,FOLLOW_53_in_select_expr3309); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:156:60: ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) )
                    int alt197=2;
                    int LA197_0 = input.LA(1);

                    if ( (LA197_0==DIGIT||LA197_0==NUMBER) ) {
                        int LA197_1 = input.LA(2);

                        if ( (LA197_1==18) ) {
                            alt197=2;
                        }
                        else if ( (LA197_1==43) ) {
                            alt197=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 197, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 197, 0, input);

                        throw nvae;

                    }
                    switch (alt197) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:156:61: ( DIGIT | NUMBER )
                            {
                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:156:76: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:156:76: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:156:77: ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:156:77: ( ( DIGIT | NUMBER ) ',' )+
                            int cnt196=0;
                            loop196:
                            do {
                                int alt196=2;
                                int LA196_0 = input.LA(1);

                                if ( (LA196_0==DIGIT||LA196_0==NUMBER) ) {
                                    int LA196_1 = input.LA(2);

                                    if ( (LA196_1==18) ) {
                                        alt196=1;
                                    }


                                }


                                switch (alt196) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:156:78: ( DIGIT | NUMBER ) ','
                            	    {
                            	    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                            	        input.consume();
                            	        state.errorRecovery=false;
                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        throw mse;
                            	    }


                            	    match(input,18,FOLLOW_18_in_select_expr3324); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt196 >= 1 ) break loop196;
                                        EarlyExitException eee =
                                            new EarlyExitException(196, input);
                                        throw eee;
                                }
                                cnt196++;
                            } while (true);


                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }


                            }
                            break;

                    }


                    match(input,43,FOLLOW_43_in_select_expr3335); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:156:118: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt199=2;
                    int LA199_0 = input.LA(1);

                    if ( (LA199_0==HOSTNAME) ) {
                        int LA199_1 = input.LA(2);

                        if ( (LA199_1==18) ) {
                            alt199=2;
                        }
                        else if ( (LA199_1==EOF) ) {
                            alt199=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 199, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 199, 0, input);

                        throw nvae;

                    }
                    switch (alt199) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:156:119: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3337); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:156:128: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:156:128: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:156:129: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:156:129: ( HOSTNAME ',' )+
                            int cnt198=0;
                            loop198:
                            do {
                                int alt198=2;
                                int LA198_0 = input.LA(1);

                                if ( (LA198_0==HOSTNAME) ) {
                                    int LA198_1 = input.LA(2);

                                    if ( (LA198_1==18) ) {
                                        alt198=1;
                                    }


                                }


                                switch (alt198) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:156:130: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3341); 

                            	    match(input,18,FOLLOW_18_in_select_expr3342); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt198 >= 1 ) break loop198;
                                        EarlyExitException eee =
                                            new EarlyExitException(198, input);
                                        throw eee;
                                }
                                cnt198++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3346); 

                            }


                            }
                            break;

                    }

                    //'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'SINKHOLES' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.SELECT_SUM_DATARATE_FROM_PROT_SINKHOLES_N_ON_HOST;//Case 100
                    }
                    break;
                case 29 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:160:4: 'SELECT' '*' PROTOCOLS 'PSPRINGS'
                    {
                    match(input,50,FOLLOW_50_in_select_expr3364); 

                    match(input,17,FOLLOW_17_in_select_expr3365); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr3367); 

                    match(input,46,FOLLOW_46_in_select_expr3369); 

                    //'SELECT' '*' PROTOCOLS 'PSPRINGS'
                    result = QueryResults.SELECT_AST_PROT_PSPRINGS;//Case 101
                    }
                    break;
                case 30 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:161:4: 'SELECT' ( DIGIT | NUMBER ) PROTOCOLS 'PSPRINGS'
                    {
                    match(input,50,FOLLOW_50_in_select_expr3375); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr3382); 

                    match(input,46,FOLLOW_46_in_select_expr3384); 

                    // 'SELECT' ( DIGIT | NUMBER ) PROTOCOLS 'PSPRINGS'
                    result = QueryResults.SELECT_N_PROTOCOL_PSPRINGS;//Case 102
                    }
                    break;
                case 31 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:162:4: 'SELECT' '*' PROTOCOLS 'PSINKHOLES'
                    {
                    match(input,50,FOLLOW_50_in_select_expr3390); 

                    match(input,17,FOLLOW_17_in_select_expr3391); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr3393); 

                    match(input,45,FOLLOW_45_in_select_expr3395); 

                    //'SELECT' '*' PROTOCOLS 'PSINKHOLES'
                    //SELECT_AST_PROTOCOL_PSINKHOLES
                    result = QueryResults.SELECT_AST_PROTOCOL_PSINKHOLES;//Case 103
                    }
                    break;
                case 32 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:163:4: 'SELECT' ( DIGIT | NUMBER ) PROTOCOLS 'PSINKHOLES'
                    {
                    match(input,50,FOLLOW_50_in_select_expr3401); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr3408); 

                    match(input,45,FOLLOW_45_in_select_expr3410); 

                    //'SELECT' ( DIGIT | NUMBER ) PROTOCOLS 'PSINKHOLES'
                    //SELECT_N_PROTOCOL_PSINKHOLES
                    result = QueryResults.SELECT_N_PROTOCOL_PSINKHOLES;//Case 104
                    }
                    break;
                case 33 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:166:4: 'SELECT' 'DATARATE' 'FROM' 'PSPRINGS'
                    {
                    match(input,50,FOLLOW_50_in_select_expr3425); 

                    match(input,23,FOLLOW_23_in_select_expr3426); 

                    match(input,30,FOLLOW_30_in_select_expr3427); 

                    match(input,46,FOLLOW_46_in_select_expr3428); 

                    //'SELECT' 'DATARATE' 'FROM' 'PSPRINGS'
                    result = QueryResults.SELECT_DATARATE_FROM_PSPRINGS;//Case 105
                    }
                    break;
                case 34 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:167:4: 'SELECT' 'DATARATE' 'FROM' 'PSPRINGS' '*' 'OF' VARNAME
                    {
                    match(input,50,FOLLOW_50_in_select_expr3437); 

                    match(input,23,FOLLOW_23_in_select_expr3438); 

                    match(input,30,FOLLOW_30_in_select_expr3439); 

                    match(input,46,FOLLOW_46_in_select_expr3440); 

                    match(input,17,FOLLOW_17_in_select_expr3441); 

                    match(input,42,FOLLOW_42_in_select_expr3442); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_select_expr3443); 

                    //'SELECT' 'DATARATE' 'FROM' 'PSPRINGS' '*' 'OF' VARNAME
                    result = QueryResults.SELECT_DATARATE_FROM_PSPRINGS_AST_OF_VARNAME;//Case 106
                    }
                    break;
                case 35 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:168:6: 'SELECT' 'DATARATE' 'FROM' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr3451); 

                    match(input,23,FOLLOW_23_in_select_expr3452); 

                    match(input,30,FOLLOW_30_in_select_expr3453); 

                    match(input,46,FOLLOW_46_in_select_expr3454); 

                    match(input,17,FOLLOW_17_in_select_expr3455); 

                    match(input,43,FOLLOW_43_in_select_expr3456); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:168:47: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt201=2;
                    int LA201_0 = input.LA(1);

                    if ( (LA201_0==HOSTNAME) ) {
                        int LA201_1 = input.LA(2);

                        if ( (LA201_1==18) ) {
                            alt201=2;
                        }
                        else if ( (LA201_1==EOF) ) {
                            alt201=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 201, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 201, 0, input);

                        throw nvae;

                    }
                    switch (alt201) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:168:48: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3458); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:168:57: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:168:57: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:168:58: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:168:58: ( HOSTNAME ',' )+
                            int cnt200=0;
                            loop200:
                            do {
                                int alt200=2;
                                int LA200_0 = input.LA(1);

                                if ( (LA200_0==HOSTNAME) ) {
                                    int LA200_1 = input.LA(2);

                                    if ( (LA200_1==18) ) {
                                        alt200=1;
                                    }


                                }


                                switch (alt200) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:168:59: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3462); 

                            	    match(input,18,FOLLOW_18_in_select_expr3463); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt200 >= 1 ) break loop200;
                                        EarlyExitException eee =
                                            new EarlyExitException(200, input);
                                        throw eee;
                                }
                                cnt200++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3467); 

                            }


                            }
                            break;

                    }

                    //'SELECT' 'DATARATE' 'FROM' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.SELECT_DATARATE_FROM_PSPRINGS_AST_ON_HOST;//Case 107
                    }
                    break;
                case 36 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:169:4: 'SELECT' 'DATARATE' 'FROM' 'PSPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr3475); 

                    match(input,23,FOLLOW_23_in_select_expr3476); 

                    match(input,30,FOLLOW_30_in_select_expr3477); 

                    match(input,46,FOLLOW_46_in_select_expr3478); 

                    match(input,17,FOLLOW_17_in_select_expr3479); 

                    match(input,42,FOLLOW_42_in_select_expr3480); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_select_expr3481); 

                    match(input,43,FOLLOW_43_in_select_expr3482); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:169:56: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt203=2;
                    int LA203_0 = input.LA(1);

                    if ( (LA203_0==HOSTNAME) ) {
                        int LA203_1 = input.LA(2);

                        if ( (LA203_1==18) ) {
                            alt203=2;
                        }
                        else if ( (LA203_1==EOF) ) {
                            alt203=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 203, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 203, 0, input);

                        throw nvae;

                    }
                    switch (alt203) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:169:57: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3484); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:169:66: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:169:66: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:169:67: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:169:67: ( HOSTNAME ',' )+
                            int cnt202=0;
                            loop202:
                            do {
                                int alt202=2;
                                int LA202_0 = input.LA(1);

                                if ( (LA202_0==HOSTNAME) ) {
                                    int LA202_1 = input.LA(2);

                                    if ( (LA202_1==18) ) {
                                        alt202=1;
                                    }


                                }


                                switch (alt202) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:169:68: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3488); 

                            	    match(input,18,FOLLOW_18_in_select_expr3489); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt202 >= 1 ) break loop202;
                                        EarlyExitException eee =
                                            new EarlyExitException(202, input);
                                        throw eee;
                                }
                                cnt202++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3493); 

                            }


                            }
                            break;

                    }

                    //'SELECT' 'DATARATE' 'FROM' 'PSPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.SELECT_DATARATE_FROM_PSPRINGS_AST_OF_VARNAME_ON_HOST; //Case 108
                    }
                    break;
                case 37 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:170:4: 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr3501); 

                    match(input,23,FOLLOW_23_in_select_expr3502); 

                    match(input,30,FOLLOW_30_in_select_expr3503); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr3504); 

                    match(input,46,FOLLOW_46_in_select_expr3506); 

                    match(input,17,FOLLOW_17_in_select_expr3507); 

                    match(input,43,FOLLOW_43_in_select_expr3508); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:170:55: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt205=2;
                    int LA205_0 = input.LA(1);

                    if ( (LA205_0==HOSTNAME) ) {
                        int LA205_1 = input.LA(2);

                        if ( (LA205_1==18) ) {
                            alt205=2;
                        }
                        else if ( (LA205_1==EOF) ) {
                            alt205=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 205, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 205, 0, input);

                        throw nvae;

                    }
                    switch (alt205) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:170:56: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3510); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:170:65: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:170:65: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:170:66: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:170:66: ( HOSTNAME ',' )+
                            int cnt204=0;
                            loop204:
                            do {
                                int alt204=2;
                                int LA204_0 = input.LA(1);

                                if ( (LA204_0==HOSTNAME) ) {
                                    int LA204_1 = input.LA(2);

                                    if ( (LA204_1==18) ) {
                                        alt204=1;
                                    }


                                }


                                switch (alt204) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:170:67: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3514); 

                            	    match(input,18,FOLLOW_18_in_select_expr3515); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt204 >= 1 ) break loop204;
                                        EarlyExitException eee =
                                            new EarlyExitException(204, input);
                                        throw eee;
                                }
                                cnt204++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3519); 

                            }


                            }
                            break;

                    }

                    //'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.SELECT_DATARATE_FROM_PROTOCOL_PSPRINGS_AST_ON_HOST;//Case 109
                    }
                    break;
                case 38 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:171:4: 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr3527); 

                    match(input,23,FOLLOW_23_in_select_expr3528); 

                    match(input,30,FOLLOW_30_in_select_expr3529); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr3530); 

                    match(input,46,FOLLOW_46_in_select_expr3532); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:171:48: ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) )
                    int alt207=2;
                    int LA207_0 = input.LA(1);

                    if ( (LA207_0==DIGIT||LA207_0==NUMBER) ) {
                        int LA207_1 = input.LA(2);

                        if ( (LA207_1==18) ) {
                            alt207=2;
                        }
                        else if ( (LA207_1==43) ) {
                            alt207=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 207, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 207, 0, input);

                        throw nvae;

                    }
                    switch (alt207) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:171:49: ( DIGIT | NUMBER )
                            {
                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:171:64: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:171:64: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:171:65: ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:171:65: ( ( DIGIT | NUMBER ) ',' )+
                            int cnt206=0;
                            loop206:
                            do {
                                int alt206=2;
                                int LA206_0 = input.LA(1);

                                if ( (LA206_0==DIGIT||LA206_0==NUMBER) ) {
                                    int LA206_1 = input.LA(2);

                                    if ( (LA206_1==18) ) {
                                        alt206=1;
                                    }


                                }


                                switch (alt206) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:171:66: ( DIGIT | NUMBER ) ','
                            	    {
                            	    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                            	        input.consume();
                            	        state.errorRecovery=false;
                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        throw mse;
                            	    }


                            	    match(input,18,FOLLOW_18_in_select_expr3547); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt206 >= 1 ) break loop206;
                                        EarlyExitException eee =
                                            new EarlyExitException(206, input);
                                        throw eee;
                                }
                                cnt206++;
                            } while (true);


                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }


                            }
                            break;

                    }


                    match(input,43,FOLLOW_43_in_select_expr3558); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:171:106: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt209=2;
                    int LA209_0 = input.LA(1);

                    if ( (LA209_0==HOSTNAME) ) {
                        int LA209_1 = input.LA(2);

                        if ( (LA209_1==18) ) {
                            alt209=2;
                        }
                        else if ( (LA209_1==EOF) ) {
                            alt209=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 209, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 209, 0, input);

                        throw nvae;

                    }
                    switch (alt209) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:171:107: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3560); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:171:116: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:171:116: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:171:117: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:171:117: ( HOSTNAME ',' )+
                            int cnt208=0;
                            loop208:
                            do {
                                int alt208=2;
                                int LA208_0 = input.LA(1);

                                if ( (LA208_0==HOSTNAME) ) {
                                    int LA208_1 = input.LA(2);

                                    if ( (LA208_1==18) ) {
                                        alt208=1;
                                    }


                                }


                                switch (alt208) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:171:118: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3564); 

                            	    match(input,18,FOLLOW_18_in_select_expr3565); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt208 >= 1 ) break loop208;
                                        EarlyExitException eee =
                                            new EarlyExitException(208, input);
                                        throw eee;
                                }
                                cnt208++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3569); 

                            }


                            }
                            break;

                    }

                    //'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.SELECT_DATARATE_FROM_PROTOCOL_PSPRINGS_N_ON_HOST;//Case 110
                    }
                    break;
                case 39 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:174:4: 'SELECT' 'DATARATE' 'FROM' 'PSINKHOLES'
                    {
                    match(input,50,FOLLOW_50_in_select_expr3589); 

                    match(input,23,FOLLOW_23_in_select_expr3590); 

                    match(input,30,FOLLOW_30_in_select_expr3591); 

                    match(input,45,FOLLOW_45_in_select_expr3592); 

                    // 'SELECT' 'DATARATE' 'FROM' 'PSINKHOLES'
                    result = QueryResults.SELECT_DATARATE_FROM_PSINKHOLES; //Case 111
                    }
                    break;
                case 40 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:175:4: 'SELECT' 'DATARATE' 'FROM' 'PSINKHOLES' '*' 'OF' VARNAME
                    {
                    match(input,50,FOLLOW_50_in_select_expr3601); 

                    match(input,23,FOLLOW_23_in_select_expr3602); 

                    match(input,30,FOLLOW_30_in_select_expr3603); 

                    match(input,45,FOLLOW_45_in_select_expr3604); 

                    match(input,17,FOLLOW_17_in_select_expr3605); 

                    match(input,42,FOLLOW_42_in_select_expr3606); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_select_expr3607); 

                    //'SELECT' 'DATARATE' 'FROM' 'PSINKHOLES' '*' 'OF' VARNAME
                    result = QueryResults.SELECT_DATARATE_FROM_PSINKHOLES_AST_OF_VARNAME; //Case 112
                    }
                    break;
                case 41 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:176:6: 'SELECT' 'DATARATE' 'FROM' 'PSINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr3615); 

                    match(input,23,FOLLOW_23_in_select_expr3616); 

                    match(input,30,FOLLOW_30_in_select_expr3617); 

                    match(input,45,FOLLOW_45_in_select_expr3618); 

                    match(input,17,FOLLOW_17_in_select_expr3619); 

                    match(input,43,FOLLOW_43_in_select_expr3620); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:176:49: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt211=2;
                    int LA211_0 = input.LA(1);

                    if ( (LA211_0==HOSTNAME) ) {
                        int LA211_1 = input.LA(2);

                        if ( (LA211_1==18) ) {
                            alt211=2;
                        }
                        else if ( (LA211_1==EOF) ) {
                            alt211=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 211, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 211, 0, input);

                        throw nvae;

                    }
                    switch (alt211) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:176:50: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3622); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:176:59: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:176:59: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:176:60: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:176:60: ( HOSTNAME ',' )+
                            int cnt210=0;
                            loop210:
                            do {
                                int alt210=2;
                                int LA210_0 = input.LA(1);

                                if ( (LA210_0==HOSTNAME) ) {
                                    int LA210_1 = input.LA(2);

                                    if ( (LA210_1==18) ) {
                                        alt210=1;
                                    }


                                }


                                switch (alt210) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:176:61: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3626); 

                            	    match(input,18,FOLLOW_18_in_select_expr3627); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt210 >= 1 ) break loop210;
                                        EarlyExitException eee =
                                            new EarlyExitException(210, input);
                                        throw eee;
                                }
                                cnt210++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3631); 

                            }


                            }
                            break;

                    }

                    //'SELECT' 'DATARATE' 'FROM' 'PSINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.SELECT_DATARATE_FROM_PSINKHOLES_AST_ON_HOST;//Case 113
                    }
                    break;
                case 42 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:177:4: 'SELECT' 'DATARATE' 'FROM' 'PSINKHOLES' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr3639); 

                    match(input,23,FOLLOW_23_in_select_expr3640); 

                    match(input,30,FOLLOW_30_in_select_expr3641); 

                    match(input,45,FOLLOW_45_in_select_expr3642); 

                    match(input,17,FOLLOW_17_in_select_expr3643); 

                    match(input,42,FOLLOW_42_in_select_expr3644); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_select_expr3645); 

                    match(input,43,FOLLOW_43_in_select_expr3646); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:177:58: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt213=2;
                    int LA213_0 = input.LA(1);

                    if ( (LA213_0==HOSTNAME) ) {
                        int LA213_1 = input.LA(2);

                        if ( (LA213_1==18) ) {
                            alt213=2;
                        }
                        else if ( (LA213_1==EOF) ) {
                            alt213=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 213, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 213, 0, input);

                        throw nvae;

                    }
                    switch (alt213) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:177:59: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3648); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:177:68: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:177:68: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:177:69: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:177:69: ( HOSTNAME ',' )+
                            int cnt212=0;
                            loop212:
                            do {
                                int alt212=2;
                                int LA212_0 = input.LA(1);

                                if ( (LA212_0==HOSTNAME) ) {
                                    int LA212_1 = input.LA(2);

                                    if ( (LA212_1==18) ) {
                                        alt212=1;
                                    }


                                }


                                switch (alt212) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:177:70: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3652); 

                            	    match(input,18,FOLLOW_18_in_select_expr3653); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt212 >= 1 ) break loop212;
                                        EarlyExitException eee =
                                            new EarlyExitException(212, input);
                                        throw eee;
                                }
                                cnt212++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3657); 

                            }


                            }
                            break;

                    }

                    //'SELECT' 'DATARATE' 'FROM' 'PSINKHOLES' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.SELECT_DATARATE_FROM_PSINKHOLES_AST_OF_VARNAME_ON_HOST;//Case 114
                    }
                    break;
                case 43 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:178:4: 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'PSINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr3665); 

                    match(input,23,FOLLOW_23_in_select_expr3666); 

                    match(input,30,FOLLOW_30_in_select_expr3667); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr3668); 

                    match(input,45,FOLLOW_45_in_select_expr3670); 

                    match(input,17,FOLLOW_17_in_select_expr3671); 

                    match(input,43,FOLLOW_43_in_select_expr3672); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:178:57: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt215=2;
                    int LA215_0 = input.LA(1);

                    if ( (LA215_0==HOSTNAME) ) {
                        int LA215_1 = input.LA(2);

                        if ( (LA215_1==18) ) {
                            alt215=2;
                        }
                        else if ( (LA215_1==EOF) ) {
                            alt215=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 215, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 215, 0, input);

                        throw nvae;

                    }
                    switch (alt215) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:178:58: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3674); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:178:67: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:178:67: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:178:68: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:178:68: ( HOSTNAME ',' )+
                            int cnt214=0;
                            loop214:
                            do {
                                int alt214=2;
                                int LA214_0 = input.LA(1);

                                if ( (LA214_0==HOSTNAME) ) {
                                    int LA214_1 = input.LA(2);

                                    if ( (LA214_1==18) ) {
                                        alt214=1;
                                    }


                                }


                                switch (alt214) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:178:69: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3678); 

                            	    match(input,18,FOLLOW_18_in_select_expr3679); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt214 >= 1 ) break loop214;
                                        EarlyExitException eee =
                                            new EarlyExitException(214, input);
                                        throw eee;
                                }
                                cnt214++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3683); 

                            }


                            }
                            break;

                    }

                    //'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'PSINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.SELECT_DATARATE_FROM_PROTOCOL_PSINKHOLES_AST_ON_HOST;//Case 115
                    }
                    break;
                case 44 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:179:4: 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'PSINKHOLES' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr3691); 

                    match(input,23,FOLLOW_23_in_select_expr3692); 

                    match(input,30,FOLLOW_30_in_select_expr3693); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr3694); 

                    match(input,45,FOLLOW_45_in_select_expr3696); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:179:50: ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) )
                    int alt217=2;
                    int LA217_0 = input.LA(1);

                    if ( (LA217_0==DIGIT||LA217_0==NUMBER) ) {
                        int LA217_1 = input.LA(2);

                        if ( (LA217_1==18) ) {
                            alt217=2;
                        }
                        else if ( (LA217_1==43) ) {
                            alt217=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 217, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 217, 0, input);

                        throw nvae;

                    }
                    switch (alt217) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:179:51: ( DIGIT | NUMBER )
                            {
                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:179:66: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:179:66: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:179:67: ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:179:67: ( ( DIGIT | NUMBER ) ',' )+
                            int cnt216=0;
                            loop216:
                            do {
                                int alt216=2;
                                int LA216_0 = input.LA(1);

                                if ( (LA216_0==DIGIT||LA216_0==NUMBER) ) {
                                    int LA216_1 = input.LA(2);

                                    if ( (LA216_1==18) ) {
                                        alt216=1;
                                    }


                                }


                                switch (alt216) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:179:68: ( DIGIT | NUMBER ) ','
                            	    {
                            	    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                            	        input.consume();
                            	        state.errorRecovery=false;
                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        throw mse;
                            	    }


                            	    match(input,18,FOLLOW_18_in_select_expr3711); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt216 >= 1 ) break loop216;
                                        EarlyExitException eee =
                                            new EarlyExitException(216, input);
                                        throw eee;
                                }
                                cnt216++;
                            } while (true);


                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }


                            }
                            break;

                    }


                    match(input,43,FOLLOW_43_in_select_expr3722); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:179:108: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt219=2;
                    int LA219_0 = input.LA(1);

                    if ( (LA219_0==HOSTNAME) ) {
                        int LA219_1 = input.LA(2);

                        if ( (LA219_1==18) ) {
                            alt219=2;
                        }
                        else if ( (LA219_1==EOF) ) {
                            alt219=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 219, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 219, 0, input);

                        throw nvae;

                    }
                    switch (alt219) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:179:109: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3724); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:179:118: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:179:118: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:179:119: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:179:119: ( HOSTNAME ',' )+
                            int cnt218=0;
                            loop218:
                            do {
                                int alt218=2;
                                int LA218_0 = input.LA(1);

                                if ( (LA218_0==HOSTNAME) ) {
                                    int LA218_1 = input.LA(2);

                                    if ( (LA218_1==18) ) {
                                        alt218=1;
                                    }


                                }


                                switch (alt218) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:179:120: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3728); 

                            	    match(input,18,FOLLOW_18_in_select_expr3729); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt218 >= 1 ) break loop218;
                                        EarlyExitException eee =
                                            new EarlyExitException(218, input);
                                        throw eee;
                                }
                                cnt218++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3733); 

                            }


                            }
                            break;

                    }

                    //'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'PSINKHOLES' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.SELECT_DATARATE_FROM_PROTOCOL_PSINKHOLES_N_ON_HOST;//Case 116
                    }
                    break;
                case 45 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:182:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSPRINGS'
                    {
                    match(input,50,FOLLOW_50_in_select_expr3749); 

                    match(input,56,FOLLOW_56_in_select_expr3750); 

                    match(input,15,FOLLOW_15_in_select_expr3751); 

                    match(input,23,FOLLOW_23_in_select_expr3752); 

                    match(input,16,FOLLOW_16_in_select_expr3753); 

                    match(input,30,FOLLOW_30_in_select_expr3754); 

                    match(input,46,FOLLOW_46_in_select_expr3755); 

                    //'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSPRINGS'
                    result = QueryResults.SELECT_SUM_DATARATE_FROM_PSPRINGS;//Case 117
                    }
                    break;
                case 46 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:183:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSPRINGS' '*' 'OF' VARNAME
                    {
                    match(input,50,FOLLOW_50_in_select_expr3764); 

                    match(input,56,FOLLOW_56_in_select_expr3765); 

                    match(input,15,FOLLOW_15_in_select_expr3766); 

                    match(input,23,FOLLOW_23_in_select_expr3767); 

                    match(input,16,FOLLOW_16_in_select_expr3768); 

                    match(input,30,FOLLOW_30_in_select_expr3769); 

                    match(input,46,FOLLOW_46_in_select_expr3770); 

                    match(input,17,FOLLOW_17_in_select_expr3771); 

                    match(input,42,FOLLOW_42_in_select_expr3772); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_select_expr3773); 

                    //'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSPRINGS' '*' 'OF' VARNAME
                    result = QueryResults.SELECT_SUM_DATARATE_FROM_PSPRINGS_AST_OF_VARNAME;//Case 118
                    }
                    break;
                case 47 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:184:6: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr3781); 

                    match(input,56,FOLLOW_56_in_select_expr3782); 

                    match(input,15,FOLLOW_15_in_select_expr3783); 

                    match(input,23,FOLLOW_23_in_select_expr3784); 

                    match(input,16,FOLLOW_16_in_select_expr3785); 

                    match(input,30,FOLLOW_30_in_select_expr3786); 

                    match(input,46,FOLLOW_46_in_select_expr3787); 

                    match(input,17,FOLLOW_17_in_select_expr3788); 

                    match(input,43,FOLLOW_43_in_select_expr3789); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:184:58: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt221=2;
                    int LA221_0 = input.LA(1);

                    if ( (LA221_0==HOSTNAME) ) {
                        int LA221_1 = input.LA(2);

                        if ( (LA221_1==18) ) {
                            alt221=2;
                        }
                        else if ( (LA221_1==EOF) ) {
                            alt221=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 221, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 221, 0, input);

                        throw nvae;

                    }
                    switch (alt221) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:184:59: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3791); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:184:68: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:184:68: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:184:69: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:184:69: ( HOSTNAME ',' )+
                            int cnt220=0;
                            loop220:
                            do {
                                int alt220=2;
                                int LA220_0 = input.LA(1);

                                if ( (LA220_0==HOSTNAME) ) {
                                    int LA220_1 = input.LA(2);

                                    if ( (LA220_1==18) ) {
                                        alt220=1;
                                    }


                                }


                                switch (alt220) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:184:70: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3795); 

                            	    match(input,18,FOLLOW_18_in_select_expr3796); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt220 >= 1 ) break loop220;
                                        EarlyExitException eee =
                                            new EarlyExitException(220, input);
                                        throw eee;
                                }
                                cnt220++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3800); 

                            }


                            }
                            break;

                    }

                    //'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.SELECT_SUM_DATARATE_FROM_PSPRINGS_AST_ON_HOST;//Case 119
                    }
                    break;
                case 48 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:185:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr3808); 

                    match(input,56,FOLLOW_56_in_select_expr3809); 

                    match(input,15,FOLLOW_15_in_select_expr3810); 

                    match(input,23,FOLLOW_23_in_select_expr3811); 

                    match(input,16,FOLLOW_16_in_select_expr3812); 

                    match(input,30,FOLLOW_30_in_select_expr3813); 

                    match(input,46,FOLLOW_46_in_select_expr3814); 

                    match(input,17,FOLLOW_17_in_select_expr3815); 

                    match(input,42,FOLLOW_42_in_select_expr3816); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_select_expr3817); 

                    match(input,43,FOLLOW_43_in_select_expr3818); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:185:67: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt223=2;
                    int LA223_0 = input.LA(1);

                    if ( (LA223_0==HOSTNAME) ) {
                        int LA223_1 = input.LA(2);

                        if ( (LA223_1==18) ) {
                            alt223=2;
                        }
                        else if ( (LA223_1==EOF) ) {
                            alt223=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 223, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 223, 0, input);

                        throw nvae;

                    }
                    switch (alt223) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:185:68: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3820); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:185:77: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:185:77: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:185:78: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:185:78: ( HOSTNAME ',' )+
                            int cnt222=0;
                            loop222:
                            do {
                                int alt222=2;
                                int LA222_0 = input.LA(1);

                                if ( (LA222_0==HOSTNAME) ) {
                                    int LA222_1 = input.LA(2);

                                    if ( (LA222_1==18) ) {
                                        alt222=1;
                                    }


                                }


                                switch (alt222) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:185:79: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3824); 

                            	    match(input,18,FOLLOW_18_in_select_expr3825); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt222 >= 1 ) break loop222;
                                        EarlyExitException eee =
                                            new EarlyExitException(222, input);
                                        throw eee;
                                }
                                cnt222++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3829); 

                            }


                            }
                            break;

                    }

                    //'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.SELECT_SUM_DATARATE_FROM_PSPRINGS_AST_OF_VARNAME_ON_HOST;//Case 120
                    }
                    break;
                case 49 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:186:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr3837); 

                    match(input,56,FOLLOW_56_in_select_expr3838); 

                    match(input,15,FOLLOW_15_in_select_expr3839); 

                    match(input,23,FOLLOW_23_in_select_expr3840); 

                    match(input,16,FOLLOW_16_in_select_expr3841); 

                    match(input,30,FOLLOW_30_in_select_expr3842); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr3843); 

                    match(input,46,FOLLOW_46_in_select_expr3845); 

                    match(input,17,FOLLOW_17_in_select_expr3846); 

                    match(input,43,FOLLOW_43_in_select_expr3847); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:186:66: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt225=2;
                    int LA225_0 = input.LA(1);

                    if ( (LA225_0==HOSTNAME) ) {
                        int LA225_1 = input.LA(2);

                        if ( (LA225_1==18) ) {
                            alt225=2;
                        }
                        else if ( (LA225_1==EOF) ) {
                            alt225=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 225, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 225, 0, input);

                        throw nvae;

                    }
                    switch (alt225) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:186:67: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3849); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:186:76: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:186:76: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:186:77: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:186:77: ( HOSTNAME ',' )+
                            int cnt224=0;
                            loop224:
                            do {
                                int alt224=2;
                                int LA224_0 = input.LA(1);

                                if ( (LA224_0==HOSTNAME) ) {
                                    int LA224_1 = input.LA(2);

                                    if ( (LA224_1==18) ) {
                                        alt224=1;
                                    }


                                }


                                switch (alt224) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:186:78: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3853); 

                            	    match(input,18,FOLLOW_18_in_select_expr3854); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt224 >= 1 ) break loop224;
                                        EarlyExitException eee =
                                            new EarlyExitException(224, input);
                                        throw eee;
                                }
                                cnt224++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3858); 

                            }


                            }
                            break;

                    }

                    //'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.SELECT_SUM_DATARATE_FROM_PROTOCOL_PSPRINGS_AST_ON_HOST;//Case 121
                    }
                    break;
                case 50 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:187:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr3866); 

                    match(input,56,FOLLOW_56_in_select_expr3867); 

                    match(input,15,FOLLOW_15_in_select_expr3868); 

                    match(input,23,FOLLOW_23_in_select_expr3869); 

                    match(input,16,FOLLOW_16_in_select_expr3870); 

                    match(input,30,FOLLOW_30_in_select_expr3871); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr3872); 

                    match(input,46,FOLLOW_46_in_select_expr3874); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:187:59: ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) )
                    int alt227=2;
                    int LA227_0 = input.LA(1);

                    if ( (LA227_0==DIGIT||LA227_0==NUMBER) ) {
                        int LA227_1 = input.LA(2);

                        if ( (LA227_1==18) ) {
                            alt227=2;
                        }
                        else if ( (LA227_1==43) ) {
                            alt227=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 227, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 227, 0, input);

                        throw nvae;

                    }
                    switch (alt227) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:187:60: ( DIGIT | NUMBER )
                            {
                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:187:75: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:187:75: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:187:76: ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:187:76: ( ( DIGIT | NUMBER ) ',' )+
                            int cnt226=0;
                            loop226:
                            do {
                                int alt226=2;
                                int LA226_0 = input.LA(1);

                                if ( (LA226_0==DIGIT||LA226_0==NUMBER) ) {
                                    int LA226_1 = input.LA(2);

                                    if ( (LA226_1==18) ) {
                                        alt226=1;
                                    }


                                }


                                switch (alt226) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:187:77: ( DIGIT | NUMBER ) ','
                            	    {
                            	    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                            	        input.consume();
                            	        state.errorRecovery=false;
                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        throw mse;
                            	    }


                            	    match(input,18,FOLLOW_18_in_select_expr3889); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt226 >= 1 ) break loop226;
                                        EarlyExitException eee =
                                            new EarlyExitException(226, input);
                                        throw eee;
                                }
                                cnt226++;
                            } while (true);


                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }


                            }
                            break;

                    }


                    match(input,43,FOLLOW_43_in_select_expr3900); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:187:117: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt229=2;
                    int LA229_0 = input.LA(1);

                    if ( (LA229_0==HOSTNAME) ) {
                        int LA229_1 = input.LA(2);

                        if ( (LA229_1==18) ) {
                            alt229=2;
                        }
                        else if ( (LA229_1==EOF) ) {
                            alt229=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 229, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 229, 0, input);

                        throw nvae;

                    }
                    switch (alt229) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:187:118: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3902); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:187:127: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:187:127: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:187:128: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:187:128: ( HOSTNAME ',' )+
                            int cnt228=0;
                            loop228:
                            do {
                                int alt228=2;
                                int LA228_0 = input.LA(1);

                                if ( (LA228_0==HOSTNAME) ) {
                                    int LA228_1 = input.LA(2);

                                    if ( (LA228_1==18) ) {
                                        alt228=1;
                                    }


                                }


                                switch (alt228) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:187:129: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3906); 

                            	    match(input,18,FOLLOW_18_in_select_expr3907); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt228 >= 1 ) break loop228;
                                        EarlyExitException eee =
                                            new EarlyExitException(228, input);
                                        throw eee;
                                }
                                cnt228++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3911); 

                            }


                            }
                            break;

                    }

                    //'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    result = QueryResults.SELECT_SUM_DATARATE_FROM_PROTOCOL_PSPRINGS_N_ON_HOST;//Case 122
                    }
                    break;
                case 51 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:190:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSINKHOLES'
                    {
                    match(input,50,FOLLOW_50_in_select_expr3931); 

                    match(input,56,FOLLOW_56_in_select_expr3932); 

                    match(input,15,FOLLOW_15_in_select_expr3933); 

                    match(input,23,FOLLOW_23_in_select_expr3934); 

                    match(input,16,FOLLOW_16_in_select_expr3935); 

                    match(input,30,FOLLOW_30_in_select_expr3936); 

                    match(input,45,FOLLOW_45_in_select_expr3937); 

                    //'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSINKHOLES'
                    result = QueryResults.SELECT_SUM_DATARATE_FROM_PSINKHOLES; //Case 123
                    }
                    break;
                case 52 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:191:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSINKHOLES' '*' 'OF' VARNAME
                    {
                    match(input,50,FOLLOW_50_in_select_expr3946); 

                    match(input,56,FOLLOW_56_in_select_expr3947); 

                    match(input,15,FOLLOW_15_in_select_expr3948); 

                    match(input,23,FOLLOW_23_in_select_expr3949); 

                    match(input,16,FOLLOW_16_in_select_expr3950); 

                    match(input,30,FOLLOW_30_in_select_expr3951); 

                    match(input,45,FOLLOW_45_in_select_expr3952); 

                    match(input,17,FOLLOW_17_in_select_expr3953); 

                    match(input,42,FOLLOW_42_in_select_expr3954); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_select_expr3955); 

                    }
                    break;
                case 53 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:192:6: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr3963); 

                    match(input,56,FOLLOW_56_in_select_expr3964); 

                    match(input,15,FOLLOW_15_in_select_expr3965); 

                    match(input,23,FOLLOW_23_in_select_expr3966); 

                    match(input,16,FOLLOW_16_in_select_expr3967); 

                    match(input,30,FOLLOW_30_in_select_expr3968); 

                    match(input,45,FOLLOW_45_in_select_expr3969); 

                    match(input,17,FOLLOW_17_in_select_expr3970); 

                    match(input,43,FOLLOW_43_in_select_expr3971); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:192:60: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt231=2;
                    int LA231_0 = input.LA(1);

                    if ( (LA231_0==HOSTNAME) ) {
                        int LA231_1 = input.LA(2);

                        if ( (LA231_1==18) ) {
                            alt231=2;
                        }
                        else if ( (LA231_1==EOF) ) {
                            alt231=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 231, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 231, 0, input);

                        throw nvae;

                    }
                    switch (alt231) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:192:61: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3973); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:192:70: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:192:70: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:192:71: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:192:71: ( HOSTNAME ',' )+
                            int cnt230=0;
                            loop230:
                            do {
                                int alt230=2;
                                int LA230_0 = input.LA(1);

                                if ( (LA230_0==HOSTNAME) ) {
                                    int LA230_1 = input.LA(2);

                                    if ( (LA230_1==18) ) {
                                        alt230=1;
                                    }


                                }


                                switch (alt230) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:192:72: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3977); 

                            	    match(input,18,FOLLOW_18_in_select_expr3978); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt230 >= 1 ) break loop230;
                                        EarlyExitException eee =
                                            new EarlyExitException(230, input);
                                        throw eee;
                                }
                                cnt230++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr3982); 

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 54 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:193:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSINKHOLES' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr3990); 

                    match(input,56,FOLLOW_56_in_select_expr3991); 

                    match(input,15,FOLLOW_15_in_select_expr3992); 

                    match(input,23,FOLLOW_23_in_select_expr3993); 

                    match(input,16,FOLLOW_16_in_select_expr3994); 

                    match(input,30,FOLLOW_30_in_select_expr3995); 

                    match(input,45,FOLLOW_45_in_select_expr3996); 

                    match(input,17,FOLLOW_17_in_select_expr3997); 

                    match(input,42,FOLLOW_42_in_select_expr3998); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_select_expr3999); 

                    match(input,43,FOLLOW_43_in_select_expr4000); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:193:69: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt233=2;
                    int LA233_0 = input.LA(1);

                    if ( (LA233_0==HOSTNAME) ) {
                        int LA233_1 = input.LA(2);

                        if ( (LA233_1==18) ) {
                            alt233=2;
                        }
                        else if ( (LA233_1==EOF) ) {
                            alt233=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 233, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 233, 0, input);

                        throw nvae;

                    }
                    switch (alt233) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:193:70: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4002); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:193:79: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:193:79: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:193:80: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:193:80: ( HOSTNAME ',' )+
                            int cnt232=0;
                            loop232:
                            do {
                                int alt232=2;
                                int LA232_0 = input.LA(1);

                                if ( (LA232_0==HOSTNAME) ) {
                                    int LA232_1 = input.LA(2);

                                    if ( (LA232_1==18) ) {
                                        alt232=1;
                                    }


                                }


                                switch (alt232) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:193:81: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4006); 

                            	    match(input,18,FOLLOW_18_in_select_expr4007); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt232 >= 1 ) break loop232;
                                        EarlyExitException eee =
                                            new EarlyExitException(232, input);
                                        throw eee;
                                }
                                cnt232++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4011); 

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 55 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:194:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'PSINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr4019); 

                    match(input,56,FOLLOW_56_in_select_expr4020); 

                    match(input,15,FOLLOW_15_in_select_expr4021); 

                    match(input,23,FOLLOW_23_in_select_expr4022); 

                    match(input,16,FOLLOW_16_in_select_expr4023); 

                    match(input,30,FOLLOW_30_in_select_expr4024); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr4025); 

                    match(input,45,FOLLOW_45_in_select_expr4027); 

                    match(input,17,FOLLOW_17_in_select_expr4028); 

                    match(input,43,FOLLOW_43_in_select_expr4029); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:194:68: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt235=2;
                    int LA235_0 = input.LA(1);

                    if ( (LA235_0==HOSTNAME) ) {
                        int LA235_1 = input.LA(2);

                        if ( (LA235_1==18) ) {
                            alt235=2;
                        }
                        else if ( (LA235_1==EOF) ) {
                            alt235=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 235, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 235, 0, input);

                        throw nvae;

                    }
                    switch (alt235) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:194:69: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4031); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:194:78: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:194:78: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:194:79: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:194:79: ( HOSTNAME ',' )+
                            int cnt234=0;
                            loop234:
                            do {
                                int alt234=2;
                                int LA234_0 = input.LA(1);

                                if ( (LA234_0==HOSTNAME) ) {
                                    int LA234_1 = input.LA(2);

                                    if ( (LA234_1==18) ) {
                                        alt234=1;
                                    }


                                }


                                switch (alt234) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:194:80: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4035); 

                            	    match(input,18,FOLLOW_18_in_select_expr4036); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt234 >= 1 ) break loop234;
                                        EarlyExitException eee =
                                            new EarlyExitException(234, input);
                                        throw eee;
                                }
                                cnt234++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4040); 

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 56 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:195:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'PSINKHOLES' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr4048); 

                    match(input,56,FOLLOW_56_in_select_expr4049); 

                    match(input,15,FOLLOW_15_in_select_expr4050); 

                    match(input,23,FOLLOW_23_in_select_expr4051); 

                    match(input,16,FOLLOW_16_in_select_expr4052); 

                    match(input,30,FOLLOW_30_in_select_expr4053); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr4054); 

                    match(input,45,FOLLOW_45_in_select_expr4056); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:195:61: ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) )
                    int alt237=2;
                    int LA237_0 = input.LA(1);

                    if ( (LA237_0==DIGIT||LA237_0==NUMBER) ) {
                        int LA237_1 = input.LA(2);

                        if ( (LA237_1==18) ) {
                            alt237=2;
                        }
                        else if ( (LA237_1==43) ) {
                            alt237=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 237, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 237, 0, input);

                        throw nvae;

                    }
                    switch (alt237) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:195:62: ( DIGIT | NUMBER )
                            {
                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:195:77: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:195:77: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:195:78: ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:195:78: ( ( DIGIT | NUMBER ) ',' )+
                            int cnt236=0;
                            loop236:
                            do {
                                int alt236=2;
                                int LA236_0 = input.LA(1);

                                if ( (LA236_0==DIGIT||LA236_0==NUMBER) ) {
                                    int LA236_1 = input.LA(2);

                                    if ( (LA236_1==18) ) {
                                        alt236=1;
                                    }


                                }


                                switch (alt236) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:195:79: ( DIGIT | NUMBER ) ','
                            	    {
                            	    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                            	        input.consume();
                            	        state.errorRecovery=false;
                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        throw mse;
                            	    }


                            	    match(input,18,FOLLOW_18_in_select_expr4071); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt236 >= 1 ) break loop236;
                                        EarlyExitException eee =
                                            new EarlyExitException(236, input);
                                        throw eee;
                                }
                                cnt236++;
                            } while (true);


                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }


                            }
                            break;

                    }


                    match(input,43,FOLLOW_43_in_select_expr4082); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:195:119: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt239=2;
                    int LA239_0 = input.LA(1);

                    if ( (LA239_0==HOSTNAME) ) {
                        int LA239_1 = input.LA(2);

                        if ( (LA239_1==18) ) {
                            alt239=2;
                        }
                        else if ( (LA239_1==EOF) ) {
                            alt239=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 239, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 239, 0, input);

                        throw nvae;

                    }
                    switch (alt239) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:195:120: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4084); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:195:129: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:195:129: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:195:130: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:195:130: ( HOSTNAME ',' )+
                            int cnt238=0;
                            loop238:
                            do {
                                int alt238=2;
                                int LA238_0 = input.LA(1);

                                if ( (LA238_0==HOSTNAME) ) {
                                    int LA238_1 = input.LA(2);

                                    if ( (LA238_1==18) ) {
                                        alt238=1;
                                    }


                                }


                                switch (alt238) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:195:131: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4088); 

                            	    match(input,18,FOLLOW_18_in_select_expr4089); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt238 >= 1 ) break loop238;
                                        EarlyExitException eee =
                                            new EarlyExitException(238, input);
                                        throw eee;
                                }
                                cnt238++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4093); 

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 57 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:199:4: 'SELECT' '*' PROTOCOLS 'ESPRINGS'
                    {
                    match(input,50,FOLLOW_50_in_select_expr4110); 

                    match(input,17,FOLLOW_17_in_select_expr4111); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr4113); 

                    match(input,26,FOLLOW_26_in_select_expr4115); 

                    }
                    break;
                case 58 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:200:4: 'SELECT' ( DIGIT | NUMBER ) PROTOCOLS 'ESPRINGS'
                    {
                    match(input,50,FOLLOW_50_in_select_expr4121); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr4128); 

                    match(input,26,FOLLOW_26_in_select_expr4130); 

                    }
                    break;
                case 59 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:203:4: 'SELECT' 'DATARATE' 'FROM' 'ESPRINGS'
                    {
                    match(input,50,FOLLOW_50_in_select_expr4145); 

                    match(input,23,FOLLOW_23_in_select_expr4146); 

                    match(input,30,FOLLOW_30_in_select_expr4147); 

                    match(input,26,FOLLOW_26_in_select_expr4148); 

                    }
                    break;
                case 60 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:204:4: 'SELECT' 'DATARATE' 'FROM' 'ESPRINGS' '*' 'OF' VARNAME
                    {
                    match(input,50,FOLLOW_50_in_select_expr4157); 

                    match(input,23,FOLLOW_23_in_select_expr4158); 

                    match(input,30,FOLLOW_30_in_select_expr4159); 

                    match(input,26,FOLLOW_26_in_select_expr4160); 

                    match(input,17,FOLLOW_17_in_select_expr4161); 

                    match(input,42,FOLLOW_42_in_select_expr4162); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_select_expr4163); 

                    }
                    break;
                case 61 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:205:6: 'SELECT' 'DATARATE' 'FROM' 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr4171); 

                    match(input,23,FOLLOW_23_in_select_expr4172); 

                    match(input,30,FOLLOW_30_in_select_expr4173); 

                    match(input,26,FOLLOW_26_in_select_expr4174); 

                    match(input,17,FOLLOW_17_in_select_expr4175); 

                    match(input,43,FOLLOW_43_in_select_expr4176); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:205:47: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt241=2;
                    int LA241_0 = input.LA(1);

                    if ( (LA241_0==HOSTNAME) ) {
                        int LA241_1 = input.LA(2);

                        if ( (LA241_1==18) ) {
                            alt241=2;
                        }
                        else if ( (LA241_1==EOF) ) {
                            alt241=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 241, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 241, 0, input);

                        throw nvae;

                    }
                    switch (alt241) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:205:48: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4178); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:205:57: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:205:57: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:205:58: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:205:58: ( HOSTNAME ',' )+
                            int cnt240=0;
                            loop240:
                            do {
                                int alt240=2;
                                int LA240_0 = input.LA(1);

                                if ( (LA240_0==HOSTNAME) ) {
                                    int LA240_1 = input.LA(2);

                                    if ( (LA240_1==18) ) {
                                        alt240=1;
                                    }


                                }


                                switch (alt240) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:205:59: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4182); 

                            	    match(input,18,FOLLOW_18_in_select_expr4183); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt240 >= 1 ) break loop240;
                                        EarlyExitException eee =
                                            new EarlyExitException(240, input);
                                        throw eee;
                                }
                                cnt240++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4187); 

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 62 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:206:4: 'SELECT' 'DATARATE' 'FROM' 'ESPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr4195); 

                    match(input,23,FOLLOW_23_in_select_expr4196); 

                    match(input,30,FOLLOW_30_in_select_expr4197); 

                    match(input,26,FOLLOW_26_in_select_expr4198); 

                    match(input,17,FOLLOW_17_in_select_expr4199); 

                    match(input,42,FOLLOW_42_in_select_expr4200); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_select_expr4201); 

                    match(input,43,FOLLOW_43_in_select_expr4202); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:206:56: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt243=2;
                    int LA243_0 = input.LA(1);

                    if ( (LA243_0==HOSTNAME) ) {
                        int LA243_1 = input.LA(2);

                        if ( (LA243_1==18) ) {
                            alt243=2;
                        }
                        else if ( (LA243_1==EOF) ) {
                            alt243=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 243, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 243, 0, input);

                        throw nvae;

                    }
                    switch (alt243) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:206:57: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4204); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:206:66: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:206:66: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:206:67: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:206:67: ( HOSTNAME ',' )+
                            int cnt242=0;
                            loop242:
                            do {
                                int alt242=2;
                                int LA242_0 = input.LA(1);

                                if ( (LA242_0==HOSTNAME) ) {
                                    int LA242_1 = input.LA(2);

                                    if ( (LA242_1==18) ) {
                                        alt242=1;
                                    }


                                }


                                switch (alt242) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:206:68: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4208); 

                            	    match(input,18,FOLLOW_18_in_select_expr4209); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt242 >= 1 ) break loop242;
                                        EarlyExitException eee =
                                            new EarlyExitException(242, input);
                                        throw eee;
                                }
                                cnt242++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4213); 

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 63 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:207:4: 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr4221); 

                    match(input,23,FOLLOW_23_in_select_expr4222); 

                    match(input,30,FOLLOW_30_in_select_expr4223); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr4224); 

                    match(input,26,FOLLOW_26_in_select_expr4226); 

                    match(input,17,FOLLOW_17_in_select_expr4227); 

                    match(input,43,FOLLOW_43_in_select_expr4228); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:207:55: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt245=2;
                    int LA245_0 = input.LA(1);

                    if ( (LA245_0==HOSTNAME) ) {
                        int LA245_1 = input.LA(2);

                        if ( (LA245_1==18) ) {
                            alt245=2;
                        }
                        else if ( (LA245_1==EOF) ) {
                            alt245=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 245, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 245, 0, input);

                        throw nvae;

                    }
                    switch (alt245) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:207:56: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4230); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:207:65: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:207:65: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:207:66: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:207:66: ( HOSTNAME ',' )+
                            int cnt244=0;
                            loop244:
                            do {
                                int alt244=2;
                                int LA244_0 = input.LA(1);

                                if ( (LA244_0==HOSTNAME) ) {
                                    int LA244_1 = input.LA(2);

                                    if ( (LA244_1==18) ) {
                                        alt244=1;
                                    }


                                }


                                switch (alt244) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:207:67: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4234); 

                            	    match(input,18,FOLLOW_18_in_select_expr4235); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt244 >= 1 ) break loop244;
                                        EarlyExitException eee =
                                            new EarlyExitException(244, input);
                                        throw eee;
                                }
                                cnt244++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4239); 

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 64 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:208:4: 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'ESPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr4247); 

                    match(input,23,FOLLOW_23_in_select_expr4248); 

                    match(input,30,FOLLOW_30_in_select_expr4249); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr4250); 

                    match(input,26,FOLLOW_26_in_select_expr4252); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:208:48: ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) )
                    int alt247=2;
                    int LA247_0 = input.LA(1);

                    if ( (LA247_0==DIGIT||LA247_0==NUMBER) ) {
                        int LA247_1 = input.LA(2);

                        if ( (LA247_1==18) ) {
                            alt247=2;
                        }
                        else if ( (LA247_1==43) ) {
                            alt247=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 247, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 247, 0, input);

                        throw nvae;

                    }
                    switch (alt247) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:208:49: ( DIGIT | NUMBER )
                            {
                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:208:64: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:208:64: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:208:65: ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:208:65: ( ( DIGIT | NUMBER ) ',' )+
                            int cnt246=0;
                            loop246:
                            do {
                                int alt246=2;
                                int LA246_0 = input.LA(1);

                                if ( (LA246_0==DIGIT||LA246_0==NUMBER) ) {
                                    int LA246_1 = input.LA(2);

                                    if ( (LA246_1==18) ) {
                                        alt246=1;
                                    }


                                }


                                switch (alt246) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:208:66: ( DIGIT | NUMBER ) ','
                            	    {
                            	    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                            	        input.consume();
                            	        state.errorRecovery=false;
                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        throw mse;
                            	    }


                            	    match(input,18,FOLLOW_18_in_select_expr4267); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt246 >= 1 ) break loop246;
                                        EarlyExitException eee =
                                            new EarlyExitException(246, input);
                                        throw eee;
                                }
                                cnt246++;
                            } while (true);


                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }


                            }
                            break;

                    }


                    match(input,43,FOLLOW_43_in_select_expr4278); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:208:106: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt249=2;
                    int LA249_0 = input.LA(1);

                    if ( (LA249_0==HOSTNAME) ) {
                        int LA249_1 = input.LA(2);

                        if ( (LA249_1==18) ) {
                            alt249=2;
                        }
                        else if ( (LA249_1==EOF) ) {
                            alt249=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 249, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 249, 0, input);

                        throw nvae;

                    }
                    switch (alt249) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:208:107: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4280); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:208:116: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:208:116: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:208:117: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:208:117: ( HOSTNAME ',' )+
                            int cnt248=0;
                            loop248:
                            do {
                                int alt248=2;
                                int LA248_0 = input.LA(1);

                                if ( (LA248_0==HOSTNAME) ) {
                                    int LA248_1 = input.LA(2);

                                    if ( (LA248_1==18) ) {
                                        alt248=1;
                                    }


                                }


                                switch (alt248) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:208:118: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4284); 

                            	    match(input,18,FOLLOW_18_in_select_expr4285); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt248 >= 1 ) break loop248;
                                        EarlyExitException eee =
                                            new EarlyExitException(248, input);
                                        throw eee;
                                }
                                cnt248++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4289); 

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 65 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:211:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'ESPRINGS'
                    {
                    match(input,50,FOLLOW_50_in_select_expr4304); 

                    match(input,56,FOLLOW_56_in_select_expr4305); 

                    match(input,15,FOLLOW_15_in_select_expr4306); 

                    match(input,23,FOLLOW_23_in_select_expr4307); 

                    match(input,16,FOLLOW_16_in_select_expr4308); 

                    match(input,30,FOLLOW_30_in_select_expr4309); 

                    match(input,26,FOLLOW_26_in_select_expr4310); 

                    }
                    break;
                case 66 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:212:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'ESPRINGS' '*' 'OF' VARNAME
                    {
                    match(input,50,FOLLOW_50_in_select_expr4319); 

                    match(input,56,FOLLOW_56_in_select_expr4320); 

                    match(input,15,FOLLOW_15_in_select_expr4321); 

                    match(input,23,FOLLOW_23_in_select_expr4322); 

                    match(input,16,FOLLOW_16_in_select_expr4323); 

                    match(input,30,FOLLOW_30_in_select_expr4324); 

                    match(input,26,FOLLOW_26_in_select_expr4325); 

                    match(input,17,FOLLOW_17_in_select_expr4326); 

                    match(input,42,FOLLOW_42_in_select_expr4327); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_select_expr4328); 

                    }
                    break;
                case 67 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:213:6: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr4336); 

                    match(input,56,FOLLOW_56_in_select_expr4337); 

                    match(input,15,FOLLOW_15_in_select_expr4338); 

                    match(input,23,FOLLOW_23_in_select_expr4339); 

                    match(input,16,FOLLOW_16_in_select_expr4340); 

                    match(input,30,FOLLOW_30_in_select_expr4341); 

                    match(input,26,FOLLOW_26_in_select_expr4342); 

                    match(input,17,FOLLOW_17_in_select_expr4343); 

                    match(input,43,FOLLOW_43_in_select_expr4344); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:213:58: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt251=2;
                    int LA251_0 = input.LA(1);

                    if ( (LA251_0==HOSTNAME) ) {
                        int LA251_1 = input.LA(2);

                        if ( (LA251_1==18) ) {
                            alt251=2;
                        }
                        else if ( (LA251_1==EOF) ) {
                            alt251=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 251, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 251, 0, input);

                        throw nvae;

                    }
                    switch (alt251) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:213:59: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4346); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:213:68: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:213:68: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:213:69: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:213:69: ( HOSTNAME ',' )+
                            int cnt250=0;
                            loop250:
                            do {
                                int alt250=2;
                                int LA250_0 = input.LA(1);

                                if ( (LA250_0==HOSTNAME) ) {
                                    int LA250_1 = input.LA(2);

                                    if ( (LA250_1==18) ) {
                                        alt250=1;
                                    }


                                }


                                switch (alt250) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:213:70: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4350); 

                            	    match(input,18,FOLLOW_18_in_select_expr4351); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt250 >= 1 ) break loop250;
                                        EarlyExitException eee =
                                            new EarlyExitException(250, input);
                                        throw eee;
                                }
                                cnt250++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4355); 

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 68 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:214:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'ESPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr4363); 

                    match(input,56,FOLLOW_56_in_select_expr4364); 

                    match(input,15,FOLLOW_15_in_select_expr4365); 

                    match(input,23,FOLLOW_23_in_select_expr4366); 

                    match(input,16,FOLLOW_16_in_select_expr4367); 

                    match(input,30,FOLLOW_30_in_select_expr4368); 

                    match(input,26,FOLLOW_26_in_select_expr4369); 

                    match(input,17,FOLLOW_17_in_select_expr4370); 

                    match(input,42,FOLLOW_42_in_select_expr4371); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_select_expr4372); 

                    match(input,43,FOLLOW_43_in_select_expr4373); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:214:67: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt253=2;
                    int LA253_0 = input.LA(1);

                    if ( (LA253_0==HOSTNAME) ) {
                        int LA253_1 = input.LA(2);

                        if ( (LA253_1==18) ) {
                            alt253=2;
                        }
                        else if ( (LA253_1==EOF) ) {
                            alt253=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 253, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 253, 0, input);

                        throw nvae;

                    }
                    switch (alt253) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:214:68: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4375); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:214:77: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:214:77: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:214:78: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:214:78: ( HOSTNAME ',' )+
                            int cnt252=0;
                            loop252:
                            do {
                                int alt252=2;
                                int LA252_0 = input.LA(1);

                                if ( (LA252_0==HOSTNAME) ) {
                                    int LA252_1 = input.LA(2);

                                    if ( (LA252_1==18) ) {
                                        alt252=1;
                                    }


                                }


                                switch (alt252) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:214:79: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4379); 

                            	    match(input,18,FOLLOW_18_in_select_expr4380); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt252 >= 1 ) break loop252;
                                        EarlyExitException eee =
                                            new EarlyExitException(252, input);
                                        throw eee;
                                }
                                cnt252++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4384); 

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 69 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:215:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr4392); 

                    match(input,56,FOLLOW_56_in_select_expr4393); 

                    match(input,15,FOLLOW_15_in_select_expr4394); 

                    match(input,23,FOLLOW_23_in_select_expr4395); 

                    match(input,16,FOLLOW_16_in_select_expr4396); 

                    match(input,30,FOLLOW_30_in_select_expr4397); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr4398); 

                    match(input,26,FOLLOW_26_in_select_expr4400); 

                    match(input,17,FOLLOW_17_in_select_expr4401); 

                    match(input,43,FOLLOW_43_in_select_expr4402); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:215:66: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt255=2;
                    int LA255_0 = input.LA(1);

                    if ( (LA255_0==HOSTNAME) ) {
                        int LA255_1 = input.LA(2);

                        if ( (LA255_1==18) ) {
                            alt255=2;
                        }
                        else if ( (LA255_1==EOF) ) {
                            alt255=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 255, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 255, 0, input);

                        throw nvae;

                    }
                    switch (alt255) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:215:67: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4404); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:215:76: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:215:76: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:215:77: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:215:77: ( HOSTNAME ',' )+
                            int cnt254=0;
                            loop254:
                            do {
                                int alt254=2;
                                int LA254_0 = input.LA(1);

                                if ( (LA254_0==HOSTNAME) ) {
                                    int LA254_1 = input.LA(2);

                                    if ( (LA254_1==18) ) {
                                        alt254=1;
                                    }


                                }


                                switch (alt254) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:215:78: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4408); 

                            	    match(input,18,FOLLOW_18_in_select_expr4409); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt254 >= 1 ) break loop254;
                                        EarlyExitException eee =
                                            new EarlyExitException(254, input);
                                        throw eee;
                                }
                                cnt254++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4413); 

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 70 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:216:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'ESPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr4421); 

                    match(input,56,FOLLOW_56_in_select_expr4422); 

                    match(input,15,FOLLOW_15_in_select_expr4423); 

                    match(input,23,FOLLOW_23_in_select_expr4424); 

                    match(input,16,FOLLOW_16_in_select_expr4425); 

                    match(input,30,FOLLOW_30_in_select_expr4426); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr4427); 

                    match(input,26,FOLLOW_26_in_select_expr4429); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:216:59: ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) )
                    int alt257=2;
                    int LA257_0 = input.LA(1);

                    if ( (LA257_0==DIGIT||LA257_0==NUMBER) ) {
                        int LA257_1 = input.LA(2);

                        if ( (LA257_1==18) ) {
                            alt257=2;
                        }
                        else if ( (LA257_1==43) ) {
                            alt257=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 257, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 257, 0, input);

                        throw nvae;

                    }
                    switch (alt257) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:216:60: ( DIGIT | NUMBER )
                            {
                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:216:75: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:216:75: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:216:76: ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:216:76: ( ( DIGIT | NUMBER ) ',' )+
                            int cnt256=0;
                            loop256:
                            do {
                                int alt256=2;
                                int LA256_0 = input.LA(1);

                                if ( (LA256_0==DIGIT||LA256_0==NUMBER) ) {
                                    int LA256_1 = input.LA(2);

                                    if ( (LA256_1==18) ) {
                                        alt256=1;
                                    }


                                }


                                switch (alt256) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:216:77: ( DIGIT | NUMBER ) ','
                            	    {
                            	    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                            	        input.consume();
                            	        state.errorRecovery=false;
                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        throw mse;
                            	    }


                            	    match(input,18,FOLLOW_18_in_select_expr4444); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt256 >= 1 ) break loop256;
                                        EarlyExitException eee =
                                            new EarlyExitException(256, input);
                                        throw eee;
                                }
                                cnt256++;
                            } while (true);


                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }


                            }
                            break;

                    }


                    match(input,43,FOLLOW_43_in_select_expr4455); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:216:117: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt259=2;
                    int LA259_0 = input.LA(1);

                    if ( (LA259_0==HOSTNAME) ) {
                        int LA259_1 = input.LA(2);

                        if ( (LA259_1==18) ) {
                            alt259=2;
                        }
                        else if ( (LA259_1==EOF) ) {
                            alt259=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 259, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 259, 0, input);

                        throw nvae;

                    }
                    switch (alt259) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:216:118: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4457); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:216:127: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:216:127: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:216:128: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:216:128: ( HOSTNAME ',' )+
                            int cnt258=0;
                            loop258:
                            do {
                                int alt258=2;
                                int LA258_0 = input.LA(1);

                                if ( (LA258_0==HOSTNAME) ) {
                                    int LA258_1 = input.LA(2);

                                    if ( (LA258_1==18) ) {
                                        alt258=1;
                                    }


                                }


                                switch (alt258) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:216:129: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4461); 

                            	    match(input,18,FOLLOW_18_in_select_expr4462); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt258 >= 1 ) break loop258;
                                        EarlyExitException eee =
                                            new EarlyExitException(258, input);
                                        throw eee;
                                }
                                cnt258++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4466); 

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 71 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:220:4: 'SELECT' '*' PROTOCOLS 'GSPRINGS'
                    {
                    match(input,50,FOLLOW_50_in_select_expr4483); 

                    match(input,17,FOLLOW_17_in_select_expr4484); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr4486); 

                    match(input,31,FOLLOW_31_in_select_expr4488); 

                    }
                    break;
                case 72 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:221:4: 'SELECT' ( DIGIT | NUMBER ) PROTOCOLS 'GSPRINGS'
                    {
                    match(input,50,FOLLOW_50_in_select_expr4494); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr4501); 

                    match(input,31,FOLLOW_31_in_select_expr4503); 

                    }
                    break;
                case 73 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:224:4: 'SELECT' 'DATARATE' 'FROM' 'GSPRINGS'
                    {
                    match(input,50,FOLLOW_50_in_select_expr4518); 

                    match(input,23,FOLLOW_23_in_select_expr4519); 

                    match(input,30,FOLLOW_30_in_select_expr4520); 

                    match(input,31,FOLLOW_31_in_select_expr4521); 

                    }
                    break;
                case 74 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:225:4: 'SELECT' 'DATARATE' 'FROM' 'GSPRINGS' '*' 'OF' VARNAME
                    {
                    match(input,50,FOLLOW_50_in_select_expr4530); 

                    match(input,23,FOLLOW_23_in_select_expr4531); 

                    match(input,30,FOLLOW_30_in_select_expr4532); 

                    match(input,31,FOLLOW_31_in_select_expr4533); 

                    match(input,17,FOLLOW_17_in_select_expr4534); 

                    match(input,42,FOLLOW_42_in_select_expr4535); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_select_expr4536); 

                    }
                    break;
                case 75 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:226:6: 'SELECT' 'DATARATE' 'FROM' 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr4544); 

                    match(input,23,FOLLOW_23_in_select_expr4545); 

                    match(input,30,FOLLOW_30_in_select_expr4546); 

                    match(input,31,FOLLOW_31_in_select_expr4547); 

                    match(input,17,FOLLOW_17_in_select_expr4548); 

                    match(input,43,FOLLOW_43_in_select_expr4549); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:226:47: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt261=2;
                    int LA261_0 = input.LA(1);

                    if ( (LA261_0==HOSTNAME) ) {
                        int LA261_1 = input.LA(2);

                        if ( (LA261_1==18) ) {
                            alt261=2;
                        }
                        else if ( (LA261_1==EOF) ) {
                            alt261=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 261, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 261, 0, input);

                        throw nvae;

                    }
                    switch (alt261) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:226:48: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4551); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:226:57: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:226:57: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:226:58: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:226:58: ( HOSTNAME ',' )+
                            int cnt260=0;
                            loop260:
                            do {
                                int alt260=2;
                                int LA260_0 = input.LA(1);

                                if ( (LA260_0==HOSTNAME) ) {
                                    int LA260_1 = input.LA(2);

                                    if ( (LA260_1==18) ) {
                                        alt260=1;
                                    }


                                }


                                switch (alt260) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:226:59: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4555); 

                            	    match(input,18,FOLLOW_18_in_select_expr4556); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt260 >= 1 ) break loop260;
                                        EarlyExitException eee =
                                            new EarlyExitException(260, input);
                                        throw eee;
                                }
                                cnt260++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4560); 

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 76 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:227:4: 'SELECT' 'DATARATE' 'FROM' 'GSPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr4568); 

                    match(input,23,FOLLOW_23_in_select_expr4569); 

                    match(input,30,FOLLOW_30_in_select_expr4570); 

                    match(input,31,FOLLOW_31_in_select_expr4571); 

                    match(input,17,FOLLOW_17_in_select_expr4572); 

                    match(input,42,FOLLOW_42_in_select_expr4573); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_select_expr4574); 

                    match(input,43,FOLLOW_43_in_select_expr4575); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:227:56: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt263=2;
                    int LA263_0 = input.LA(1);

                    if ( (LA263_0==HOSTNAME) ) {
                        int LA263_1 = input.LA(2);

                        if ( (LA263_1==18) ) {
                            alt263=2;
                        }
                        else if ( (LA263_1==EOF) ) {
                            alt263=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 263, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 263, 0, input);

                        throw nvae;

                    }
                    switch (alt263) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:227:57: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4577); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:227:66: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:227:66: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:227:67: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:227:67: ( HOSTNAME ',' )+
                            int cnt262=0;
                            loop262:
                            do {
                                int alt262=2;
                                int LA262_0 = input.LA(1);

                                if ( (LA262_0==HOSTNAME) ) {
                                    int LA262_1 = input.LA(2);

                                    if ( (LA262_1==18) ) {
                                        alt262=1;
                                    }


                                }


                                switch (alt262) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:227:68: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4581); 

                            	    match(input,18,FOLLOW_18_in_select_expr4582); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt262 >= 1 ) break loop262;
                                        EarlyExitException eee =
                                            new EarlyExitException(262, input);
                                        throw eee;
                                }
                                cnt262++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4586); 

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 77 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:228:4: 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr4594); 

                    match(input,23,FOLLOW_23_in_select_expr4595); 

                    match(input,30,FOLLOW_30_in_select_expr4596); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr4597); 

                    match(input,31,FOLLOW_31_in_select_expr4599); 

                    match(input,17,FOLLOW_17_in_select_expr4600); 

                    match(input,43,FOLLOW_43_in_select_expr4601); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:228:55: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt265=2;
                    int LA265_0 = input.LA(1);

                    if ( (LA265_0==HOSTNAME) ) {
                        int LA265_1 = input.LA(2);

                        if ( (LA265_1==18) ) {
                            alt265=2;
                        }
                        else if ( (LA265_1==EOF) ) {
                            alt265=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 265, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 265, 0, input);

                        throw nvae;

                    }
                    switch (alt265) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:228:56: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4603); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:228:65: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:228:65: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:228:66: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:228:66: ( HOSTNAME ',' )+
                            int cnt264=0;
                            loop264:
                            do {
                                int alt264=2;
                                int LA264_0 = input.LA(1);

                                if ( (LA264_0==HOSTNAME) ) {
                                    int LA264_1 = input.LA(2);

                                    if ( (LA264_1==18) ) {
                                        alt264=1;
                                    }


                                }


                                switch (alt264) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:228:67: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4607); 

                            	    match(input,18,FOLLOW_18_in_select_expr4608); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt264 >= 1 ) break loop264;
                                        EarlyExitException eee =
                                            new EarlyExitException(264, input);
                                        throw eee;
                                }
                                cnt264++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4612); 

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 78 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:229:4: 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'GSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr4620); 

                    match(input,23,FOLLOW_23_in_select_expr4621); 

                    match(input,30,FOLLOW_30_in_select_expr4622); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr4623); 

                    match(input,31,FOLLOW_31_in_select_expr4625); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:229:48: ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) )
                    int alt267=2;
                    int LA267_0 = input.LA(1);

                    if ( (LA267_0==DIGIT||LA267_0==NUMBER) ) {
                        int LA267_1 = input.LA(2);

                        if ( (LA267_1==18) ) {
                            alt267=2;
                        }
                        else if ( (LA267_1==43) ) {
                            alt267=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 267, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 267, 0, input);

                        throw nvae;

                    }
                    switch (alt267) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:229:49: ( DIGIT | NUMBER )
                            {
                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:229:64: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:229:64: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:229:65: ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:229:65: ( ( DIGIT | NUMBER ) ',' )+
                            int cnt266=0;
                            loop266:
                            do {
                                int alt266=2;
                                int LA266_0 = input.LA(1);

                                if ( (LA266_0==DIGIT||LA266_0==NUMBER) ) {
                                    int LA266_1 = input.LA(2);

                                    if ( (LA266_1==18) ) {
                                        alt266=1;
                                    }


                                }


                                switch (alt266) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:229:66: ( DIGIT | NUMBER ) ','
                            	    {
                            	    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                            	        input.consume();
                            	        state.errorRecovery=false;
                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        throw mse;
                            	    }


                            	    match(input,18,FOLLOW_18_in_select_expr4640); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt266 >= 1 ) break loop266;
                                        EarlyExitException eee =
                                            new EarlyExitException(266, input);
                                        throw eee;
                                }
                                cnt266++;
                            } while (true);


                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }


                            }
                            break;

                    }


                    match(input,43,FOLLOW_43_in_select_expr4651); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:229:106: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt269=2;
                    int LA269_0 = input.LA(1);

                    if ( (LA269_0==HOSTNAME) ) {
                        int LA269_1 = input.LA(2);

                        if ( (LA269_1==18) ) {
                            alt269=2;
                        }
                        else if ( (LA269_1==EOF) ) {
                            alt269=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 269, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 269, 0, input);

                        throw nvae;

                    }
                    switch (alt269) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:229:107: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4653); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:229:116: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:229:116: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:229:117: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:229:117: ( HOSTNAME ',' )+
                            int cnt268=0;
                            loop268:
                            do {
                                int alt268=2;
                                int LA268_0 = input.LA(1);

                                if ( (LA268_0==HOSTNAME) ) {
                                    int LA268_1 = input.LA(2);

                                    if ( (LA268_1==18) ) {
                                        alt268=1;
                                    }


                                }


                                switch (alt268) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:229:118: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4657); 

                            	    match(input,18,FOLLOW_18_in_select_expr4658); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt268 >= 1 ) break loop268;
                                        EarlyExitException eee =
                                            new EarlyExitException(268, input);
                                        throw eee;
                                }
                                cnt268++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4662); 

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 79 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:232:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'GSPRINGS'
                    {
                    match(input,50,FOLLOW_50_in_select_expr4677); 

                    match(input,56,FOLLOW_56_in_select_expr4678); 

                    match(input,15,FOLLOW_15_in_select_expr4679); 

                    match(input,23,FOLLOW_23_in_select_expr4680); 

                    match(input,16,FOLLOW_16_in_select_expr4681); 

                    match(input,30,FOLLOW_30_in_select_expr4682); 

                    match(input,31,FOLLOW_31_in_select_expr4683); 

                    }
                    break;
                case 80 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:233:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'GSPRINGS' '*' 'OF' VARNAME
                    {
                    match(input,50,FOLLOW_50_in_select_expr4692); 

                    match(input,56,FOLLOW_56_in_select_expr4693); 

                    match(input,15,FOLLOW_15_in_select_expr4694); 

                    match(input,23,FOLLOW_23_in_select_expr4695); 

                    match(input,16,FOLLOW_16_in_select_expr4696); 

                    match(input,30,FOLLOW_30_in_select_expr4697); 

                    match(input,31,FOLLOW_31_in_select_expr4698); 

                    match(input,17,FOLLOW_17_in_select_expr4699); 

                    match(input,42,FOLLOW_42_in_select_expr4700); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_select_expr4701); 

                    }
                    break;
                case 81 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:234:6: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr4709); 

                    match(input,56,FOLLOW_56_in_select_expr4710); 

                    match(input,15,FOLLOW_15_in_select_expr4711); 

                    match(input,23,FOLLOW_23_in_select_expr4712); 

                    match(input,16,FOLLOW_16_in_select_expr4713); 

                    match(input,30,FOLLOW_30_in_select_expr4714); 

                    match(input,31,FOLLOW_31_in_select_expr4715); 

                    match(input,17,FOLLOW_17_in_select_expr4716); 

                    match(input,43,FOLLOW_43_in_select_expr4717); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:234:58: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt271=2;
                    int LA271_0 = input.LA(1);

                    if ( (LA271_0==HOSTNAME) ) {
                        int LA271_1 = input.LA(2);

                        if ( (LA271_1==18) ) {
                            alt271=2;
                        }
                        else if ( (LA271_1==EOF) ) {
                            alt271=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 271, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 271, 0, input);

                        throw nvae;

                    }
                    switch (alt271) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:234:59: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4719); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:234:68: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:234:68: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:234:69: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:234:69: ( HOSTNAME ',' )+
                            int cnt270=0;
                            loop270:
                            do {
                                int alt270=2;
                                int LA270_0 = input.LA(1);

                                if ( (LA270_0==HOSTNAME) ) {
                                    int LA270_1 = input.LA(2);

                                    if ( (LA270_1==18) ) {
                                        alt270=1;
                                    }


                                }


                                switch (alt270) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:234:70: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4723); 

                            	    match(input,18,FOLLOW_18_in_select_expr4724); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt270 >= 1 ) break loop270;
                                        EarlyExitException eee =
                                            new EarlyExitException(270, input);
                                        throw eee;
                                }
                                cnt270++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4728); 

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 82 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:235:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'GSPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr4736); 

                    match(input,56,FOLLOW_56_in_select_expr4737); 

                    match(input,15,FOLLOW_15_in_select_expr4738); 

                    match(input,23,FOLLOW_23_in_select_expr4739); 

                    match(input,16,FOLLOW_16_in_select_expr4740); 

                    match(input,30,FOLLOW_30_in_select_expr4741); 

                    match(input,31,FOLLOW_31_in_select_expr4742); 

                    match(input,17,FOLLOW_17_in_select_expr4743); 

                    match(input,42,FOLLOW_42_in_select_expr4744); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_select_expr4745); 

                    match(input,43,FOLLOW_43_in_select_expr4746); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:235:67: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt273=2;
                    int LA273_0 = input.LA(1);

                    if ( (LA273_0==HOSTNAME) ) {
                        int LA273_1 = input.LA(2);

                        if ( (LA273_1==18) ) {
                            alt273=2;
                        }
                        else if ( (LA273_1==EOF) ) {
                            alt273=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 273, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 273, 0, input);

                        throw nvae;

                    }
                    switch (alt273) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:235:68: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4748); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:235:77: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:235:77: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:235:78: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:235:78: ( HOSTNAME ',' )+
                            int cnt272=0;
                            loop272:
                            do {
                                int alt272=2;
                                int LA272_0 = input.LA(1);

                                if ( (LA272_0==HOSTNAME) ) {
                                    int LA272_1 = input.LA(2);

                                    if ( (LA272_1==18) ) {
                                        alt272=1;
                                    }


                                }


                                switch (alt272) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:235:79: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4752); 

                            	    match(input,18,FOLLOW_18_in_select_expr4753); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt272 >= 1 ) break loop272;
                                        EarlyExitException eee =
                                            new EarlyExitException(272, input);
                                        throw eee;
                                }
                                cnt272++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4757); 

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 83 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:236:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr4765); 

                    match(input,56,FOLLOW_56_in_select_expr4766); 

                    match(input,15,FOLLOW_15_in_select_expr4767); 

                    match(input,23,FOLLOW_23_in_select_expr4768); 

                    match(input,16,FOLLOW_16_in_select_expr4769); 

                    match(input,30,FOLLOW_30_in_select_expr4770); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr4771); 

                    match(input,31,FOLLOW_31_in_select_expr4773); 

                    match(input,17,FOLLOW_17_in_select_expr4774); 

                    match(input,43,FOLLOW_43_in_select_expr4775); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:236:66: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt275=2;
                    int LA275_0 = input.LA(1);

                    if ( (LA275_0==HOSTNAME) ) {
                        int LA275_1 = input.LA(2);

                        if ( (LA275_1==18) ) {
                            alt275=2;
                        }
                        else if ( (LA275_1==EOF) ) {
                            alt275=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 275, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 275, 0, input);

                        throw nvae;

                    }
                    switch (alt275) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:236:67: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4777); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:236:76: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:236:76: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:236:77: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:236:77: ( HOSTNAME ',' )+
                            int cnt274=0;
                            loop274:
                            do {
                                int alt274=2;
                                int LA274_0 = input.LA(1);

                                if ( (LA274_0==HOSTNAME) ) {
                                    int LA274_1 = input.LA(2);

                                    if ( (LA274_1==18) ) {
                                        alt274=1;
                                    }


                                }


                                switch (alt274) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:236:78: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4781); 

                            	    match(input,18,FOLLOW_18_in_select_expr4782); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt274 >= 1 ) break loop274;
                                        EarlyExitException eee =
                                            new EarlyExitException(274, input);
                                        throw eee;
                                }
                                cnt274++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4786); 

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 84 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:237:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'GSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr4794); 

                    match(input,56,FOLLOW_56_in_select_expr4795); 

                    match(input,15,FOLLOW_15_in_select_expr4796); 

                    match(input,23,FOLLOW_23_in_select_expr4797); 

                    match(input,16,FOLLOW_16_in_select_expr4798); 

                    match(input,30,FOLLOW_30_in_select_expr4799); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr4800); 

                    match(input,31,FOLLOW_31_in_select_expr4802); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:237:59: ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) )
                    int alt277=2;
                    int LA277_0 = input.LA(1);

                    if ( (LA277_0==DIGIT||LA277_0==NUMBER) ) {
                        int LA277_1 = input.LA(2);

                        if ( (LA277_1==18) ) {
                            alt277=2;
                        }
                        else if ( (LA277_1==43) ) {
                            alt277=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 277, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 277, 0, input);

                        throw nvae;

                    }
                    switch (alt277) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:237:60: ( DIGIT | NUMBER )
                            {
                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:237:75: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:237:75: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:237:76: ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:237:76: ( ( DIGIT | NUMBER ) ',' )+
                            int cnt276=0;
                            loop276:
                            do {
                                int alt276=2;
                                int LA276_0 = input.LA(1);

                                if ( (LA276_0==DIGIT||LA276_0==NUMBER) ) {
                                    int LA276_1 = input.LA(2);

                                    if ( (LA276_1==18) ) {
                                        alt276=1;
                                    }


                                }


                                switch (alt276) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:237:77: ( DIGIT | NUMBER ) ','
                            	    {
                            	    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                            	        input.consume();
                            	        state.errorRecovery=false;
                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        throw mse;
                            	    }


                            	    match(input,18,FOLLOW_18_in_select_expr4817); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt276 >= 1 ) break loop276;
                                        EarlyExitException eee =
                                            new EarlyExitException(276, input);
                                        throw eee;
                                }
                                cnt276++;
                            } while (true);


                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }


                            }
                            break;

                    }


                    match(input,43,FOLLOW_43_in_select_expr4828); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:237:117: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt279=2;
                    int LA279_0 = input.LA(1);

                    if ( (LA279_0==HOSTNAME) ) {
                        int LA279_1 = input.LA(2);

                        if ( (LA279_1==18) ) {
                            alt279=2;
                        }
                        else if ( (LA279_1==EOF) ) {
                            alt279=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 279, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 279, 0, input);

                        throw nvae;

                    }
                    switch (alt279) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:237:118: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4830); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:237:127: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:237:127: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:237:128: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:237:128: ( HOSTNAME ',' )+
                            int cnt278=0;
                            loop278:
                            do {
                                int alt278=2;
                                int LA278_0 = input.LA(1);

                                if ( (LA278_0==HOSTNAME) ) {
                                    int LA278_1 = input.LA(2);

                                    if ( (LA278_1==18) ) {
                                        alt278=1;
                                    }


                                }


                                switch (alt278) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:237:129: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4834); 

                            	    match(input,18,FOLLOW_18_in_select_expr4835); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt278 >= 1 ) break loop278;
                                        EarlyExitException eee =
                                            new EarlyExitException(278, input);
                                        throw eee;
                                }
                                cnt278++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4839); 

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 85 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:241:4: 'SELECT' '*' PROTOCOLS 'ASPRINGS'
                    {
                    match(input,50,FOLLOW_50_in_select_expr4856); 

                    match(input,17,FOLLOW_17_in_select_expr4857); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr4859); 

                    match(input,21,FOLLOW_21_in_select_expr4861); 

                    }
                    break;
                case 86 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:242:4: 'SELECT' ( DIGIT | NUMBER ) PROTOCOLS 'ASPRINGS'
                    {
                    match(input,50,FOLLOW_50_in_select_expr4867); 

                    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr4874); 

                    match(input,21,FOLLOW_21_in_select_expr4876); 

                    }
                    break;
                case 87 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:245:4: 'SELECT' 'DATARATE' 'FROM' 'ASPRINGS'
                    {
                    match(input,50,FOLLOW_50_in_select_expr4891); 

                    match(input,23,FOLLOW_23_in_select_expr4892); 

                    match(input,30,FOLLOW_30_in_select_expr4893); 

                    match(input,21,FOLLOW_21_in_select_expr4894); 

                    }
                    break;
                case 88 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:246:4: 'SELECT' 'DATARATE' 'FROM' 'ASPRINGS' '*' 'OF' VARNAME
                    {
                    match(input,50,FOLLOW_50_in_select_expr4903); 

                    match(input,23,FOLLOW_23_in_select_expr4904); 

                    match(input,30,FOLLOW_30_in_select_expr4905); 

                    match(input,21,FOLLOW_21_in_select_expr4906); 

                    match(input,17,FOLLOW_17_in_select_expr4907); 

                    match(input,42,FOLLOW_42_in_select_expr4908); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_select_expr4909); 

                    }
                    break;
                case 89 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:247:6: 'SELECT' 'DATARATE' 'FROM' 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr4917); 

                    match(input,23,FOLLOW_23_in_select_expr4918); 

                    match(input,30,FOLLOW_30_in_select_expr4919); 

                    match(input,21,FOLLOW_21_in_select_expr4920); 

                    match(input,17,FOLLOW_17_in_select_expr4921); 

                    match(input,43,FOLLOW_43_in_select_expr4922); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:247:47: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt281=2;
                    int LA281_0 = input.LA(1);

                    if ( (LA281_0==HOSTNAME) ) {
                        int LA281_1 = input.LA(2);

                        if ( (LA281_1==18) ) {
                            alt281=2;
                        }
                        else if ( (LA281_1==EOF) ) {
                            alt281=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 281, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 281, 0, input);

                        throw nvae;

                    }
                    switch (alt281) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:247:48: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4924); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:247:57: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:247:57: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:247:58: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:247:58: ( HOSTNAME ',' )+
                            int cnt280=0;
                            loop280:
                            do {
                                int alt280=2;
                                int LA280_0 = input.LA(1);

                                if ( (LA280_0==HOSTNAME) ) {
                                    int LA280_1 = input.LA(2);

                                    if ( (LA280_1==18) ) {
                                        alt280=1;
                                    }


                                }


                                switch (alt280) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:247:59: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4928); 

                            	    match(input,18,FOLLOW_18_in_select_expr4929); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt280 >= 1 ) break loop280;
                                        EarlyExitException eee =
                                            new EarlyExitException(280, input);
                                        throw eee;
                                }
                                cnt280++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4933); 

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 90 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:248:4: 'SELECT' 'DATARATE' 'FROM' 'ASPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr4941); 

                    match(input,23,FOLLOW_23_in_select_expr4942); 

                    match(input,30,FOLLOW_30_in_select_expr4943); 

                    match(input,21,FOLLOW_21_in_select_expr4944); 

                    match(input,17,FOLLOW_17_in_select_expr4945); 

                    match(input,42,FOLLOW_42_in_select_expr4946); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_select_expr4947); 

                    match(input,43,FOLLOW_43_in_select_expr4948); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:248:56: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt283=2;
                    int LA283_0 = input.LA(1);

                    if ( (LA283_0==HOSTNAME) ) {
                        int LA283_1 = input.LA(2);

                        if ( (LA283_1==18) ) {
                            alt283=2;
                        }
                        else if ( (LA283_1==EOF) ) {
                            alt283=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 283, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 283, 0, input);

                        throw nvae;

                    }
                    switch (alt283) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:248:57: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4950); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:248:66: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:248:66: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:248:67: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:248:67: ( HOSTNAME ',' )+
                            int cnt282=0;
                            loop282:
                            do {
                                int alt282=2;
                                int LA282_0 = input.LA(1);

                                if ( (LA282_0==HOSTNAME) ) {
                                    int LA282_1 = input.LA(2);

                                    if ( (LA282_1==18) ) {
                                        alt282=1;
                                    }


                                }


                                switch (alt282) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:248:68: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4954); 

                            	    match(input,18,FOLLOW_18_in_select_expr4955); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt282 >= 1 ) break loop282;
                                        EarlyExitException eee =
                                            new EarlyExitException(282, input);
                                        throw eee;
                                }
                                cnt282++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4959); 

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 91 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:249:4: 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr4967); 

                    match(input,23,FOLLOW_23_in_select_expr4968); 

                    match(input,30,FOLLOW_30_in_select_expr4969); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr4970); 

                    match(input,21,FOLLOW_21_in_select_expr4972); 

                    match(input,17,FOLLOW_17_in_select_expr4973); 

                    match(input,43,FOLLOW_43_in_select_expr4974); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:249:55: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt285=2;
                    int LA285_0 = input.LA(1);

                    if ( (LA285_0==HOSTNAME) ) {
                        int LA285_1 = input.LA(2);

                        if ( (LA285_1==18) ) {
                            alt285=2;
                        }
                        else if ( (LA285_1==EOF) ) {
                            alt285=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 285, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 285, 0, input);

                        throw nvae;

                    }
                    switch (alt285) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:249:56: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4976); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:249:65: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:249:65: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:249:66: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:249:66: ( HOSTNAME ',' )+
                            int cnt284=0;
                            loop284:
                            do {
                                int alt284=2;
                                int LA284_0 = input.LA(1);

                                if ( (LA284_0==HOSTNAME) ) {
                                    int LA284_1 = input.LA(2);

                                    if ( (LA284_1==18) ) {
                                        alt284=1;
                                    }


                                }


                                switch (alt284) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:249:67: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4980); 

                            	    match(input,18,FOLLOW_18_in_select_expr4981); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt284 >= 1 ) break loop284;
                                        EarlyExitException eee =
                                            new EarlyExitException(284, input);
                                        throw eee;
                                }
                                cnt284++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr4985); 

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 92 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:250:4: 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'ASPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr4993); 

                    match(input,23,FOLLOW_23_in_select_expr4994); 

                    match(input,30,FOLLOW_30_in_select_expr4995); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr4996); 

                    match(input,21,FOLLOW_21_in_select_expr4998); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:250:48: ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) )
                    int alt287=2;
                    int LA287_0 = input.LA(1);

                    if ( (LA287_0==DIGIT||LA287_0==NUMBER) ) {
                        int LA287_1 = input.LA(2);

                        if ( (LA287_1==18) ) {
                            alt287=2;
                        }
                        else if ( (LA287_1==43) ) {
                            alt287=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 287, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 287, 0, input);

                        throw nvae;

                    }
                    switch (alt287) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:250:49: ( DIGIT | NUMBER )
                            {
                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:250:64: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:250:64: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:250:65: ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:250:65: ( ( DIGIT | NUMBER ) ',' )+
                            int cnt286=0;
                            loop286:
                            do {
                                int alt286=2;
                                int LA286_0 = input.LA(1);

                                if ( (LA286_0==DIGIT||LA286_0==NUMBER) ) {
                                    int LA286_1 = input.LA(2);

                                    if ( (LA286_1==18) ) {
                                        alt286=1;
                                    }


                                }


                                switch (alt286) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:250:66: ( DIGIT | NUMBER ) ','
                            	    {
                            	    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                            	        input.consume();
                            	        state.errorRecovery=false;
                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        throw mse;
                            	    }


                            	    match(input,18,FOLLOW_18_in_select_expr5013); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt286 >= 1 ) break loop286;
                                        EarlyExitException eee =
                                            new EarlyExitException(286, input);
                                        throw eee;
                                }
                                cnt286++;
                            } while (true);


                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }


                            }
                            break;

                    }


                    match(input,43,FOLLOW_43_in_select_expr5024); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:250:106: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt289=2;
                    int LA289_0 = input.LA(1);

                    if ( (LA289_0==HOSTNAME) ) {
                        int LA289_1 = input.LA(2);

                        if ( (LA289_1==18) ) {
                            alt289=2;
                        }
                        else if ( (LA289_1==EOF) ) {
                            alt289=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 289, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 289, 0, input);

                        throw nvae;

                    }
                    switch (alt289) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:250:107: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr5026); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:250:116: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:250:116: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:250:117: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:250:117: ( HOSTNAME ',' )+
                            int cnt288=0;
                            loop288:
                            do {
                                int alt288=2;
                                int LA288_0 = input.LA(1);

                                if ( (LA288_0==HOSTNAME) ) {
                                    int LA288_1 = input.LA(2);

                                    if ( (LA288_1==18) ) {
                                        alt288=1;
                                    }


                                }


                                switch (alt288) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:250:118: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr5030); 

                            	    match(input,18,FOLLOW_18_in_select_expr5031); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt288 >= 1 ) break loop288;
                                        EarlyExitException eee =
                                            new EarlyExitException(288, input);
                                        throw eee;
                                }
                                cnt288++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr5035); 

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 93 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:253:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'ASPRINGS'
                    {
                    match(input,50,FOLLOW_50_in_select_expr5050); 

                    match(input,56,FOLLOW_56_in_select_expr5051); 

                    match(input,15,FOLLOW_15_in_select_expr5052); 

                    match(input,23,FOLLOW_23_in_select_expr5053); 

                    match(input,16,FOLLOW_16_in_select_expr5054); 

                    match(input,30,FOLLOW_30_in_select_expr5055); 

                    match(input,21,FOLLOW_21_in_select_expr5056); 

                    }
                    break;
                case 94 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:254:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'ASPRINGS' '*' 'OF' VARNAME
                    {
                    match(input,50,FOLLOW_50_in_select_expr5065); 

                    match(input,56,FOLLOW_56_in_select_expr5066); 

                    match(input,15,FOLLOW_15_in_select_expr5067); 

                    match(input,23,FOLLOW_23_in_select_expr5068); 

                    match(input,16,FOLLOW_16_in_select_expr5069); 

                    match(input,30,FOLLOW_30_in_select_expr5070); 

                    match(input,21,FOLLOW_21_in_select_expr5071); 

                    match(input,17,FOLLOW_17_in_select_expr5072); 

                    match(input,42,FOLLOW_42_in_select_expr5073); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_select_expr5074); 

                    }
                    break;
                case 95 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:255:6: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr5082); 

                    match(input,56,FOLLOW_56_in_select_expr5083); 

                    match(input,15,FOLLOW_15_in_select_expr5084); 

                    match(input,23,FOLLOW_23_in_select_expr5085); 

                    match(input,16,FOLLOW_16_in_select_expr5086); 

                    match(input,30,FOLLOW_30_in_select_expr5087); 

                    match(input,21,FOLLOW_21_in_select_expr5088); 

                    match(input,17,FOLLOW_17_in_select_expr5089); 

                    match(input,43,FOLLOW_43_in_select_expr5090); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:255:58: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt291=2;
                    int LA291_0 = input.LA(1);

                    if ( (LA291_0==HOSTNAME) ) {
                        int LA291_1 = input.LA(2);

                        if ( (LA291_1==18) ) {
                            alt291=2;
                        }
                        else if ( (LA291_1==EOF) ) {
                            alt291=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 291, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 291, 0, input);

                        throw nvae;

                    }
                    switch (alt291) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:255:59: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr5092); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:255:68: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:255:68: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:255:69: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:255:69: ( HOSTNAME ',' )+
                            int cnt290=0;
                            loop290:
                            do {
                                int alt290=2;
                                int LA290_0 = input.LA(1);

                                if ( (LA290_0==HOSTNAME) ) {
                                    int LA290_1 = input.LA(2);

                                    if ( (LA290_1==18) ) {
                                        alt290=1;
                                    }


                                }


                                switch (alt290) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:255:70: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr5096); 

                            	    match(input,18,FOLLOW_18_in_select_expr5097); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt290 >= 1 ) break loop290;
                                        EarlyExitException eee =
                                            new EarlyExitException(290, input);
                                        throw eee;
                                }
                                cnt290++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr5101); 

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 96 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:256:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'ASPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr5109); 

                    match(input,56,FOLLOW_56_in_select_expr5110); 

                    match(input,15,FOLLOW_15_in_select_expr5111); 

                    match(input,23,FOLLOW_23_in_select_expr5112); 

                    match(input,16,FOLLOW_16_in_select_expr5113); 

                    match(input,30,FOLLOW_30_in_select_expr5114); 

                    match(input,21,FOLLOW_21_in_select_expr5115); 

                    match(input,17,FOLLOW_17_in_select_expr5116); 

                    match(input,42,FOLLOW_42_in_select_expr5117); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_select_expr5118); 

                    match(input,43,FOLLOW_43_in_select_expr5119); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:256:67: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt293=2;
                    int LA293_0 = input.LA(1);

                    if ( (LA293_0==HOSTNAME) ) {
                        int LA293_1 = input.LA(2);

                        if ( (LA293_1==18) ) {
                            alt293=2;
                        }
                        else if ( (LA293_1==EOF) ) {
                            alt293=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 293, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 293, 0, input);

                        throw nvae;

                    }
                    switch (alt293) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:256:68: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr5121); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:256:77: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:256:77: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:256:78: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:256:78: ( HOSTNAME ',' )+
                            int cnt292=0;
                            loop292:
                            do {
                                int alt292=2;
                                int LA292_0 = input.LA(1);

                                if ( (LA292_0==HOSTNAME) ) {
                                    int LA292_1 = input.LA(2);

                                    if ( (LA292_1==18) ) {
                                        alt292=1;
                                    }


                                }


                                switch (alt292) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:256:79: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr5125); 

                            	    match(input,18,FOLLOW_18_in_select_expr5126); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt292 >= 1 ) break loop292;
                                        EarlyExitException eee =
                                            new EarlyExitException(292, input);
                                        throw eee;
                                }
                                cnt292++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr5130); 

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 97 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:257:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr5138); 

                    match(input,56,FOLLOW_56_in_select_expr5139); 

                    match(input,15,FOLLOW_15_in_select_expr5140); 

                    match(input,23,FOLLOW_23_in_select_expr5141); 

                    match(input,16,FOLLOW_16_in_select_expr5142); 

                    match(input,30,FOLLOW_30_in_select_expr5143); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr5144); 

                    match(input,21,FOLLOW_21_in_select_expr5146); 

                    match(input,17,FOLLOW_17_in_select_expr5147); 

                    match(input,43,FOLLOW_43_in_select_expr5148); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:257:66: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt295=2;
                    int LA295_0 = input.LA(1);

                    if ( (LA295_0==HOSTNAME) ) {
                        int LA295_1 = input.LA(2);

                        if ( (LA295_1==18) ) {
                            alt295=2;
                        }
                        else if ( (LA295_1==EOF) ) {
                            alt295=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 295, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 295, 0, input);

                        throw nvae;

                    }
                    switch (alt295) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:257:67: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr5150); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:257:76: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:257:76: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:257:77: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:257:77: ( HOSTNAME ',' )+
                            int cnt294=0;
                            loop294:
                            do {
                                int alt294=2;
                                int LA294_0 = input.LA(1);

                                if ( (LA294_0==HOSTNAME) ) {
                                    int LA294_1 = input.LA(2);

                                    if ( (LA294_1==18) ) {
                                        alt294=1;
                                    }


                                }


                                switch (alt294) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:257:78: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr5154); 

                            	    match(input,18,FOLLOW_18_in_select_expr5155); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt294 >= 1 ) break loop294;
                                        EarlyExitException eee =
                                            new EarlyExitException(294, input);
                                        throw eee;
                                }
                                cnt294++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr5159); 

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 98 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:258:4: 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'ASPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    {
                    match(input,50,FOLLOW_50_in_select_expr5167); 

                    match(input,56,FOLLOW_56_in_select_expr5168); 

                    match(input,15,FOLLOW_15_in_select_expr5169); 

                    match(input,23,FOLLOW_23_in_select_expr5170); 

                    match(input,16,FOLLOW_16_in_select_expr5171); 

                    match(input,30,FOLLOW_30_in_select_expr5172); 

                    match(input,PROTOCOLS,FOLLOW_PROTOCOLS_in_select_expr5173); 

                    match(input,21,FOLLOW_21_in_select_expr5175); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:258:59: ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) )
                    int alt297=2;
                    int LA297_0 = input.LA(1);

                    if ( (LA297_0==DIGIT||LA297_0==NUMBER) ) {
                        int LA297_1 = input.LA(2);

                        if ( (LA297_1==18) ) {
                            alt297=2;
                        }
                        else if ( (LA297_1==43) ) {
                            alt297=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 297, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 297, 0, input);

                        throw nvae;

                    }
                    switch (alt297) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:258:60: ( DIGIT | NUMBER )
                            {
                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:258:75: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:258:75: ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:258:76: ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:258:76: ( ( DIGIT | NUMBER ) ',' )+
                            int cnt296=0;
                            loop296:
                            do {
                                int alt296=2;
                                int LA296_0 = input.LA(1);

                                if ( (LA296_0==DIGIT||LA296_0==NUMBER) ) {
                                    int LA296_1 = input.LA(2);

                                    if ( (LA296_1==18) ) {
                                        alt296=1;
                                    }


                                }


                                switch (alt296) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:258:77: ( DIGIT | NUMBER ) ','
                            	    {
                            	    if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                            	        input.consume();
                            	        state.errorRecovery=false;
                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        throw mse;
                            	    }


                            	    match(input,18,FOLLOW_18_in_select_expr5190); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt296 >= 1 ) break loop296;
                                        EarlyExitException eee =
                                            new EarlyExitException(296, input);
                                        throw eee;
                                }
                                cnt296++;
                            } while (true);


                            if ( input.LA(1)==DIGIT||input.LA(1)==NUMBER ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }


                            }
                            break;

                    }


                    match(input,43,FOLLOW_43_in_select_expr5201); 

                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:258:117: ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) )
                    int alt299=2;
                    int LA299_0 = input.LA(1);

                    if ( (LA299_0==HOSTNAME) ) {
                        int LA299_1 = input.LA(2);

                        if ( (LA299_1==18) ) {
                            alt299=2;
                        }
                        else if ( (LA299_1==EOF) ) {
                            alt299=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 299, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 299, 0, input);

                        throw nvae;

                    }
                    switch (alt299) {
                        case 1 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:258:118: HOSTNAME
                            {
                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr5203); 

                            }
                            break;
                        case 2 :
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:258:127: ( ( HOSTNAME ',' )+ HOSTNAME )
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:258:127: ( ( HOSTNAME ',' )+ HOSTNAME )
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:258:128: ( HOSTNAME ',' )+ HOSTNAME
                            {
                            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:258:128: ( HOSTNAME ',' )+
                            int cnt298=0;
                            loop298:
                            do {
                                int alt298=2;
                                int LA298_0 = input.LA(1);

                                if ( (LA298_0==HOSTNAME) ) {
                                    int LA298_1 = input.LA(2);

                                    if ( (LA298_1==18) ) {
                                        alt298=1;
                                    }


                                }


                                switch (alt298) {
                            	case 1 :
                            	    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:258:129: HOSTNAME ','
                            	    {
                            	    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr5207); 

                            	    match(input,18,FOLLOW_18_in_select_expr5208); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt298 >= 1 ) break loop298;
                                        EarlyExitException eee =
                                            new EarlyExitException(298, input);
                                        throw eee;
                                }
                                cnt298++;
                            } while (true);


                            match(input,HOSTNAME,FOLLOW_HOSTNAME_in_select_expr5212); 

                            }


                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "select_expr"



    // $ANTLR start "status_expr"
    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:260:1: status_expr : ( 'LIST' 'STATUS' | 'LIST' 'HOSTS' | 'LIST' 'ESPRINGS' 'SESSION' 'STATUS' | 'LIST' 'LEARNING' 'STATUS' 'OF' VARNAME );
    public final QueryResults status_expr() throws RecognitionException {
    	QueryResults result = null;
        try {
            // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:261:2: ( 'LIST' 'STATUS' | 'LIST' 'HOSTS' | 'LIST' 'ESPRINGS' 'SESSION' 'STATUS' | 'LIST' 'LEARNING' 'STATUS' 'OF' VARNAME )
            int alt301=4;
            int LA301_0 = input.LA(1);

            if ( (LA301_0==37) ) {
                switch ( input.LA(2) ) {
                case 55:
                    {
                    alt301=1;
                    }
                    break;
                case 32:
                    {
                    alt301=2;
                    }
                    break;
                case 26:
                    {
                    alt301=3;
                    }
                    break;
                case 36:
                    {
                    alt301=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 301, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 301, 0, input);

                throw nvae;

            }
            switch (alt301) {
                case 1 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:261:5: 'LIST' 'STATUS'
                    {
                    match(input,37,FOLLOW_37_in_status_expr5224); 

                    match(input,55,FOLLOW_55_in_status_expr5225); 

                    }
                    break;
                case 2 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:262:4: 'LIST' 'HOSTS'
                    {
                    match(input,37,FOLLOW_37_in_status_expr5231); 

                    match(input,32,FOLLOW_32_in_status_expr5232); 

                    }
                    break;
                case 3 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:263:4: 'LIST' 'ESPRINGS' 'SESSION' 'STATUS'
                    {
                    match(input,37,FOLLOW_37_in_status_expr5238); 

                    match(input,26,FOLLOW_26_in_status_expr5239); 

                    match(input,51,FOLLOW_51_in_status_expr5240); 

                    match(input,55,FOLLOW_55_in_status_expr5241); 

                    }
                    break;
                case 4 :
                    // E:\\StreamFarm\\Grammar Dev\\Dev7\\StreamFarm.g:264:4: 'LIST' 'LEARNING' 'STATUS' 'OF' VARNAME
                    {
                    match(input,37,FOLLOW_37_in_status_expr5247); 

                    match(input,36,FOLLOW_36_in_status_expr5248); 

                    match(input,55,FOLLOW_55_in_status_expr5249); 

                    match(input,42,FOLLOW_42_in_status_expr5250); 

                    match(input,VARNAME,FOLLOW_VARNAME_in_status_expr5251); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "status_expr"

    // Delegated rules


    protected DFA30 dfa30 = new DFA30(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA82 dfa82 = new DFA82(this);
    protected DFA159 dfa159 = new DFA159(this);
    protected DFA300 dfa300 = new DFA300(this);
    static final String DFA30_eotS =
        "\111\uffff";
    static final String DFA30_eofS =
        "\42\uffff\1\52\3\uffff\1\57\13\uffff\1\71\2\uffff\1\57\1\73\13\uffff"+
        "\1\105\3\uffff\1\110\2\uffff";
    static final String DFA30_minS =
        "\1\26\1\5\1\13\1\16\1\25\2\uffff\1\36\1\53\1\37\2\36\1\7\1\10\1"+
        "\53\2\14\1\24\1\22\1\uffff\1\10\2\24\1\uffff\2\10\1\15\1\22\1\uffff"+
        "\1\10\2\uffff\2\22\1\72\1\10\1\uffff\1\15\1\22\1\10\1\15\2\uffff"+
        "\1\22\1\71\1\10\1\15\1\uffff\1\47\1\22\1\72\2\uffff\1\22\1\72\1"+
        "\5\2\uffff\1\47\1\uffff\1\43\1\5\1\35\1\43\1\5\1\35\1\61\1\5\2\uffff"+
        "\1\61\2\uffff";
    static final String DFA30_maxS =
        "\1\26\1\33\1\13\1\57\1\56\2\uffff\1\36\1\53\1\37\2\36\1\7\1\10\1"+
        "\71\2\14\1\53\1\24\1\uffff\1\10\2\53\1\uffff\2\10\1\15\1\71\1\uffff"+
        "\1\10\2\uffff\2\24\1\72\1\10\1\uffff\1\15\1\72\1\10\1\15\2\uffff"+
        "\1\71\1\72\1\10\1\15\1\uffff\1\47\1\24\1\72\2\uffff\2\72\1\12\2"+
        "\uffff\1\47\1\uffff\1\43\1\12\1\35\1\43\1\12\1\35\1\61\1\12\2\uffff"+
        "\1\61\2\uffff";
    static final String DFA30_acceptS =
        "\5\uffff\1\6\1\7\14\uffff\1\10\3\uffff\1\1\4\uffff\1\14\1\uffff"+
        "\1\23\1\24\4\uffff\1\11\4\uffff\1\5\1\4\4\uffff\1\20\3\uffff\1\12"+
        "\1\13\3\uffff\1\3\1\2\1\uffff\1\15\10\uffff\1\22\1\21\1\uffff\1"+
        "\17\1\16";
    static final String DFA30_specialS =
        "\111\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\1",
            "\1\2\4\uffff\1\2\20\uffff\1\3",
            "\1\4",
            "\1\5\40\uffff\1\6",
            "\1\13\4\uffff\1\12\7\uffff\1\11\12\uffff\1\10\1\7",
            "",
            "",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\24\15\uffff\1\23",
            "\1\25",
            "\1\26",
            "\1\27\26\uffff\1\30",
            "\1\31\1\uffff\1\32",
            "",
            "\1\33",
            "\1\34\26\uffff\1\35",
            "\1\36\26\uffff\1\37",
            "",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43\1\uffff\1\45\44\uffff\1\44",
            "",
            "\1\46",
            "",
            "",
            "\1\47\1\uffff\1\50",
            "\1\31\1\uffff\1\32",
            "\1\51",
            "\1\53",
            "",
            "\1\54",
            "\1\55\1\uffff\1\56\45\uffff\1\60",
            "\1\61",
            "\1\62",
            "",
            "",
            "\1\43\1\uffff\1\45\44\uffff\1\44",
            "\1\63\1\64",
            "\1\65",
            "\1\66",
            "",
            "\1\67",
            "\1\47\1\uffff\1\50",
            "\1\70",
            "",
            "",
            "\1\55\1\uffff\1\56\45\uffff\1\60",
            "\1\72",
            "\1\74\4\uffff\1\74",
            "",
            "",
            "\1\75",
            "",
            "\1\76",
            "\1\77\4\uffff\1\77",
            "\1\100",
            "\1\101",
            "\1\102\4\uffff\1\102",
            "\1\103",
            "\1\104",
            "\1\106\4\uffff\1\106",
            "",
            "",
            "\1\107",
            "",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "20:1: create_expr : ( 'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'PSPRINGS' 'FROM' FILEPATH 'AS' VARNAME | 'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'PSPRINGS' 'FROM' FILEPATH 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'AS' VARNAME | 'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'PSPRINGS' 'FROM' FILEPATH 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'AS' VARNAME 'WITH' 'MAXDRATE' ( DIGIT | NUMBER ) | 'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'PSINKHOLES' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'AS' VARNAME | 'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'PSINKHOLES' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'AS' VARNAME 'WITH' 'MAXDRATE' ( DIGIT | NUMBER ) | 'CREATE' 'FILTER' X_Y_EXPR 'AS' VARNAME 'WITH' 'DRANGE' DRANGE 'IN' 'PERIOD' ( DIGIT | NUMBER ) | 'CREATE' 'FILTER' 'PULSEWAVE' 'AS' VARNAME 'WITH' 'DRANGE' DRANGE 'IN' 'PERIOD' ( DIGIT | NUMBER ) | 'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'KRONECKER' 'GSPRINGS' 'USING' 'MATRIX' MATRIXDEF 'NITER' ( DIGIT | NUMBER ) | 'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'KRONECKER' 'GSPRINGS' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'USING' 'MATRIX' MATRIXDEF 'NITER' ( DIGIT | NUMBER ) | 'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'KRONECKER' 'GSPRINGS' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'AS' VARNAME 'USING' 'MATRIX' MATRIXDEF 'NITER' ( DIGIT | NUMBER ) | 'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'KRONECKER' 'GSPRINGS' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'AS' VARNAME 'WITH' 'MAXDRATE' ( DIGIT | NUMBER ) 'USING' 'MATRIX' MATRIXDEF 'NITER' ( DIGIT | NUMBER ) | 'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'ESPRINGS' 'FROM' URLPATH 'AS' VARNAME | 'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'ESPRINGS' 'FROM' URLPATH 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'AS' VARNAME | 'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'ESPRINGS' 'FROM' URLPATH 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'AS' VARNAME 'WITH' 'MAXDRATE' ( DIGIT | NUMBER ) 'LEARN' 'FOR' ( DIGIT | NUMBER ) | 'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'ESPRINGS' 'FROM' URLPATH 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'AS' VARNAME 'WITH' 'MAXDRATE' ( DIGIT | NUMBER ) 'LEARN' 'FOR' ( DIGIT | NUMBER ) 'SAVE' | 'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'ESPRINGS' 'FROM' URLPATH 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'ESPRINGS' 'FROM' URLPATH 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'WITH' 'MAXDRATE' ( DIGIT | NUMBER ) 'LEARN' 'FOR' ( DIGIT | NUMBER ) | 'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'ESPRINGS' 'FROM' URLPATH 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'WITH' 'MAXDRATE' ( DIGIT | NUMBER ) 'LEARN' 'FOR' ( DIGIT | NUMBER ) 'SAVE' | 'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'ASPRINGS' 'FROM' URLPATH 'AS' VARNAME 'WITH' 'MAXDRATE' ( DIGIT | NUMBER ) 'AMPLIFYING' URLPATH | 'CREATE' ( DIGIT | NUMBER ) PROTOCOLS 'ASPRINGS' 'FROM' URLPATH 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'AS' VARNAME 'WITH' 'MAXDRATE' ( DIGIT | NUMBER ) 'AMPLIFYING' URLPATH );";
        }
    }
    static final String DFA43_eotS =
        "\22\uffff";
    static final String DFA43_eofS =
        "\15\uffff\1\17\3\uffff\1\17";
    static final String DFA43_minS =
        "\1\64\1\34\1\15\1\22\1\15\1\13\1\22\1\56\1\5\1\22\1\5\1\10\2\22"+
        "\1\10\2\uffff\1\22";
    static final String DFA43_maxS =
        "\1\64\1\34\1\15\1\53\1\15\1\13\1\53\1\56\1\12\1\53\1\12\1\10\1\53"+
        "\1\51\1\10\2\uffff\1\51";
    static final String DFA43_acceptS =
        "\17\uffff\1\1\1\2\1\uffff";
    static final String DFA43_specialS =
        "\22\uffff}>";
    static final String[] DFA43_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4\30\uffff\1\5",
            "\1\6",
            "\1\7",
            "\1\4\30\uffff\1\5",
            "\1\10",
            "\1\11\4\uffff\1\11",
            "\1\12\30\uffff\1\13",
            "\1\14\4\uffff\1\14",
            "\1\15",
            "\1\12\30\uffff\1\13",
            "\1\16\26\uffff\1\20",
            "\1\21",
            "",
            "",
            "\1\16\26\uffff\1\20"
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "50:1: allocation_expr : ( 'SET' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SET' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'NRPT' ( DIGIT | NUMBER ) );";
        }
    }
    static final String DFA82_eotS =
        "\36\uffff";
    static final String DFA82_eofS =
        "\24\uffff\1\27\1\33\6\uffff\1\27\1\33";
    static final String DFA82_minS =
        "\1\60\1\34\1\15\1\53\1\22\1\13\1\15\1\13\1\uffff\1\5\1\22\1\5\1"+
        "\uffff\1\52\1\uffff\1\53\1\uffff\1\10\1\uffff\1\10\2\22\1\10\2\uffff"+
        "\1\10\2\uffff\2\22";
    static final String DFA82_maxS =
        "\1\60\1\34\1\21\2\53\1\56\1\15\1\56\1\uffff\1\21\1\53\1\21\1\uffff"+
        "\1\53\1\uffff\1\53\1\uffff\1\10\1\uffff\1\10\2\52\1\10\2\uffff\1"+
        "\10\2\uffff\2\52";
    static final String DFA82_acceptS =
        "\10\uffff\1\1\3\uffff\1\11\1\uffff\1\10\1\uffff\1\7\1\uffff\1\5"+
        "\4\uffff\1\2\1\3\1\uffff\1\4\1\6\2\uffff";
    static final String DFA82_specialS =
        "\36\uffff}>";
    static final String[] DFA82_transitionS = {
            "\1\1",
            "\1\2",
            "\1\4\3\uffff\1\3",
            "\1\5",
            "\1\6\30\uffff\1\7",
            "\1\10\42\uffff\1\11",
            "\1\12",
            "\1\14\42\uffff\1\13",
            "",
            "\1\16\4\uffff\1\16\6\uffff\1\15",
            "\1\6\30\uffff\1\7",
            "\1\20\4\uffff\1\20\6\uffff\1\17",
            "",
            "\1\22\1\21",
            "",
            "\1\23",
            "",
            "\1\24",
            "",
            "\1\25",
            "\1\26\27\uffff\1\30",
            "\1\31\27\uffff\1\32",
            "\1\34",
            "",
            "",
            "\1\35",
            "",
            "",
            "\1\26\27\uffff\1\30",
            "\1\31\27\uffff\1\32"
    };

    static final short[] DFA82_eot = DFA.unpackEncodedString(DFA82_eotS);
    static final short[] DFA82_eof = DFA.unpackEncodedString(DFA82_eofS);
    static final char[] DFA82_min = DFA.unpackEncodedStringToUnsignedChars(DFA82_minS);
    static final char[] DFA82_max = DFA.unpackEncodedStringToUnsignedChars(DFA82_maxS);
    static final short[] DFA82_accept = DFA.unpackEncodedString(DFA82_acceptS);
    static final short[] DFA82_special = DFA.unpackEncodedString(DFA82_specialS);
    static final short[][] DFA82_transition;

    static {
        int numStates = DFA82_transitionS.length;
        DFA82_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA82_transition[i] = DFA.unpackEncodedString(DFA82_transitionS[i]);
        }
    }

    class DFA82 extends DFA {

        public DFA82(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 82;
            this.eot = DFA82_eot;
            this.eof = DFA82_eof;
            this.min = DFA82_min;
            this.max = DFA82_max;
            this.accept = DFA82_accept;
            this.special = DFA82_special;
            this.transition = DFA82_transition;
        }
        public String getDescription() {
            return "54:1: deallocation_expr : ( 'REMOVE' 'FILTERS' '*' 'ON' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'REMOVE' 'FILTERS' '*' 'ON' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'REMOVE' 'FILTERS' '*' 'ON' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' ( VARNAME | ( VARNAME ',' )+ VARNAME ) | 'REMOVE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' ( VARNAME | ( VARNAME ',' )+ VARNAME ) | 'REMOVE' 'FILTERS' '*' 'ON' 'PSPRINGS' '*' 'OF' ( VARNAME | ( VARNAME ',' )+ VARNAME ) | 'REMOVE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'REMOVE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'REMOVE' 'FILTERS' '*' 'ON' 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'REMOVE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) );";
        }
    }
    static final String DFA159_eotS =
        "\154\uffff";
    static final String DFA159_eofS =
        "\31\uffff\1\65\1\67\37\uffff\1\105\4\uffff\1\114\1\117\1\122\1\125"+
        "\1\67\3\uffff\1\131\1\134\1\137\1\142\14\uffff\1\105\14\uffff\1"+
        "\114\1\117\1\122\1\125\1\131\1\134\1\137\1\142";
    static final String DFA159_minS =
        "\1\30\1\13\1\21\1\25\6\21\1\15\1\52\4\5\2\uffff\1\5\7\52\1\22\1"+
        "\uffff\1\10\1\53\1\uffff\1\53\1\uffff\1\53\1\uffff\1\53\4\uffff"+
        "\1\10\1\uffff\1\10\1\uffff\1\10\6\uffff\1\10\2\uffff\1\15\3\uffff"+
        "\1\22\4\10\5\22\1\10\2\uffff\4\22\1\10\2\uffff\1\10\2\uffff\1\10"+
        "\2\uffff\1\10\2\uffff\1\22\1\10\2\uffff\1\10\2\uffff\1\10\2\uffff"+
        "\1\10\2\uffff\10\22";
    static final String DFA159_maxS =
        "\1\30\1\66\1\21\1\66\7\21\1\53\4\21\2\uffff\1\21\10\53\1\uffff\1"+
        "\10\1\53\1\uffff\1\53\1\uffff\1\53\1\uffff\1\53\4\uffff\1\10\1\uffff"+
        "\1\10\1\uffff\1\10\6\uffff\1\10\2\uffff\1\15\3\uffff\1\52\4\10\4"+
        "\52\1\53\1\10\2\uffff\4\52\1\10\2\uffff\1\10\2\uffff\1\10\2\uffff"+
        "\1\10\2\uffff\1\52\1\10\2\uffff\1\10\2\uffff\1\10\2\uffff\1\10\2"+
        "\uffff\10\52";
    static final String DFA159_acceptS =
        "\20\uffff\1\33\1\36\11\uffff\1\1\2\uffff\1\6\1\uffff\1\14\1\uffff"+
        "\1\22\1\uffff\1\30\1\41\1\42\1\7\1\uffff\1\15\1\uffff\1\23\1\uffff"+
        "\1\31\1\32\1\34\1\35\1\37\1\40\1\uffff\1\50\1\43\1\uffff\1\44\1"+
        "\45\1\51\13\uffff\1\2\1\5\5\uffff\1\10\1\13\1\uffff\1\16\1\21\1"+
        "\uffff\1\24\1\27\1\uffff\1\46\1\47\2\uffff\1\3\1\4\1\uffff\1\11"+
        "\1\12\1\uffff\1\17\1\20\1\uffff\1\25\1\26\10\uffff";
    static final String DFA159_specialS =
        "\154\uffff}>";
    static final String[] DFA159_transitionS = {
            "\1\1",
            "\1\3\11\uffff\1\5\4\uffff\1\4\1\uffff\1\12\2\uffff\1\6\15\uffff"+
            "\1\11\1\2\6\uffff\1\10\1\7",
            "\1\13",
            "\1\16\4\uffff\1\15\4\uffff\1\17\15\uffff\1\22\1\14\6\uffff"+
            "\1\21\1\20",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\32\3\uffff\1\31",
            "\1\33\1\34",
            "\1\36\4\uffff\1\36\6\uffff\1\35",
            "\1\40\4\uffff\1\40\6\uffff\1\37",
            "\1\42\4\uffff\1\42\6\uffff\1\41",
            "\1\44\4\uffff\1\44\6\uffff\1\43",
            "",
            "",
            "\1\46\4\uffff\1\46\6\uffff\1\45",
            "\1\47\1\50",
            "\1\51\1\52",
            "\1\53\1\54",
            "\1\55\1\56",
            "\1\57\1\60",
            "\1\61\1\62",
            "\1\64\1\63",
            "\1\66\27\uffff\1\71\1\70",
            "",
            "\1\72",
            "\1\73",
            "",
            "\1\74",
            "",
            "\1\75",
            "",
            "\1\76",
            "",
            "",
            "",
            "",
            "\1\77",
            "",
            "\1\100",
            "",
            "\1\101",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\102",
            "",
            "",
            "\1\103",
            "",
            "",
            "",
            "\1\104\27\uffff\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113\27\uffff\1\115",
            "\1\116\27\uffff\1\120",
            "\1\121\27\uffff\1\123",
            "\1\124\27\uffff\1\126",
            "\1\66\27\uffff\1\71\1\70",
            "\1\127",
            "",
            "",
            "\1\130\27\uffff\1\132",
            "\1\133\27\uffff\1\135",
            "\1\136\27\uffff\1\140",
            "\1\141\27\uffff\1\143",
            "\1\144",
            "",
            "",
            "\1\145",
            "",
            "",
            "\1\146",
            "",
            "",
            "\1\147",
            "",
            "",
            "\1\104\27\uffff\1\106",
            "\1\150",
            "",
            "",
            "\1\151",
            "",
            "",
            "\1\152",
            "",
            "",
            "\1\153",
            "",
            "",
            "\1\113\27\uffff\1\115",
            "\1\116\27\uffff\1\120",
            "\1\121\27\uffff\1\123",
            "\1\124\27\uffff\1\126",
            "\1\130\27\uffff\1\132",
            "\1\133\27\uffff\1\135",
            "\1\136\27\uffff\1\140",
            "\1\141\27\uffff\1\143"
    };

    static final short[] DFA159_eot = DFA.unpackEncodedString(DFA159_eotS);
    static final short[] DFA159_eof = DFA.unpackEncodedString(DFA159_eofS);
    static final char[] DFA159_min = DFA.unpackEncodedStringToUnsignedChars(DFA159_minS);
    static final char[] DFA159_max = DFA.unpackEncodedStringToUnsignedChars(DFA159_maxS);
    static final short[] DFA159_accept = DFA.unpackEncodedString(DFA159_acceptS);
    static final short[] DFA159_special = DFA.unpackEncodedString(DFA159_specialS);
    static final short[][] DFA159_transition;

    static {
        int numStates = DFA159_transitionS.length;
        DFA159_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA159_transition[i] = DFA.unpackEncodedString(DFA159_transitionS[i]);
        }
    }

    class DFA159 extends DFA {

        public DFA159(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 159;
            this.eot = DFA159_eot;
            this.eof = DFA159_eof;
            this.min = DFA159_min;
            this.max = DFA159_max;
            this.accept = DFA159_accept;
            this.special = DFA159_special;
            this.transition = DFA159_transition;
        }
        public String getDescription() {
            return "65:1: delete_expr : ( 'DELETE' 'PSPRINGS' '*' 'OF' VARNAME | 'DELETE' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME | 'DELETE' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME | 'DELETE' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' 'ESPRINGS' '*' 'OF' VARNAME | 'DELETE' 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME | 'DELETE' 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME | 'DELETE' PROTOCOLS 'ESPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' 'ASPRINGS' '*' 'OF' VARNAME | 'DELETE' 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME | 'DELETE' 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME | 'DELETE' PROTOCOLS 'ASPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' 'GSPRINGS' '*' 'OF' VARNAME | 'DELETE' 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME | 'DELETE' 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME | 'DELETE' PROTOCOLS 'GSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' 'SPRINGS' '*' 'OF' VARNAME | 'DELETE' 'SPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'SPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' 'SINKHOLES' '*' 'OF' VARNAME | 'DELETE' 'SINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'SINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' 'PSINKHOLES' '*' 'OF' VARNAME | 'DELETE' 'PSINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'PSINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' PROTOCOLS 'PSINKHOLES' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' 'FILTERS' '*' | 'DELETE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) | 'DELETE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' 'FILTERS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'DELETE' 'FILTERS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) 'OF' VARNAME | 'DELETE' 'FILTERS' '*' 'OF' VARNAME | 'DELETE' 'FILTERS' ( VARNAME | ( VARNAME ',' )+ VARNAME ) 'OF' VARNAME );";
        }
    }
    static final String DFA300_eotS =
        "\u00b7\uffff";
    static final String DFA300_eofS =
        "\30\uffff\1\42\1\uffff\1\53\1\55\1\57\1\61\1\63\1\65\64\uffff\1"+
        "\144\1\146\1\150\1\152\1\154\1\156\1\160\1\162\1\uffff\1\173\1\175"+
        "\1\177\1\u0081\1\u0083\1\u0085\77\uffff\1\u00aa\1\u00ac\1\u00ae"+
        "\1\u00b0\1\u00b2\1\u00b4\1\u00b6\16\uffff";
    static final String DFA300_minS =
        "\1\62\1\5\2\13\1\36\1\17\2\25\1\13\1\27\16\uffff\1\21\1\25\6\21"+
        "\1\20\1\52\1\uffff\7\5\1\52\1\uffff\1\52\1\uffff\1\52\1\uffff\1"+
        "\52\1\uffff\1\52\1\uffff\1\52\1\uffff\1\36\1\15\17\uffff\1\15\1"+
        "\uffff\1\15\1\uffff\1\15\1\uffff\1\15\1\uffff\1\15\1\uffff\1\15"+
        "\1\uffff\1\13\7\53\1\21\1\25\6\21\16\uffff\1\52\1\uffff\7\5\1\52"+
        "\1\uffff\1\52\1\uffff\1\52\1\uffff\1\52\1\uffff\1\52\1\uffff\1\52"+
        "\1\uffff\1\15\17\uffff\1\15\1\uffff\1\15\1\uffff\1\15\1\uffff\1"+
        "\15\1\uffff\1\15\1\uffff\1\15\1\uffff\7\53\16\uffff";
    static final String DFA300_maxS =
        "\1\62\1\70\2\13\1\36\1\17\3\66\1\27\16\uffff\1\21\1\66\6\21\1\20"+
        "\1\53\1\uffff\7\21\1\53\1\uffff\1\53\1\uffff\1\53\1\uffff\1\53\1"+
        "\uffff\1\53\1\uffff\1\53\1\uffff\1\36\1\15\17\uffff\1\15\1\uffff"+
        "\1\15\1\uffff\1\15\1\uffff\1\15\1\uffff\1\15\1\uffff\1\15\1\uffff"+
        "\1\66\7\53\1\21\1\66\6\21\16\uffff\1\53\1\uffff\7\21\1\53\1\uffff"+
        "\1\53\1\uffff\1\53\1\uffff\1\53\1\uffff\1\53\1\uffff\1\53\1\uffff"+
        "\1\15\17\uffff\1\15\1\uffff\1\15\1\uffff\1\15\1\uffff\1\15\1\uffff"+
        "\1\15\1\uffff\1\15\1\uffff\7\53\16\uffff";
    static final String DFA300_acceptS =
        "\12\uffff\1\1\1\3\1\35\1\37\1\71\1\107\1\125\1\2\1\4\1\36\1\40\1"+
        "\72\1\110\1\126\12\uffff\1\5\10\uffff\1\13\1\uffff\1\41\1\uffff"+
        "\1\47\1\uffff\1\73\1\uffff\1\111\1\uffff\1\127\2\uffff\1\7\1\11"+
        "\1\12\1\17\1\20\1\45\1\46\1\53\1\54\1\77\1\100\1\115\1\116\1\133"+
        "\1\134\1\uffff\1\15\1\uffff\1\43\1\uffff\1\51\1\uffff\1\75\1\uffff"+
        "\1\113\1\uffff\1\131\20\uffff\1\10\1\6\1\16\1\14\1\44\1\42\1\52"+
        "\1\50\1\76\1\74\1\114\1\112\1\132\1\130\1\uffff\1\21\10\uffff\1"+
        "\27\1\uffff\1\55\1\uffff\1\63\1\uffff\1\101\1\uffff\1\117\1\uffff"+
        "\1\135\1\uffff\1\23\1\25\1\26\1\33\1\34\1\61\1\62\1\67\1\70\1\105"+
        "\1\106\1\123\1\124\1\141\1\142\1\uffff\1\31\1\uffff\1\57\1\uffff"+
        "\1\65\1\uffff\1\103\1\uffff\1\121\1\uffff\1\137\7\uffff\1\24\1\22"+
        "\1\32\1\30\1\60\1\56\1\66\1\64\1\104\1\102\1\122\1\120\1\140\1\136";
    static final String DFA300_specialS =
        "\u00b7\uffff}>";
    static final String[] DFA300_transitionS = {
            "\1\1",
            "\1\3\4\uffff\1\3\6\uffff\1\2\5\uffff\1\4\40\uffff\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\20\4\uffff\1\16\4\uffff\1\17\15\uffff\1\15\1\14\6\uffff"+
            "\1\13\1\12",
            "\1\27\4\uffff\1\25\4\uffff\1\26\15\uffff\1\24\1\23\6\uffff"+
            "\1\22\1\21",
            "\1\31\11\uffff\1\37\4\uffff\1\35\4\uffff\1\36\15\uffff\1\34"+
            "\1\33\6\uffff\1\32\1\30",
            "\1\40",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\41",
            "\1\51\4\uffff\1\47\4\uffff\1\50\15\uffff\1\46\1\45\6\uffff"+
            "\1\44\1\43",
            "\1\52",
            "\1\54",
            "\1\56",
            "\1\60",
            "\1\62",
            "\1\64",
            "\1\66",
            "\1\67\1\70",
            "",
            "\1\72\4\uffff\1\72\6\uffff\1\71",
            "\1\74\4\uffff\1\74\6\uffff\1\73",
            "\1\76\4\uffff\1\76\6\uffff\1\75",
            "\1\100\4\uffff\1\100\6\uffff\1\77",
            "\1\102\4\uffff\1\102\6\uffff\1\101",
            "\1\104\4\uffff\1\104\6\uffff\1\103",
            "\1\106\4\uffff\1\106\6\uffff\1\105",
            "\1\107\1\110",
            "",
            "\1\111\1\112",
            "",
            "\1\113\1\114",
            "",
            "\1\115\1\116",
            "",
            "\1\117\1\120",
            "",
            "\1\121\1\122",
            "",
            "\1\123",
            "\1\124",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\125",
            "",
            "\1\126",
            "",
            "\1\127",
            "",
            "\1\130",
            "",
            "\1\131",
            "",
            "\1\132",
            "",
            "\1\134\11\uffff\1\142\4\uffff\1\140\4\uffff\1\141\15\uffff"+
            "\1\137\1\136\6\uffff\1\135\1\133",
            "\1\143",
            "\1\145",
            "\1\147",
            "\1\151",
            "\1\153",
            "\1\155",
            "\1\157",
            "\1\161",
            "\1\171\4\uffff\1\167\4\uffff\1\170\15\uffff\1\166\1\165\6\uffff"+
            "\1\164\1\163",
            "\1\172",
            "\1\174",
            "\1\176",
            "\1\u0080",
            "\1\u0082",
            "\1\u0084",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0086\1\u0087",
            "",
            "\1\u0089\4\uffff\1\u0089\6\uffff\1\u0088",
            "\1\u008b\4\uffff\1\u008b\6\uffff\1\u008a",
            "\1\u008d\4\uffff\1\u008d\6\uffff\1\u008c",
            "\1\u008f\4\uffff\1\u008f\6\uffff\1\u008e",
            "\1\u0091\4\uffff\1\u0091\6\uffff\1\u0090",
            "\1\u0093\4\uffff\1\u0093\6\uffff\1\u0092",
            "\1\u0095\4\uffff\1\u0095\6\uffff\1\u0094",
            "\1\u0096\1\u0097",
            "",
            "\1\u0098\1\u0099",
            "",
            "\1\u009a\1\u009b",
            "",
            "\1\u009c\1\u009d",
            "",
            "\1\u009e\1\u009f",
            "",
            "\1\u00a0\1\u00a1",
            "",
            "\1\u00a2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a3",
            "",
            "\1\u00a4",
            "",
            "\1\u00a5",
            "",
            "\1\u00a6",
            "",
            "\1\u00a7",
            "",
            "\1\u00a8",
            "",
            "\1\u00a9",
            "\1\u00ab",
            "\1\u00ad",
            "\1\u00af",
            "\1\u00b1",
            "\1\u00b3",
            "\1\u00b5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA300_eot = DFA.unpackEncodedString(DFA300_eotS);
    static final short[] DFA300_eof = DFA.unpackEncodedString(DFA300_eofS);
    static final char[] DFA300_min = DFA.unpackEncodedStringToUnsignedChars(DFA300_minS);
    static final char[] DFA300_max = DFA.unpackEncodedStringToUnsignedChars(DFA300_maxS);
    static final short[] DFA300_accept = DFA.unpackEncodedString(DFA300_acceptS);
    static final short[] DFA300_special = DFA.unpackEncodedString(DFA300_specialS);
    static final short[][] DFA300_transition;

    static {
        int numStates = DFA300_transitionS.length;
        DFA300_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA300_transition[i] = DFA.unpackEncodedString(DFA300_transitionS[i]);
        }
    }

    class DFA300 extends DFA {

        public DFA300(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 300;
            this.eot = DFA300_eot;
            this.eof = DFA300_eof;
            this.min = DFA300_min;
            this.max = DFA300_max;
            this.accept = DFA300_accept;
            this.special = DFA300_special;
            this.transition = DFA300_transition;
        }
        public String getDescription() {
            return "117:1: select_expr : ( 'SELECT' '*' PROTOCOLS 'SPRINGS' | 'SELECT' ( DIGIT | NUMBER ) PROTOCOLS 'SPRINGS' | 'SELECT' '*' PROTOCOLS 'SINKHOLES' | 'SELECT' ( DIGIT | NUMBER ) PROTOCOLS 'SINKHOLES' | 'SELECT' 'DATARATE' 'FROM' 'SPRINGS' | 'SELECT' 'DATARATE' 'FROM' 'SPRINGS' '*' 'OF' VARNAME | 'SELECT' 'DATARATE' 'FROM' 'SPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' 'SPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'SPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'SPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' 'SINKHOLES' | 'SELECT' 'DATARATE' 'FROM' 'SINKHOLES' '*' 'OF' VARNAME | 'SELECT' 'DATARATE' 'FROM' 'SINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' 'SINKHOLES' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'SINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'SINKHOLES' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SPRINGS' | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SPRINGS' '*' 'OF' VARNAME | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'SPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'SPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SINKHOLES' | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SINKHOLES' '*' 'OF' VARNAME | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'SINKHOLES' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'SINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'SINKHOLES' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' '*' PROTOCOLS 'PSPRINGS' | 'SELECT' ( DIGIT | NUMBER ) PROTOCOLS 'PSPRINGS' | 'SELECT' '*' PROTOCOLS 'PSINKHOLES' | 'SELECT' ( DIGIT | NUMBER ) PROTOCOLS 'PSINKHOLES' | 'SELECT' 'DATARATE' 'FROM' 'PSPRINGS' | 'SELECT' 'DATARATE' 'FROM' 'PSPRINGS' '*' 'OF' VARNAME | 'SELECT' 'DATARATE' 'FROM' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' 'PSPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' 'PSINKHOLES' | 'SELECT' 'DATARATE' 'FROM' 'PSINKHOLES' '*' 'OF' VARNAME | 'SELECT' 'DATARATE' 'FROM' 'PSINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' 'PSINKHOLES' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'PSINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'PSINKHOLES' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSPRINGS' | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSPRINGS' '*' 'OF' VARNAME | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'PSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'PSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSINKHOLES' | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSINKHOLES' '*' 'OF' VARNAME | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'PSINKHOLES' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'PSINKHOLES' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'PSINKHOLES' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' '*' PROTOCOLS 'ESPRINGS' | 'SELECT' ( DIGIT | NUMBER ) PROTOCOLS 'ESPRINGS' | 'SELECT' 'DATARATE' 'FROM' 'ESPRINGS' | 'SELECT' 'DATARATE' 'FROM' 'ESPRINGS' '*' 'OF' VARNAME | 'SELECT' 'DATARATE' 'FROM' 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' 'ESPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'ESPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'ESPRINGS' | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'ESPRINGS' '*' 'OF' VARNAME | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'ESPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'ESPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'ESPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' '*' PROTOCOLS 'GSPRINGS' | 'SELECT' ( DIGIT | NUMBER ) PROTOCOLS 'GSPRINGS' | 'SELECT' 'DATARATE' 'FROM' 'GSPRINGS' | 'SELECT' 'DATARATE' 'FROM' 'GSPRINGS' '*' 'OF' VARNAME | 'SELECT' 'DATARATE' 'FROM' 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' 'GSPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'GSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'GSPRINGS' | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'GSPRINGS' '*' 'OF' VARNAME | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'GSPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'GSPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'GSPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' '*' PROTOCOLS 'ASPRINGS' | 'SELECT' ( DIGIT | NUMBER ) PROTOCOLS 'ASPRINGS' | 'SELECT' 'DATARATE' 'FROM' 'ASPRINGS' | 'SELECT' 'DATARATE' 'FROM' 'ASPRINGS' '*' 'OF' VARNAME | 'SELECT' 'DATARATE' 'FROM' 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' 'ASPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'DATARATE' 'FROM' PROTOCOLS 'ASPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'ASPRINGS' | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'ASPRINGS' '*' 'OF' VARNAME | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' 'ASPRINGS' '*' 'OF' VARNAME 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'ASPRINGS' '*' 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) | 'SELECT' 'SUM' '(' 'DATARATE' ')' 'FROM' PROTOCOLS 'ASPRINGS' ( ( DIGIT | NUMBER ) | ( ( ( DIGIT | NUMBER ) ',' )+ ( DIGIT | NUMBER ) ) ) 'ON' ( HOSTNAME | ( ( HOSTNAME ',' )+ HOSTNAME ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_create_expr_in_expr17 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_expr_in_expr21 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_expr_in_expr25 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_status_expr_in_expr29 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_allocation_expr_in_expr33 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deallocation_expr_in_expr37 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_create_expr53 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr55 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_create_expr61 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_create_expr62 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_create_expr63 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_FILEPATH_in_create_expr64 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_create_expr65 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_create_expr66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_create_expr73 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr75 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_create_expr81 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_create_expr82 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_create_expr83 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_FILEPATH_in_create_expr84 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_create_expr85 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr87 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr91 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_create_expr92 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr96 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_create_expr99 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_create_expr100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_create_expr106 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr108 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_create_expr114 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_create_expr115 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_create_expr116 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_FILEPATH_in_create_expr117 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_create_expr118 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr120 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr124 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_create_expr125 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr129 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_create_expr132 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_create_expr133 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_create_expr134 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_create_expr135 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_create_expr153 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr154 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_create_expr160 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_create_expr161 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_create_expr162 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr164 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr168 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_create_expr169 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr173 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_create_expr176 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_create_expr177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_create_expr190 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr191 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_create_expr197 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_create_expr198 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_create_expr199 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr201 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr205 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_create_expr206 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr210 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_create_expr213 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_create_expr214 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_create_expr215 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_create_expr216 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_create_expr245 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_create_expr246 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_X_Y_EXPR_in_create_expr247 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_create_expr248 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_create_expr249 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_create_expr250 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_create_expr251 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DRANGE_in_create_expr252 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_create_expr253 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_create_expr254 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_create_expr265 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_create_expr266 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_create_expr267 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_create_expr268 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_create_expr269 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_create_expr270 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_create_expr271 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DRANGE_in_create_expr272 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_create_expr273 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_create_expr274 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_create_expr291 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr293 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_create_expr299 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_create_expr301 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_create_expr302 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_create_expr303 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_create_expr304 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_MATRIXDEF_in_create_expr305 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_create_expr306 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_create_expr319 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr321 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_create_expr327 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_create_expr329 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_create_expr330 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_create_expr331 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr333 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr337 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_create_expr338 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr342 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_create_expr345 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_create_expr346 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_MATRIXDEF_in_create_expr347 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_create_expr348 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_create_expr359 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr361 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_create_expr367 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_create_expr369 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_create_expr370 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_create_expr371 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr373 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr377 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_create_expr378 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr382 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_create_expr385 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_create_expr386 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_create_expr387 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_create_expr388 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_MATRIXDEF_in_create_expr389 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_create_expr390 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_create_expr403 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr405 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_create_expr411 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_create_expr413 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_create_expr414 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_create_expr415 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr417 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr421 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_create_expr422 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr426 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_create_expr429 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_create_expr430 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_create_expr431 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_create_expr432 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr433 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_create_expr438 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_create_expr439 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_MATRIXDEF_in_create_expr440 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_create_expr441 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_create_expr462 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr464 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_create_expr470 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_create_expr472 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_create_expr473 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_URLPATH_in_create_expr474 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_create_expr475 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_create_expr476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_create_expr484 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr486 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_create_expr492 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_create_expr494 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_create_expr495 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_URLPATH_in_create_expr496 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_create_expr497 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr499 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr503 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_create_expr504 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr508 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_create_expr511 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_create_expr512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_create_expr520 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr522 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_create_expr528 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_create_expr530 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_create_expr531 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_URLPATH_in_create_expr532 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_create_expr533 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr535 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr539 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_create_expr540 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr544 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_create_expr547 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_create_expr548 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_create_expr549 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_create_expr550 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr551 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_create_expr556 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_create_expr557 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_create_expr572 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr574 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_create_expr580 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_create_expr582 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_create_expr583 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_URLPATH_in_create_expr584 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_create_expr585 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr587 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr591 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_create_expr592 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr596 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_create_expr599 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_create_expr600 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_create_expr601 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_create_expr602 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr603 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_create_expr608 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_create_expr609 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr610 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_create_expr615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_create_expr625 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr627 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_create_expr633 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_create_expr635 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_create_expr636 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_URLPATH_in_create_expr637 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_create_expr638 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr644 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_create_expr645 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_create_expr659 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr661 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_create_expr667 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_create_expr669 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_create_expr670 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_URLPATH_in_create_expr671 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_create_expr672 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr674 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr678 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_create_expr679 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr683 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_create_expr686 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_create_expr687 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr688 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_create_expr693 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_create_expr694 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_create_expr709 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr711 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_create_expr717 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_create_expr719 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_create_expr720 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_URLPATH_in_create_expr721 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_create_expr722 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr724 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr728 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_create_expr729 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr733 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_create_expr736 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_create_expr737 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr738 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_create_expr743 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_create_expr744 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr745 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_create_expr750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_create_expr775 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr777 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_create_expr783 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_create_expr785 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_create_expr786 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_URLPATH_in_create_expr787 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_create_expr788 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_create_expr789 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_create_expr790 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_create_expr791 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr792 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_create_expr797 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_URLPATH_in_create_expr798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_create_expr807 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr809 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_create_expr815 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_create_expr817 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_create_expr818 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_URLPATH_in_create_expr819 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_create_expr820 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr822 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr826 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_create_expr827 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_create_expr831 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_create_expr834 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_create_expr835 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_create_expr836 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_create_expr837 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_create_expr838 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_create_expr843 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_URLPATH_in_create_expr844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_allocation_expr854 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_allocation_expr855 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_allocation_expr857 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_VARNAME_in_allocation_expr860 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_allocation_expr861 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_allocation_expr864 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_allocation_expr866 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_allocation_expr867 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_allocation_expr869 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_allocation_expr871 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_set_in_allocation_expr879 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_allocation_expr884 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_allocation_expr888 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_allocation_expr895 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_allocation_expr897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_allocation_expr901 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_allocation_expr902 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_allocation_expr906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_allocation_expr914 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_allocation_expr915 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_allocation_expr917 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_VARNAME_in_allocation_expr920 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_allocation_expr921 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_allocation_expr924 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_allocation_expr926 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_allocation_expr927 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_allocation_expr929 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_allocation_expr931 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_set_in_allocation_expr939 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_allocation_expr944 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_allocation_expr948 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_allocation_expr955 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_allocation_expr957 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_HOSTNAME_in_allocation_expr961 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_allocation_expr962 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_allocation_expr966 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_allocation_expr969 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_allocation_expr970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_deallocation_expr985 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_deallocation_expr986 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_deallocation_expr987 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_deallocation_expr988 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_deallocation_expr989 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_deallocation_expr990 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_deallocation_expr992 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_set_in_deallocation_expr1000 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_deallocation_expr1005 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_deallocation_expr1009 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_deallocation_expr1016 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_deallocation_expr1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_deallocation_expr1022 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_deallocation_expr1023 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_deallocation_expr1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_deallocation_expr1037 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_deallocation_expr1038 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_deallocation_expr1039 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_deallocation_expr1040 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_deallocation_expr1041 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_deallocation_expr1042 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_deallocation_expr1043 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_deallocation_expr1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_deallocation_expr1049 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_deallocation_expr1050 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_deallocation_expr1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_deallocation_expr1066 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_deallocation_expr1067 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_deallocation_expr1068 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_deallocation_expr1069 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_deallocation_expr1070 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_deallocation_expr1071 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_deallocation_expr1072 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_deallocation_expr1074 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_HOSTNAME_in_deallocation_expr1078 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_deallocation_expr1079 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_deallocation_expr1083 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_deallocation_expr1086 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_deallocation_expr1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARNAME_in_deallocation_expr1091 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_deallocation_expr1092 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_deallocation_expr1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_deallocation_expr1106 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_deallocation_expr1107 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_deallocation_expr1109 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_VARNAME_in_deallocation_expr1112 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_deallocation_expr1113 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_deallocation_expr1116 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_deallocation_expr1118 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_deallocation_expr1119 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_deallocation_expr1120 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_deallocation_expr1121 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_deallocation_expr1123 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_HOSTNAME_in_deallocation_expr1127 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_deallocation_expr1128 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_deallocation_expr1132 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_deallocation_expr1135 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_deallocation_expr1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARNAME_in_deallocation_expr1140 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_deallocation_expr1141 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_deallocation_expr1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_deallocation_expr1164 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_deallocation_expr1165 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_deallocation_expr1166 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_deallocation_expr1167 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_deallocation_expr1168 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_deallocation_expr1169 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_deallocation_expr1170 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_deallocation_expr1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARNAME_in_deallocation_expr1175 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_deallocation_expr1176 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_deallocation_expr1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_deallocation_expr1190 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_deallocation_expr1191 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_deallocation_expr1193 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_VARNAME_in_deallocation_expr1196 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_deallocation_expr1197 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_deallocation_expr1200 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_deallocation_expr1202 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_deallocation_expr1203 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_deallocation_expr1204 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_deallocation_expr1205 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_deallocation_expr1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_deallocation_expr1211 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_deallocation_expr1212 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_deallocation_expr1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_deallocation_expr1230 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_deallocation_expr1231 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_deallocation_expr1233 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_VARNAME_in_deallocation_expr1236 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_deallocation_expr1237 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_deallocation_expr1240 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_deallocation_expr1242 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_deallocation_expr1243 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_deallocation_expr1245 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_set_in_deallocation_expr1253 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_deallocation_expr1258 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_deallocation_expr1262 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_deallocation_expr1269 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_deallocation_expr1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_deallocation_expr1275 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_deallocation_expr1276 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_deallocation_expr1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_deallocation_expr1295 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_deallocation_expr1296 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_deallocation_expr1297 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_deallocation_expr1298 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_deallocation_expr1299 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_deallocation_expr1301 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_set_in_deallocation_expr1309 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_deallocation_expr1314 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_deallocation_expr1318 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_deallocation_expr1325 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_deallocation_expr1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_deallocation_expr1331 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_deallocation_expr1332 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_deallocation_expr1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_deallocation_expr1351 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_deallocation_expr1352 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_deallocation_expr1354 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_VARNAME_in_deallocation_expr1357 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_deallocation_expr1358 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_deallocation_expr1361 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_deallocation_expr1363 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_deallocation_expr1364 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_deallocation_expr1366 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_deallocation_expr1368 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_set_in_deallocation_expr1376 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_deallocation_expr1381 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_deallocation_expr1385 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_deallocation_expr1392 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_deallocation_expr1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_deallocation_expr1398 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_deallocation_expr1399 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_deallocation_expr1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr1430 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_delete_expr1431 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_delete_expr1432 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_delete_expr1433 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_delete_expr1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr1447 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_delete_expr1448 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_delete_expr1449 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_delete_expr1450 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1456 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr1457 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr1476 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_delete_expr1477 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_delete_expr1479 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_delete_expr1480 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_delete_expr1481 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1487 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr1488 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr1507 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_delete_expr1508 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_delete_expr1510 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_delete_expr1511 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_delete_expr1512 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1514 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1518 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr1519 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1523 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_delete_expr1526 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_delete_expr1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr1540 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_delete_expr1541 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_delete_expr1542 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_delete_expr1543 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1545 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1549 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr1550 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1554 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_delete_expr1557 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_delete_expr1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr1564 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_delete_expr1565 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_delete_expr1567 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_delete_expr1569 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_set_in_delete_expr1577 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr1582 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_delete_expr1586 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_delete_expr1593 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1599 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr1600 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr1625 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_delete_expr1626 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_delete_expr1627 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_delete_expr1628 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_delete_expr1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr1642 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_delete_expr1643 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_delete_expr1644 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_delete_expr1645 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1651 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr1652 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr1671 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_delete_expr1672 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_delete_expr1674 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_delete_expr1675 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_delete_expr1676 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1682 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr1683 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr1702 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_delete_expr1703 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_delete_expr1705 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_delete_expr1706 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_delete_expr1707 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1709 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1713 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr1714 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1718 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_delete_expr1721 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_delete_expr1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr1735 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_delete_expr1736 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_delete_expr1737 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_delete_expr1738 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1740 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1744 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr1745 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1749 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_delete_expr1752 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_delete_expr1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr1759 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_delete_expr1760 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_delete_expr1762 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_delete_expr1764 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_set_in_delete_expr1772 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr1777 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_delete_expr1781 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_delete_expr1788 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1794 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr1795 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr1811 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_delete_expr1812 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_delete_expr1813 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_delete_expr1814 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_delete_expr1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr1828 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_delete_expr1829 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_delete_expr1830 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_delete_expr1831 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1837 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr1838 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr1857 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_delete_expr1858 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_delete_expr1860 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_delete_expr1861 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_delete_expr1862 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1868 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr1869 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr1888 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_delete_expr1889 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_delete_expr1891 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_delete_expr1892 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_delete_expr1893 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1895 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1899 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr1900 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1904 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_delete_expr1907 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_delete_expr1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr1921 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_delete_expr1922 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_delete_expr1923 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_delete_expr1924 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1926 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1930 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr1931 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1935 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_delete_expr1938 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_delete_expr1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr1945 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_delete_expr1946 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_delete_expr1948 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_delete_expr1950 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_set_in_delete_expr1958 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr1963 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_delete_expr1967 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_delete_expr1974 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1980 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr1981 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr2001 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_delete_expr2002 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_delete_expr2003 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_delete_expr2004 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_delete_expr2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr2018 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_delete_expr2019 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_delete_expr2020 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_delete_expr2021 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2027 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr2028 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr2047 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_delete_expr2048 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_delete_expr2050 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_delete_expr2051 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_delete_expr2052 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2058 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr2059 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr2078 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_delete_expr2079 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_delete_expr2081 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_delete_expr2082 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_delete_expr2083 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2085 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2089 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr2090 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2094 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_delete_expr2097 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_delete_expr2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr2111 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_delete_expr2112 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_delete_expr2113 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_delete_expr2114 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2116 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2120 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr2121 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2125 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_delete_expr2128 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_delete_expr2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr2135 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_delete_expr2136 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_delete_expr2138 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_delete_expr2140 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_set_in_delete_expr2148 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr2153 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_delete_expr2157 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_delete_expr2164 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2170 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr2171 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr2194 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_delete_expr2195 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_delete_expr2196 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_delete_expr2197 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_delete_expr2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr2211 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_delete_expr2212 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_delete_expr2213 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_delete_expr2214 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2220 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr2221 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr2240 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_delete_expr2241 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_delete_expr2243 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_delete_expr2244 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_delete_expr2245 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2251 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr2252 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr2271 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_delete_expr2272 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_delete_expr2273 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_delete_expr2274 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_delete_expr2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr2288 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_delete_expr2289 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_delete_expr2290 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_delete_expr2291 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2297 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr2298 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr2317 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_delete_expr2318 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_delete_expr2320 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_delete_expr2321 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_delete_expr2322 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2328 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr2329 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr2345 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_delete_expr2346 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_delete_expr2347 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_delete_expr2348 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_delete_expr2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr2362 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_delete_expr2363 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_delete_expr2364 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_delete_expr2365 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2371 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr2372 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr2391 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_delete_expr2392 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_delete_expr2394 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_delete_expr2395 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_delete_expr2396 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2402 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr2403 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr2415 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_delete_expr2416 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_delete_expr2418 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_delete_expr2420 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_set_in_delete_expr2428 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr2433 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_delete_expr2437 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_delete_expr2444 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2450 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr2451 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr2467 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_delete_expr2468 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_delete_expr2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr2475 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_delete_expr2476 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_delete_expr2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARNAME_in_delete_expr2481 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr2482 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_delete_expr2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr2492 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_delete_expr2493 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_delete_expr2495 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_VARNAME_in_delete_expr2498 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr2499 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_delete_expr2502 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_delete_expr2504 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2510 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr2511 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr2523 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_delete_expr2524 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_delete_expr2525 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_delete_expr2526 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2532 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr2533 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr2547 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_delete_expr2548 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_delete_expr2549 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_delete_expr2550 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2552 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2556 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr2557 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_delete_expr2561 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_delete_expr2564 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_delete_expr2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr2573 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_delete_expr2574 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_delete_expr2575 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_delete_expr2576 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_delete_expr2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_delete_expr2585 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_delete_expr2586 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_delete_expr2588 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_VARNAME_in_delete_expr2591 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_delete_expr2592 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_delete_expr2595 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_delete_expr2597 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_delete_expr2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr2617 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr2618 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr2620 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_select_expr2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr2628 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr2629 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr2635 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_select_expr2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr2643 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr2644 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr2646 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_select_expr2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr2654 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr2655 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr2661 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_select_expr2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr2678 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr2679 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr2680 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_select_expr2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr2690 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr2691 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr2692 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_select_expr2693 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr2694 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_select_expr2695 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_select_expr2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr2704 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr2705 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr2706 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_select_expr2707 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr2708 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr2709 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr2715 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr2716 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr2728 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr2729 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr2730 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_select_expr2731 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr2732 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_select_expr2733 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_select_expr2734 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr2735 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr2741 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr2742 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr2754 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr2755 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr2756 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr2757 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_select_expr2759 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr2760 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr2761 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr2767 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr2768 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr2772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr2780 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr2781 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr2782 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr2783 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_select_expr2785 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr2787 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_set_in_select_expr2795 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr2800 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr2804 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr2811 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr2817 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr2818 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr2842 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr2843 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr2844 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_select_expr2845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr2854 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr2855 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr2856 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_select_expr2857 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr2858 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_select_expr2859 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_select_expr2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr2868 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr2869 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr2870 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_select_expr2871 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr2872 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr2873 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr2879 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr2880 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr2892 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr2893 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr2894 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_select_expr2895 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr2896 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_select_expr2897 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_select_expr2898 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr2899 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr2905 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr2906 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr2918 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr2919 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr2920 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr2921 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_select_expr2923 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr2924 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr2925 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr2931 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr2932 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr2944 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr2945 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr2946 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr2947 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_select_expr2949 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr2951 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_set_in_select_expr2959 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr2964 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr2968 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr2975 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr2977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr2981 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr2982 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3002 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr3003 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr3004 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3005 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr3006 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3007 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_select_expr3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3017 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr3018 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr3019 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3020 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr3021 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3022 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_select_expr3023 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr3024 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_select_expr3025 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_select_expr3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3034 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr3035 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr3036 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3037 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr3038 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3039 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_select_expr3040 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr3041 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr3042 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3048 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr3049 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3061 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr3062 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr3063 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3064 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr3065 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3066 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_select_expr3067 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr3068 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_select_expr3069 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_select_expr3070 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr3071 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3077 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr3078 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3090 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr3091 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr3092 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3093 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr3094 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3095 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr3096 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_select_expr3098 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr3099 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr3100 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3106 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr3107 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3119 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr3120 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr3121 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3122 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr3123 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3124 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr3125 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_select_expr3127 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr3129 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_set_in_select_expr3137 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr3142 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr3146 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr3153 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3159 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr3160 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3184 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr3185 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr3186 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3187 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr3188 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3189 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_select_expr3190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3199 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr3200 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr3201 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3202 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr3203 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3204 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_select_expr3205 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr3206 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_select_expr3207 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_select_expr3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3216 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr3217 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr3218 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3219 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr3220 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3221 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_select_expr3222 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr3223 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr3224 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3230 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr3231 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3243 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr3244 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr3245 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3246 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr3247 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3248 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_select_expr3249 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr3250 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_select_expr3251 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_select_expr3252 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr3253 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3259 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr3260 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3272 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr3273 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr3274 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3275 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr3276 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3277 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr3278 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_select_expr3280 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr3281 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr3282 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3288 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr3289 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3301 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr3302 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr3303 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3304 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr3305 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3306 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr3307 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_select_expr3309 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr3311 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_set_in_select_expr3319 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr3324 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr3328 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr3335 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3341 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr3342 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3364 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr3365 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr3367 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_select_expr3369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3375 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr3376 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr3382 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_select_expr3384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3390 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr3391 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr3393 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_select_expr3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3401 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr3402 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr3408 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_select_expr3410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3425 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3426 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3427 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_select_expr3428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3437 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3438 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3439 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_select_expr3440 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr3441 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_select_expr3442 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_select_expr3443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3451 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3452 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3453 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_select_expr3454 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr3455 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr3456 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3462 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr3463 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3475 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3476 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3477 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_select_expr3478 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr3479 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_select_expr3480 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_select_expr3481 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr3482 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3488 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr3489 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3501 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3502 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3503 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr3504 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_select_expr3506 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr3507 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr3508 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3514 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr3515 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3527 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3528 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3529 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr3530 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_select_expr3532 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr3534 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_set_in_select_expr3542 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr3547 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr3551 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr3558 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3564 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr3565 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3589 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3590 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3591 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_select_expr3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3601 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3602 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3603 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_select_expr3604 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr3605 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_select_expr3606 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_select_expr3607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3615 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3616 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3617 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_select_expr3618 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr3619 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr3620 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3626 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr3627 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3639 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3640 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3641 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_select_expr3642 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr3643 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_select_expr3644 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_select_expr3645 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr3646 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3652 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr3653 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3665 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3666 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3667 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr3668 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_select_expr3670 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr3671 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr3672 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3678 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr3679 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3691 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3692 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3693 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr3694 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_select_expr3696 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr3698 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_set_in_select_expr3706 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr3711 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr3715 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr3722 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3728 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr3729 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3749 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr3750 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr3751 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3752 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr3753 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3754 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_select_expr3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3764 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr3765 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr3766 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3767 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr3768 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3769 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_select_expr3770 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr3771 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_select_expr3772 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_select_expr3773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3781 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr3782 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr3783 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3784 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr3785 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3786 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_select_expr3787 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr3788 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr3789 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3795 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr3796 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3808 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr3809 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr3810 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3811 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr3812 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3813 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_select_expr3814 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr3815 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_select_expr3816 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_select_expr3817 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr3818 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3824 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr3825 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3837 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr3838 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr3839 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3840 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr3841 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3842 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr3843 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_select_expr3845 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr3846 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr3847 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3853 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr3854 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3866 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr3867 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr3868 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3869 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr3870 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3871 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr3872 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_select_expr3874 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr3876 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_set_in_select_expr3884 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr3889 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr3893 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr3900 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3906 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr3907 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3931 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr3932 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr3933 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3934 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr3935 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3936 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_select_expr3937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3946 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr3947 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr3948 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3949 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr3950 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3951 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_select_expr3952 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr3953 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_select_expr3954 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_select_expr3955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3963 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr3964 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr3965 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3966 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr3967 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3968 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_select_expr3969 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr3970 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr3971 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3977 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr3978 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr3990 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr3991 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr3992 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr3993 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr3994 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr3995 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_select_expr3996 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr3997 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_select_expr3998 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_select_expr3999 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr4000 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4006 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr4007 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4019 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr4020 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr4021 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr4022 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr4023 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr4024 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr4025 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_select_expr4027 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr4028 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr4029 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4035 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr4036 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4048 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr4049 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr4050 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr4051 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr4052 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr4053 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr4054 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_select_expr4056 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr4058 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_set_in_select_expr4066 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr4071 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr4075 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr4082 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4088 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr4089 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4110 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr4111 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr4113 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_select_expr4115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4121 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr4122 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr4128 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_select_expr4130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4145 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr4146 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr4147 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_select_expr4148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4157 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr4158 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr4159 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_select_expr4160 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr4161 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_select_expr4162 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_select_expr4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4171 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr4172 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr4173 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_select_expr4174 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr4175 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr4176 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4182 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr4183 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4195 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr4196 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr4197 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_select_expr4198 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr4199 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_select_expr4200 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_select_expr4201 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr4202 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4208 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr4209 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4221 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr4222 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr4223 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr4224 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_select_expr4226 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr4227 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr4228 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4234 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr4235 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4247 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr4248 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr4249 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr4250 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_select_expr4252 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr4254 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_set_in_select_expr4262 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr4267 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr4271 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr4278 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4284 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr4285 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4304 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr4305 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr4306 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr4307 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr4308 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr4309 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_select_expr4310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4319 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr4320 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr4321 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr4322 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr4323 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr4324 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_select_expr4325 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr4326 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_select_expr4327 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_select_expr4328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4336 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr4337 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr4338 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr4339 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr4340 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr4341 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_select_expr4342 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr4343 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr4344 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4350 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr4351 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4363 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr4364 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr4365 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr4366 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr4367 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr4368 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_select_expr4369 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr4370 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_select_expr4371 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_select_expr4372 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr4373 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4379 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr4380 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4392 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr4393 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr4394 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr4395 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr4396 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr4397 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr4398 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_select_expr4400 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr4401 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr4402 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4408 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr4409 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4421 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr4422 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr4423 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr4424 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr4425 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr4426 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr4427 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_select_expr4429 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr4431 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_set_in_select_expr4439 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr4444 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr4448 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr4455 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4461 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr4462 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4483 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr4484 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr4486 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_select_expr4488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4494 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr4495 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr4501 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_select_expr4503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4518 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr4519 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr4520 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_select_expr4521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4530 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr4531 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr4532 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_select_expr4533 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr4534 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_select_expr4535 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_select_expr4536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4544 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr4545 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr4546 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_select_expr4547 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr4548 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr4549 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4555 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr4556 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4568 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr4569 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr4570 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_select_expr4571 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr4572 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_select_expr4573 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_select_expr4574 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr4575 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4581 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr4582 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4594 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr4595 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr4596 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr4597 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_select_expr4599 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr4600 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr4601 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4607 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr4608 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4620 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr4621 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr4622 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr4623 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_select_expr4625 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr4627 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_set_in_select_expr4635 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr4640 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr4644 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr4651 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4657 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr4658 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4677 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr4678 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr4679 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr4680 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr4681 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr4682 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_select_expr4683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4692 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr4693 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr4694 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr4695 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr4696 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr4697 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_select_expr4698 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr4699 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_select_expr4700 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_select_expr4701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4709 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr4710 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr4711 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr4712 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr4713 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr4714 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_select_expr4715 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr4716 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr4717 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4723 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr4724 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4736 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr4737 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr4738 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr4739 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr4740 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr4741 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_select_expr4742 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr4743 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_select_expr4744 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_select_expr4745 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr4746 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4752 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr4753 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4765 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr4766 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr4767 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr4768 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr4769 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr4770 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr4771 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_select_expr4773 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr4774 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr4775 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4781 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr4782 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4794 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr4795 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr4796 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr4797 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr4798 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr4799 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr4800 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_select_expr4802 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr4804 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_set_in_select_expr4812 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr4817 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr4821 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr4828 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4834 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr4835 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4856 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr4857 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr4859 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_select_expr4861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4867 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr4868 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr4874 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_select_expr4876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4891 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr4892 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr4893 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_select_expr4894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4903 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr4904 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr4905 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_select_expr4906 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr4907 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_select_expr4908 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_select_expr4909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4917 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr4918 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr4919 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_select_expr4920 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr4921 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr4922 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4928 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr4929 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4941 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr4942 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr4943 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_select_expr4944 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr4945 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_select_expr4946 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_select_expr4947 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr4948 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4954 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr4955 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4967 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr4968 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr4969 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr4970 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_select_expr4972 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr4973 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr4974 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4980 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr4981 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr4985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr4993 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr4994 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr4995 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr4996 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_select_expr4998 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr5000 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_set_in_select_expr5008 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr5013 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr5017 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr5024 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr5026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr5030 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr5031 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr5035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr5050 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr5051 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr5052 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr5053 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr5054 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr5055 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_select_expr5056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr5065 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr5066 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr5067 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr5068 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr5069 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr5070 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_select_expr5071 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr5072 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_select_expr5073 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_select_expr5074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr5082 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr5083 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr5084 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr5085 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr5086 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr5087 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_select_expr5088 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr5089 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr5090 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr5092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr5096 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr5097 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr5101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr5109 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr5110 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr5111 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr5112 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr5113 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr5114 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_select_expr5115 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr5116 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_select_expr5117 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_select_expr5118 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr5119 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr5121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr5125 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr5126 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr5130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr5138 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr5139 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr5140 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr5141 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr5142 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr5143 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr5144 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_select_expr5146 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_select_expr5147 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr5148 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr5150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr5154 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr5155 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr5159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_select_expr5167 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_select_expr5168 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_select_expr5169 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_select_expr5170 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_select_expr5171 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_select_expr5172 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PROTOCOLS_in_select_expr5173 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_select_expr5175 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr5177 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_set_in_select_expr5185 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr5190 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_set_in_select_expr5194 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_select_expr5201 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr5203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr5207 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_select_expr5208 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_HOSTNAME_in_select_expr5212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_status_expr5224 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_status_expr5225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_status_expr5231 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_status_expr5232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_status_expr5238 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_status_expr5239 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_status_expr5240 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_status_expr5241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_status_expr5247 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_status_expr5248 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_status_expr5249 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_status_expr5250 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VARNAME_in_status_expr5251 = new BitSet(new long[]{0x0000000000000002L});

}
