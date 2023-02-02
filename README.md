# Translation generators

These two scripts will help you to easily convert .arb files to .xlsx and vice versa. Scripts are written in Python.



### Requirements

Before running the scripts, you must install the following libraries:

- Python 3.x
- os
- csv
- json
- collections
- Tkinter library (pre-installed in most Python installations)
- pandas
- openpyxl
- PIL

You can install the libraries by running the following command in your terminal:
```bash
pip install os csv json collections tkinter pandas openpyxl pillow
#pip3 install os csv json collections tkinter pandas openpyxl pillow
```

### How to Run 🚀

To run one of the scripts (e.g.'arb_to_excel.py'), open a terminal, navigate to the folder containing the script, and run the following command:
```bash
python arb_to_excel.py
#python3 arb_to_excel.py
```


## Script 1: 'arb_to_excel.py'

This script helps you generate a translation file (in .xlsx format) from multiple .arb files in a project folder.

Here is the example:
|Arb to Excel                                  |
|:-------------------------------------------: |
|![](arb_to_excel.gif) |

### How To Use 🚀
```bash
python arb_to_excel.py
#python3 arb_to_excel.py
```
This script contains functions to select the root of project folder, parse the ARB files, and generate Excel file. The following steps are performed:
* Selecting the "project_name" folder
* The path of the "project_name" folder is extracted
* A list of all the .arb files in the "/lib/l10n" folder is created
* First, the contents of the "intl_en.arb" file are parsed as a JSON object
* The contents of the remaining .arb files are parsed as JSON objects and appended to the data dictionary
* .arb files are converted to an Excel file and saved in the "/lib/l10n" folder

## Script 2: 'excel_to_arb.py'

This script helps you generate a multiple .arb files from excel file. If the value doesn't exists, you won't see that key-value pair in the .arb file

Here is the example:
|Excel to Arb                                  |
|:-------------------------------------------: |
|![](excel_to_arb.gif) |

### How To Use 🚀
```bash
python excel_to_arb.py
#python3 excel_to_arb.py
```
This script contains functions to select the excel file, select destination folder where .arb files will be saved. The following steps are performed:
* Selecting the .xlsx file
* Selecting destination folder where .arb files will be sabed
* After clicking generate, script is converting excel to CSV file and then to a dictionary
* The dictionary is then used to generate .arb files for different languages.

 
# Contributors ✨

<a href="https://hr.linkedin.com/in/adrijanomicevic"><img src="https://media-exp1.licdn.com/dms/image/C4E03AQGrVjCdENO4Bg/profile-displayphoto-shrink_200_200/0/1648504265358?e=2147483647&v=beta&t=bZ5pols8a-FTl7Q4F6ADIbt4Hagl66Cg_5aS7eeT5Ig" width="100px;"><br /><sub><b>Adrijan Omićević</b></sub></a>

