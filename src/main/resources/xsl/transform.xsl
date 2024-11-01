<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html" encoding="UTF-8" indent="yes"/>

    <xsl:template match="/">
        <html>
            <head>
                <title>Sportsmen List</title>
                <style>
                    body { font-family: Arial, sans-serif; }
                    table { width: 100%; border-collapse: collapse; margin-bottom: 20px; }
                    th, td { padding: 8px; border: 1px solid #ddd; text-align: left; }
                    th { background-color: #f2f2f2; }
                    .exercises-header { font-weight: bold; padding-top: 10px; }
                </style>
            </head>
            <body>
                <h1>Sportsmen List</h1>
                <xsl:for-each select="sportsmen/sportsman">
                    <table>
                        <tr>
                            <th>Name</th>
                            <th>Age</th>
                            <th>Profession</th>
                            <th>Height</th>
                            <th>Weight</th>
                            <th>Professional</th>
                            <th>Gender</th>
                        </tr>
                        <tr>
                            <td><xsl:value-of select="name"/></td>
                            <td><xsl:value-of select="age"/></td>
                            <td><xsl:value-of select="profession"/></td>
                            <td><xsl:value-of select="height"/></td>
                            <td><xsl:value-of select="weight"/></td>
                            <td><xsl:value-of select="isProfessional"/></td>
                            <td><xsl:value-of select="gender"/></td>
                        </tr>
                    </table>

                    <table>
                        <tr>
                            <th colspan="6" class="exercises-header">Exercises</th>
                        </tr>
                        <tr>
                            <th>Exercise Name</th>
                            <th>Reps</th>
                            <th>Sets</th>
                            <th>Weight</th>
                            <th>Is Timed</th>
                            <th>Difficulty</th>
                        </tr>
                        <xsl:for-each select="exercises/exercise">
                            <tr>
                                <td><xsl:value-of select="name"/></td>
                                <td><xsl:value-of select="reps"/></td>
                                <td><xsl:value-of select="sets"/></td>
                                <td><xsl:value-of select="weight"/></td>
                                <td><xsl:value-of select="isTimed"/></td>
                                <td><xsl:value-of select="difficulty"/></td>
                            </tr>
                        </xsl:for-each>
                    </table>
                </xsl:for-each>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
