#Printing header
print("***********************************")
print("*           Use of libs           *")
print("***********************************")

import sys

def useofsys():
    print("Use of sys")
    print("Path: "+str(sys.path))
    print("Version: "+str(sys.version))
    print("Version info: "+str(sys.version_info))
    print("Executable: "+str(sys.executable))
    print("Platform: "+str(sys.platform))

useofsys()
print("--------------------------------------------------")

#import pandas as pd

"""def useofpandas():
    print("use of pandas")
    df = pd.DataFrame({'col1': [1, 2], 'col2': [3, 4]})
    print(df)
    
useofpandas()
print("--------------------------------------------------")"""

import logging

def useoflogging():
    print("Use of logging")
    logging.basicConfig(filename='./src/pythonjavaintegration/pythoncodes/example.log',level=logging.DEBUG)
    logging.debug(' This message should go to the log file')
    logging.info(' So should this')
    logging.warning(' And this, too')
    print("Log file -> ./src/pythonjavaintegration/pythoncodes/example.log")

useoflogging()
print("--------------------------------------------------")

import getopt 
#Import is ok so code will work in jython (not implemented due to the java code structure implemented)
#To use args in the java code, check mainExample folder (not using jython)
#With PythonInterpreter (set() function), you can set arguments to the python code

"""def useofgetopt():
    print("Use of getopt")
    argv = sys.argv[1:]
    try:
        opts, args = getopt.getopt(argv,"hi:o:",["ifile=","ofile="])
    except getopt.GetoptError:
        print('test.py -i <inputfile> -o <outputfile>')
        sys.exit(2)
    for opt, arg in opts:
        if opt == '-h':
            print('test.py -i <inputfile> -o <outputfile>')
            sys.exit()
        elif opt in ("-i", "--ifile"):
            print("Input file: "+arg)
        elif opt in ("-o", "--ofile"):
            print("Output file: "+arg)

useofgetopt()"""
