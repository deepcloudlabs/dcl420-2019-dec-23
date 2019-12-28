<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output media-type="application/xml" />
	<xsl:template match="/countries">
		<countries>
			<xsl:for-each select="country">
				<xsl:sort select="name" order="descending" />
				<xsl:if test="continent = 'Asia'">
					<xsl:copy-of select="." />
				</xsl:if>
			</xsl:for-each>
		</countries>
	</xsl:template>
</xsl:stylesheet>